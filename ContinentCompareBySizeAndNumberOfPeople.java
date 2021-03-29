package com.example;

//ex5

import java.util.Comparator;

public class ContinentCompareBySizeAndNumberOfPeople implements Comparator<Continent>
{

    @Override
    public int compare(Continent c1, Continent c2)
    {
        if (Double.compare(c1.getM_size(), c2.getM_size()) == 0)
        {
            return c1.getM_population() - c2.getM_population();
        }
        return Double.compare(c1.getM_size(), c2.getM_size());
    }

}
