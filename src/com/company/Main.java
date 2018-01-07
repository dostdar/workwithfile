package com.company;

import java.io.*;

//sina ebrahimi data structure project

public class Main {

    public static void main(String[] args) throws IOException {

        FileC fileC = new FileC("C:\\Users\\sina\\Desktop\\mst\\mstin.txt");
        FileDetails fileDetails;
        fileDetails = fileC.ReadFile();
        DisjointSet ds = new DisjointSet(fileDetails.numberofvertex+1);
        int counter = 0;
        Saver[] sa = new Saver[fileDetails.numberofvertex-1];
        for (Saver s:fileDetails.sortedyals) {
            if (ds.findset(s.start) != ds.findset(s.end)) {
                sa[counter] = s ;
                ds.union(s.start , s.end);
                counter++;
            }

        }
        for (Saver s : sa) {
            System.out.println(s);

        }





        

//        System.out.println( fileDetails.numberofvertex + "\t" + fileDetails.numberofvertex);
//        for (int i = 5037; i >5000; i--) {
//            System.out.println(fileDetails.sortedyals[i]);
//
//        }


















//        Saver[] saverc = new Saver[countLines("C:\\Users\\sina\\Desktop\\mst\\mstin.txt")];
//
//        try {
//            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\sina\\Desktop\\mst\\mstin.txt"));
//            String line ;
//            Pattern pattern = Pattern.compile("([0-9]+) ([0-9]+) ([0-9]+)");
//            int i = 0;
//            while ((line = bf.readLine()) != null) {
//
//                if (i > 1) {
//                    Matcher matcher = pattern.matcher(line);
//                    matcher.matches();
//                    System.out.println(matcher.group(1));
//                    saverc[i] = new Saver(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)));
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }







//
//        String path = "C:\\Users\\sina\\Desktop\\Stack\\b.txt" ;
//        FileInputStream in  = null;
//        FileOutputStream out = null;
//        try {
//            out =new FileOutputStream(path);
//            OutputStreamWriter writer = new OutputStreamWriter(out /*append if true*/);
//
//            writer.write("hello sina");
//            writer.flush();
//            writer.close();
//
//            in  =  new FileInputStream(path);
//            int c ;
//            while ((c =in.read())!=-1) {
//
//                System.out.print((char) c);
//
//            }
//
//        }catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }









//        try {
//            FileInputStream input = null;
//            FileOutputStream output = null;
//            String path = "C:\\Users\\sina\\Desktop\\Stack\\m.jpg" ;
//            String path2 = "C:\\Users\\sina\\Desktop\\Stack\\m2.jpg" ;
//            input  = new FileInputStream(path) ;
//            output = new FileOutputStream(path2);
////            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(output);
////            InputStreamReader inputStreamReader = new InputStreamReader(input);
////            int c ;
////            while ((c = inputStreamReader.read()) != -1) {
////                //outputStreamWriter.write(c);
////            }
//            int cc;
//            while ((cc = input.read()) != -1)
//                    output.write(cc);
//            input.close();
//            output.flush();
//            output.close();
//
//
//
//        }catch (Exception e) {
//
//        }

    }

//    static int countLines(String filename) throws IOException {
//        LineNumberReader reader  = new LineNumberReader(new FileReader(filename));
//        int cnt = 0;
//        String lineRead = "";
//        while ((lineRead = reader.readLine()) != null) {}
//
//        cnt = reader.getLineNumber();
//        reader.close();
//        return cnt;
//    }
}
