package com.example;

//ex13

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class PostOfficeTest
{

    PostOffice p = new PostOffice(PostOfficeTestData.testPostOffice_b0, PostOfficeTestData.testPostOffice_b1,
            PostOfficeTestData.testPostOffice_b2, PostOfficeTestData.testPostOffice_b3,
            PostOfficeTestData.testPostOffice_b4);

    @Test
    public void testNewBoxArrivedContent()
    {
        p.newBoxArrived(PostOfficeTestData.testNewBoxArrivedContent_new_b);
        assertEquals(PostOfficeTestData.testPostOfficeContent_expected_result,
                p.m_boxes.get(p.m_boxes.size() - 1).getM_content());
    }

    @Test
    public void testNewBoxArrivedOwner()
    {
        p.newBoxArrived(PostOfficeTestData.testNewBoxArrivedOwner_new_b);
        assertEquals(PostOfficeTestData.testNewBoxArrivedOwner_expected_result,
                p.m_boxes.get(p.m_boxes.size() - 1).getM_owner());
    }

    @Test
    public void testServeNextCustomer()
    {
        String actual_result = p.serveNextCustomer();
        assertEquals(PostOfficeTestData.testServeNextCustomer_expected_result, actual_result);
    }

}
