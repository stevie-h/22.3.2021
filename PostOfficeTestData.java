package com.example;

//ex13

public class PostOfficeTestData
{

    static final Box testPostOffice_b0 = new Box("BOX C 0", "OWNER 0");
    static final Box testPostOffice_b1 = new Box("BOX C 1", "OWNER 1");
    static final Box testPostOffice_b2 = new Box("BOX C 2", "OWNER 2");
    static final Box testPostOffice_b3 = new Box("BOX C 3", "OWNER 3");
    static final Box testPostOffice_b4 = new Box("BOX C 4", "OWNER 4");

    static final Box testNewBoxArrivedContent_new_b = new Box("NEW BOX C", "OWNER NEW");
    static final String testPostOfficeContent_expected_result = "NEW BOX C";

    static final Box testNewBoxArrivedOwner_new_b = new Box("NEW BOX C", "OWNER NEW");
    static final String testNewBoxArrivedOwner_expected_result = "OWNER NEW";

    static final String testServeNextCustomer_expected_result = testPostOffice_b0.getM_content();
    //top of queue

}
