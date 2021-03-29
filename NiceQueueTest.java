package com.example;

//ex18

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class NiceQueueTest
{


    @Test
    public void testEnqueue()
    {
        NiceQueue niceQueue = new NiceQueue();
        niceQueue.enqueue(NiceQueueTestData.test_e1);    //0
        niceQueue.enqueue(NiceQueueTestData.test_e2);    //1

        assertEquals(NiceQueueTestData.testEnqueue_e1_expected_result, niceQueue.m_queue.get(0));
        assertEquals(NiceQueueTestData.testEnqueue_e2_expected_result, niceQueue.m_queue.get(1));
    }

    @Test
    public void testNoMoreThanSize()
    {
        NiceQueue niceQueue = new NiceQueue();
        for (int i = 0; i <= 20; i++)
        {
            niceQueue.enqueue(i);
        }
        niceQueue.enqueue(20 * 2);
        assertEquals(20, niceQueue.m_queue.size());
    }

    @Test
    public void testDequeueEmptyReturnNull()
    {
        NiceQueue niceQueue = new NiceQueue();
        assertEquals(NiceQueueTestData.testDequeueEmptyReturnNull_Expected_Result, niceQueue.dequeue());
    }


}
