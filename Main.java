package com.example;

// tirgul 22.3.2021

import java.time.LocalDateTime;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {

        //ex1
        LocalDateTime my_bd = LocalDateTime.of(1980, 4, 20, 00, 00);

        //ex2
        /*
        The Comparable interface is used to sort objects (or instances) one way, usually the more intuitive,
        natural or lead ordering, using its compareTo() method.
        A Comparator used to provide multiple sorting options based on the attributes of the objects
        (or instances), possibly in addition to a Comparable class.
        Each separate Comparator would use the compare() method.
        */

        //ex3
        ArrayList<Continent> continents3 = new ArrayList<>();
        continents3.add(new Continent("Africa", 30_370_000, 1_216_000_000));
        continents3.add(new Continent("Europe", 10_180_000, 746_400_000));
        continents3.add(new Continent("Australia", 7_692_000, 25_360_000));

        Collections.sort(continents3);

        continents3.stream().forEach(System.out::println);
        System.out.println();

        //ex4
        ArrayList<Continent> continents4 = new ArrayList<>();
        continents4.add(new Continent("Africa", 30_370_000, 1_216_000_000));
        continents4.add(new Continent("Europe", 10_180_000, 746_400_000));
        continents4.add(new Continent("Australia", 7_692_000, 25_360_000));

        Collections.sort(continents4);
        System.out.println("=== Sorted by Name ===");
        continents4.stream().forEach(System.out::println);

        Collections.sort(continents4, new ContinentSortBySizeAsc());
        System.out.println("=== Sorted by Size (Ascending) ===");
        continents4.stream().forEach(System.out::println);

        Collections.sort(continents4, new ContinentSortByPopulationAsc());
        System.out.println("=== Sorted by Population (Ascending) ===");
        continents4.stream().forEach(System.out::println);

        Collections.sort(continents4, new ContinentSortBySizeDesc());
        System.out.println("=== Sorted by Size (Descending) ===");
        continents4.stream().forEach(System.out::println);

        Collections.sort(continents4, new ContinentSortByPopulationDesc());
        System.out.println("=== Sorted by Population (Descending) ===");
        continents4.stream().forEach(System.out::println);

        System.out.println();

        //ex5
        Collections.sort(continents4, new ContinentCompareBySizeAndNumberOfPeople());
        System.out.println("=== Sorted by Size and Population (Ascending) ===");
        continents4.stream().forEach(System.out::println);

        System.out.println();

        //ex7
        // Collections types: Lists (including ArrayList and Stacks), Queues, Sets, HashMaps

        //ex8
        // In Java the <> sign is called generics. It allows the use of any type/collection as a parameter for
        // classes, interfaces and methods, except for primitive types (e.g. int).

        //ex9
        /* Primitive types are independent types, whereas objects inherit from the Object class. This means
        objects by definition have access to Object's methods whereas primitive types do not include
        inherited methods. Primitive types are immutable ("pre-defined") as so the user cannot
        re-define or change them in use, contrary to objects.
        */

        //ex10
        // Stacks are containers to which objects are inserted and removed using LIFO (last in, first out).
        // For Queues, objects use FIFO (first in, first out).

        //ex11
        Stack<String> str11 = new Stack<>();
        str11.add("One");     //0
        str11.add("Two");     //1
        str11.add("Three");   //2

        str11.pop();
        System.out.println(str11);
        str11.peek();
        System.out.println(str11);
        //pop (or remove) deletes the object at the top of the stack, whereas
        //peek shows (returns) said object without removing it.

        //ex12
        Queue<Double> doubles12 = new ArrayDeque<>();
        doubles12.add(2.34);
        doubles12.add(5.67);
        doubles12.add(8.90);

        doubles12.poll();
        System.out.println(doubles12);
        doubles12.peek();
        System.out.println(doubles12);
        doubles12.clear();
        System.out.println(doubles12);

        //ex14
        // A Set is a collection which does not contain (will not accept) duplicate objects.

        //ex15
        // A HashMap represents the storing of objects which contain a key and a value, mapping
        // the connections between the two elements. Several keys can point to the same value, but
        // a value can only be connected to one key.

        //ex17
        // Generics allow us to use different types of collections even if we don't know in advance which
        // would be used, which further allows to implement and use methods per type safely.

        //ex20
        // Exceptions can be prevented from crashing the programme run using try-catch:
        // Try defines the part of the code that is being tested for errors/causing exceptions in that code, and
        // Catch includes a part of the code to be executed in case of such an error.

        //ex21
        int x = 0;
        int y = 1;
        try
        {
           int z = y / x;
        }
        catch (Exception e)
        {
            System.out.println("Oops...");
        }
/*SQL exercises

        //ex23
        CREATE TABLE PRODUCTS(
        ID INT PRIMARY KEY NOT NULL,
        NAME TEXT NOT NULL,
        PRICE REAL
        );

        //ex24
        INSERT INTO PRODUCTS (ID,NAME,PRICE)
        VALUES (1, 'Product 1', 10.99);
        INSERT INTO PRODUCTS (ID,NAME,PRICE)
        VALUES (2, 'Product 2', 22.99);

        SELECT * FROM PRODUCTS

        DELETE FROM PRODUCTS
        WHERE ID = 1

        UPDATE PRODUCTS
        SET PRICE = 33.99
        WHERE ID = 2

*/


    }

}
