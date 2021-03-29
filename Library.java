package com.example;

//ex16

import java.util.HashMap;

public class Library
{
    HashMap<String, Integer> m_BooksMap;


    public Library(HashMap<String, Integer> m_BooksMap)
    {
        this.m_BooksMap = m_BooksMap;
    }

    public void addNewBook(String book, Integer shelf)
    {
        m_BooksMap.put(book, shelf);
    }

    public Integer searchForBook(String book)
    {
        if (m_BooksMap.containsKey(book))
        {
            return m_BooksMap.get(book);
        }
        return -1;
    }

    public void removeBook(String book)
    {
        if (m_BooksMap.containsKey(book))
        {
            m_BooksMap.remove(book);
        }
        else
        {
            System.out.println("This book is not in the library!");
        }
    }

    public int countBooks()
    {
        return m_BooksMap.size();
    }

}
