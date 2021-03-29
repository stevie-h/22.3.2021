package com.example;

//ex16

public class LibraryTestData
{
    static final String mapNew_Name_Book1 = "BOOK 1";
    static final Integer mapNew_Shelf_Book1 = 1;
    static final String mapNew_Name_Book2 = "BOOK 2";
    static final Integer mapNew_Shelf_Book2 = 2;
    static final String mapNew_Name_Book3 = "BOOK 3";
    static final Integer mapNew_Shelf_Book3 = 3;

    static final Integer testSearchBooksBook1_Expected_Result = mapNew_Shelf_Book1;
    static final Integer testSearchBooksBook2_Expected_Result = mapNew_Shelf_Book2;
    static final Integer testSearchBooksBook3_Expected_Result = mapNew_Shelf_Book3;

    static final String testSearchBookDoesNotExist_Name_BookDoesNotExist = "NO SUCH BOOK";
    static final Integer testSearchBookDoesNotExist_Expected_Result = -1;

}
