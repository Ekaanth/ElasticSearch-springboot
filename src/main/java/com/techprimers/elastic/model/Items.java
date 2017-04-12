package com.techprimers.elastic.model;

public class Items 
{
	
    private String id;

    private String etag;

    private ContentDetails contentDetails;

    private String kind;

    private Statistics statistics;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getEtag ()
    {
        return etag;
    }

    public void setEtag (String etag)
    {
        this.etag = etag;
    }

    public ContentDetails getContentDetails ()
    {
        return contentDetails;
    }

    public void setContentDetails (ContentDetails contentDetails)
    {
        this.contentDetails = contentDetails;
    }

    public String getKind ()
    {
        return kind;
    }

    public void setKind (String kind)
    {
        this.kind = kind;
    }

    public Statistics getStatistics ()
    {
        return statistics;
    }

    public void setStatistics (Statistics statistics)
    {
        this.statistics = statistics;
    }

    @Override
    public String toString()
    {
        return "[id = "+id+", etag = "+etag+", contentDetails = "+contentDetails+", kind = "+kind+", statistics = "+statistics+"]";
    }

    
}

	