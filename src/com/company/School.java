package com.company;

/**
 * Created by ch983 on 11/13/17.
 */
public class School {
String name;
    int MathScore;
    int ReadingScore;
    int WritingScore;
    public School(String school, int math, int reading, int writing) {
        name = school;
        MathScore = math;
        ReadingScore = reading;
        WritingScore = writing;
    }
    public int getAverage() {
        return (MathScore+ReadingScore+WritingScore);
    }
}