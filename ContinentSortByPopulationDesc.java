package com.example;

import java.util.Comparator;

public class ContinentSortByPopulationDesc implements Comparator<Continent>
{

    @Override
    public int compare(Continent c1, Continent c2)
    {
        return Double.compare(c2.getM_population(), c1.getM_population());
    }

}
