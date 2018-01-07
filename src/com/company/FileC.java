package com.company;


//sina ebrahimi data structure project


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileC {

    String path ;
    private String regexpattern = "([0-9]+)\t([0-9]+)\t([0-9]+)";
    int numberofline , numberofyal, numberofvertex =0;
    FileDetails fileDetails ;

    public FileC(String path) throws IOException {
        this.path = path;
        numberofline = countLines(path);
        numberofyal = numberofline - 2;
    }

    public FileDetails  ReadFile() {
        Saver[] saverc = new Saver[numberofyal];
        try {
            BufferedReader bf = new BufferedReader(new FileReader(path));
            String line ;
            Pattern pattern = Pattern.compile(regexpattern);
            int i = 0;
            while ((line = bf.readLine()) != null) {

                if (i > 1) {
                    Matcher matcher = pattern.matcher(line);
                    matcher.matches();
                    saverc[i-2] = new Saver(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)));
                }

                else if (i==0) {
                    Pattern pattern2 = Pattern.compile("[0-9]+");
                    Matcher matcher2 = pattern2.matcher(line);
                    matcher2.matches();
                    numberofvertex = Integer.parseInt(matcher2.group(0));
                }
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        fileDetails = new FileDetails(numberofvertex , numberofyal, saverc);
        return fileDetails;
    }

    private int countLines(String filename) throws IOException {
        LineNumberReader reader  = new LineNumberReader(new FileReader(filename));
        int cnt = 0;
        String lineRead = "";
        while ((lineRead = reader.readLine()) != null) {}

        cnt = reader.getLineNumber();
        reader.close();
        return cnt;
    }
}
