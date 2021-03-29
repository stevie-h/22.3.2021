package com.example;

//ex4

import java.util.Comparator;

public class ContinentSortBySizeAsc implements Comparator<Continent>
{

@Override
    public int compare(Continent c1, Continent c2)
    {
        return Double.compare(c1.getM_size(), c2.getM_size());
    }


}
