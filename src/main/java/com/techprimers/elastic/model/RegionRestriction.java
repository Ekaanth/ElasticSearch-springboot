package com.techprimers.elastic.model;

public class RegionRestriction
{
    private String[] allowed;

    public String[] getAllowed ()
    {
        return allowed;
    }

    public void setAllowed (String[] allowed)
    {
        this.allowed = allowed;
    }

    @Override
    public String toString()
    {
        return "[allowed = "+allowed+"]";
    }
}