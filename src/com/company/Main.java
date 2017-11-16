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
            if (schoolInfo[i] != null) {
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
            if(schoolInfo[i] != null){
                Scanner scanner3 = new Scanner(schoolInfo[i]);
                scanner3.useDelimiter("\t");
                scanner3.next();
                String name = scanner3.next();
                for(int j = 0; j < 16; j++) {
                    scanner3.next();
                }
                int math = 0;
                int reading = 0;
                int writing = 0;
                if (scanner3.hasNextInt()){
                    math = scanner3.nextInt();
                }
                if (scanner3.hasNextInt()) {
                    reading = scanner3.nextInt();
                }
                if (scanner3.hasNextInt()) {
                    writing = scanner3.nextInt();
                }
                schools[i] = new School(name, math, reading, writing);
               // System.out.println(math);
            }

        }
        for (int i= 0; i<schools.length; i++){
            if (schools[i] != null){
                //System.out.println(schools[i].name + ", " + schools[i].getAverage());;

            }
        }
        System.out.println(NYAverage(schools));
    }
    public static int NYAverage(School[]schools){
        int count= 0;
        int sum= 0;
        for (int i = 0; i<schools.length; i++){
            if (schools[i] != null){
                if (schools[i].getAverage() != 0) {
                    sum += schools[i].getAverage();
                    count++;
                }
            }

        }
        return sum/count;

    }
}
