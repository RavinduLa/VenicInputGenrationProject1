package variable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IterateArrays2 {
    public static void generate() throws IOException, FileNotFoundException {

        System.out.println("Generating iterate arrays 2 commands");

        System.out.println("Creating scanner, reader, writer and file objects");

        //initialize files, readers and writers
        File nounFile = new File("src/nounlist.txt");
        File verbFile = new File("src/verblist.txt");
        FileWriter myWriter = new FileWriter("src/iterate-arrays2.txt");
        Scanner nounReader = new Scanner(nounFile);
        Scanner verbReader = new Scanner(verbFile);
        System.out.println("Created scanner, reader, writer and file objects");

        //define a range for the random number
        int max = 1000;
        int min = 2;
        int range = max - min + 1;

        //get the verbs into a list
        List<String> verbList = new ArrayList<>();
        while (verbReader.hasNextLine()){
            String data = verbReader.nextLine();
            verbList.add(data);
        }

        System.out.println("Created verb list");
        verbReader.close();
        System.out.println("Closed verb reader");

        System.out.println("Generating commands");
        //go through nouns and write variants of iterate variables to the file
        while (nounReader.hasNextLine()){
            String data = nounReader.nextLine();
            int randomNumber = (int)(Math.random() * range) + min;
            myWriter.write("Loop through " +data +"\n");
            myWriter.write("Loop through " +data + " array" +"\n");
            myWriter.write("Loop through " +data + " and call " + verbList.get(randomNumber) +"\n");
            myWriter.write("Loop through " +data + " array and call " +  verbList.get(randomNumber) + "\n");
            myWriter.write("Loop through " +data + " and call " + verbList.get(randomNumber) + " method" +"\n");
            myWriter.write("Loop through " +data + " array and call " +  verbList.get(randomNumber) + " method" + "\n");
            myWriter.write("Loop through " +data + " and call " + verbList.get(randomNumber) + " function" +"\n");
            myWriter.write("Loop through " +data + " array and call " +  verbList.get(randomNumber) + " function" + "\n");

            myWriter.write("Loop " +data +"\n");
            myWriter.write("Loop " +data + " array" +"\n");
            myWriter.write("Loop " +data + " and call " + verbList.get(randomNumber) +"\n");
            myWriter.write("Loop " +data + " array and call " +  verbList.get(randomNumber) + "\n");
            myWriter.write("Loop " +data + " and call " + verbList.get(randomNumber) + " method" +"\n");
            myWriter.write("Loop " +data + " array and call " +  verbList.get(randomNumber) + " method" + "\n");
            myWriter.write("Loop " +data + " and call " + verbList.get(randomNumber) + " function" +"\n");
            myWriter.write("Loop " +data + " array and call " +  verbList.get(randomNumber) + " function" + "\n");

            myWriter.write("Iterate " +data +"\n");
            myWriter.write("Iterate " +data + " array" +"\n");
            myWriter.write("Iterate " +data + " and call " + verbList.get(randomNumber) +"\n");
            myWriter.write("Iterate " +data + " array and call " +  verbList.get(randomNumber) + "\n");
            myWriter.write("Iterate " +data + " and call " + verbList.get(randomNumber) + " method" +"\n");
            myWriter.write("Iterate " +data + " array and call " +  verbList.get(randomNumber) + " method" + "\n");
            myWriter.write("Iterate " +data + " and call " + verbList.get(randomNumber) + " function" +"\n");
            myWriter.write("Iterate " +data + " array and call " +  verbList.get(randomNumber) + " function" + "\n");

            myWriter.write("Go " +data +"\n");
            myWriter.write("Go " +data + " array" +"\n");
            myWriter.write("Go " +data + " and call " + verbList.get(randomNumber) +"\n");
            myWriter.write("Go " +data + " array and call " +  verbList.get(randomNumber) + "\n");
            myWriter.write("Go " +data + " and call " + verbList.get(randomNumber) + " method" +"\n");
            myWriter.write("Go " +data + " array and call " +  verbList.get(randomNumber) + " method" + "\n");
            myWriter.write("Go " +data + " and call " + verbList.get(randomNumber) + " function" +"\n");
            myWriter.write("Go " +data + " array and call " +  verbList.get(randomNumber) + " function" + "\n");

        }

        System.out.println("Generated commands for iterate arrays 2");

        myWriter.close();
        nounReader.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
