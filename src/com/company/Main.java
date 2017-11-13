package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(new File("scores.txt"));
        String[] schoolInfo = new String[450];
        School[] schools = new School[450];
        for (int i=0; i<schoolInfo.length; i++) {
            schoolInfo[i] = null;
        }
        for (int i=0; i<schools.length; i++) {
            schools[i] = null;
        }
        for (int i=0; scanner.hasNext(); i++) {
            schoolInfo[i] = scanner.nextLine();
        }
        scanner.close();
        for (int i=0; i<schoolInfo.length; i++) {
            if (schoolInfo != null) {
                Scanner scanner2 = new Scanner(schoolInfo[i]);
                int x;
                for(x=0; scanner2.hasNext(); x++) {
                    scanner2.next();
                }
                if (x<22) {
                    schoolInfo[i] = null;
                }
            }
        }
        for (int i=1; i<schoolInfo.length; i++) {
            Scanner scanner3 = new Scanner(schoolInfo[i]);
            if(schoolInfo[i] != null){
                String name = scanner3.next();
                for(int j = 0; j < 18; j++) {
                    scanner3.next();
                }
                int math = scanner3.nextInt();
                int reading = scanner3.nextInt();
                int writing = scanner3.nextInt();
                schools[i] = new School(name, math, reading, writing);
            }

        }
        for (int i= 0; i<schools.length; i++){
            if (schools[i] != null){
                System.out.println(schools[i].name + ", " + schools[i].getAverage());;
            }
        }
    }
}
