package com.netcracker.chapter2;



import au.com.bytecode.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClassCSV {

    public void readFile() throws IOException {
        CSVReader reader = new CSVReader(new FileReader("D:\\Homework2\\src\\com\\netcracker\\addresses.csv"));
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            for (String cell : nextLine) {
                System.out.print(cell + " " );
            }
            System.out.println(nextLine[0] + nextLine[1] + "etc...");
        }
    }
    }


