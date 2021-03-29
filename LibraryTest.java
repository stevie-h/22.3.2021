package com.example;

//ex16

import org.junit.Test;
import java.util.HashMap;
import static junit.framework.TestCase.assertEquals;

public class LibraryTest
{
    @Test
    public void testSearchBooksBook1()
    {
        Library library = new Library(new HashMap<>());
        library.m_BooksMap.put(LibraryTestData.mapNew_Name_Book1, LibraryTestData.mapNew_Shelf_Book1);
        library.m_BooksMap.put(LibraryTestData.mapNew_Name_Book2, LibraryTestData.mapNew_Shelf_Book2);
        library.m_BooksMap.put(LibraryTestData.mapNew_Name_Book3, LibraryTestData.mapNew_Shelf_Book3);
        Integer actual_result = library.searchForBook(LibraryTestData.mapNew_Name_Book1);
        assertEquals(LibraryTestData.testSearchBooksBook1_Expected_Result, actual_result);
    }

    @Test
    public void testSearchBooksBook2()
    {
        Library library = new Library(new HashMap<>());
        library.m_BooksMap.put(LibraryTestData.mapNew_Name_Book1, LibraryTestData.mapNew_Shelf_Book1);
        library.m_BooksMap.put(LibraryTestData.mapNew_Name_Book2, LibraryTestData.mapNew_Shelf_Book2);
        library.m_BooksMap.put(LibraryTestData.mapNew_Name_Book3, LibraryTestData.mapNew_Shelf_Book3);
        Integer actual_result = library.searchForBook(LibraryTestData.mapNew_Name_Book2);
        assertEquals(LibraryTestData.testSearchBooksBook2_Expected_Result, actual_result);
    }

    @Test
    public void testSearchBooksBook3()
    {
        Library library = new Library(new HashMap<>());
        library.m_BooksMap.put(LibraryTestData.mapNew_Name_Book1, LibraryTestData.mapNew_Shelf_Book1);
        library.m_BooksMap.put(LibraryTestData.mapNew_Name_Book2, LibraryTestData.mapNew_Shelf_Book2);
        library.m_BooksMap.put(LibraryTestData.mapNew_Name_Book3, LibraryTestData.mapNew_Shelf_Book3);
        Integer actual_result = library.searchForBook(LibraryTestData.mapNew_Name_Book3);
        assertEquals(LibraryTestData.testSearchBooksBook3_Expected_Result, actual_result);
    }

    @Test
    public void testSearchBookDoesNotExist()
    {
        Library library = new Library(new HashMap<>());
        library.m_BooksMap.put(LibraryTestData.mapNew_Name_Book1, LibraryTestData.mapNew_Shelf_Book1);
        library.m_BooksMap.put(LibraryTestData.mapNew_Name_Book2, LibraryTestData.mapNew_Shelf_Book2);
        library.m_BooksMap.put(LibraryTestData.mapNew_Name_Book3, LibraryTestData.mapNew_Shelf_Book3);
        Integer actual_result = library.searchForBook(LibraryTestData.testSearchBookDoesNotExist_Name_BookDoesNotExist);
        assertEquals(LibraryTestData.testSearchBookDoesNotExist_Expected_Result, actual_result);
    }



}