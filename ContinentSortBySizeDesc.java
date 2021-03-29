package com.example;

import java.util.Comparator;

public class ContinentSortBySizeDesc implements Comparator<Continent>
{

    @Override
    public int compare(Continent c1, Continent c2)
    {
        return Double.compare(c2.getM_size(), c1.getM_size());
    }


}
