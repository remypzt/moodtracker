package remy.pouzet.moodtracker.model;

/**
 * Created by Remy Pouzet on 29/06/2019.
 */


public class Mood
{
    private int mCounter;
    private String mComment;
    private String mDate;
    private int mIndex;

    public Mood(int counter, String comment, String date, int index)
    {
        mCounter = counter;
        mComment = comment;
        mDate = date;
        mIndex = index;
    }


    public int getCounter()
    {
        return mCounter;
    }

    public void setCounter(int counter)
    {
        mCounter = counter;
    }

    public String getComment()
    {
        return mComment;
    }

    public void setComment(String comment)
    {
        mComment = comment;
    }

    public String getDate()
    {
        return mDate;
    }

    public void setDate(String date)
    {
        mDate = date;
    }

    public int getIndex()
    {
        return mIndex;
    }

    public void setIndex(int index)
    {
        mIndex = index;
    }
}
