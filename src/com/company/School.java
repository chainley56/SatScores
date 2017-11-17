package com.company;

/**
 * Created by ch983 on 11/13/17.
 */
public class School {
String name;
    int MathScore;
    int ReadingScore;
    int WritingScore;
    double percentTested;
    public School(String school, int math, int reading, int writing, double percentStudents) {
        name = school;
        MathScore = math;
        ReadingScore = reading;
        WritingScore = writing;
        percentTested = percentStudents;
    }
    public int getAverage() {
        return (MathScore+ReadingScore+WritingScore);
    }
}