package com.example.android.quakereport;

/**
 *  An {@Link Earthquake} object contains data of a single earthquake
 */
public class Earthquake {
    private double mMag;
    private String mPlace;
    private long mTimeInMilliseconds;
    private String mUrl;

    /**
     *
     * @param mag magnitude
     * @param place location
     * @param timeInMilliseconds time
     * @param url url
     */
    public Earthquake(double mag, String place, long timeInMilliseconds, String url) {
        mMag = mag;
        mPlace = place;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMag() {
        return mMag;
    }

    public String getPlace() {
        return mPlace;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() { return mUrl; }
}



