package com.example;

//ex13

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class PostOffice
{
    ArrayList<Box> m_boxes;
    Queue<String> m_customers;

    //ctor
    public PostOffice(Box b0, Box b1, Box b2, Box b3, Box b4)
    {
        this.m_boxes = new ArrayList<>(5);
        this.m_customers = new ArrayDeque<>();
        //adds 5 boxes to the m_boxes ArrayList
        m_boxes.add(b0);
        m_boxes.add(b1);
        m_boxes.add(b2);
        m_boxes.add(b3);
        m_boxes.add(b4);
        //adds the names of the owners to the m_customers queue
        m_customers.add(m_boxes.get(0).getM_owner());
        m_customers.add(m_boxes.get(1).getM_owner());
        m_customers.add(m_boxes.get(2).getM_owner());
        m_customers.add(m_boxes.get(3).getM_owner());
        m_customers.add(m_boxes.get(4).getM_owner());
    }


    public void newBoxArrived(Box box)
    {
        m_boxes.add(box);
    }

    public void newCustomerArrived (String customer)
    {
        m_customers.add(customer);
    }

    public String serveNextCustomer()
    {
        String next_customer = m_customers.poll();
        System.out.println("Next customer is: " + next_customer);
        String box_content = m_boxes.get(0).getM_content();
        System.out.println("Box contains: " + box_content);
        m_boxes.remove(0);
        return box_content;
    }


}
