package variable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DecrementVariable {
    public static void generate() throws IOException {
        System.out.println("Generating decrement variables commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/decrement-variables.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();

            //decrement by one
            myWriter.write("decrement variable named "+ data + " by one" + "\n");
            myWriter.write("decrement property named "+ data + " by one" +  "\n");
            myWriter.write("decrement attribute named "+ data +" by one" +  "\n");
            myWriter.write("decrement variable "+ data +" by one" +  "\n");
            myWriter.write("decrement property "+ data +" by one" +  "\n");
            myWriter.write("decrement attribute "+ data +" by one" +  "\n");

            //decrement by five
            myWriter.write("decrement variable named "+ data + " by five" + "\n");
            myWriter.write("decrement property named "+ data + " by five" +  "\n");
            myWriter.write("decrement attribute named "+ data +" by five" +  "\n");
            myWriter.write("decrement variable "+ data +" by five" +  "\n");
            myWriter.write("decrement property "+ data +" by five" +  "\n");
            myWriter.write("decrement attribute "+ data +" by five" +  "\n");

            //decrement  by seven
            myWriter.write("decrement variable named "+ data + " by seven" + "\n");
            myWriter.write("decrement property named "+ data + " by seven" +  "\n");
            myWriter.write("decrement attribute named "+ data +" by seven" +  "\n");
            myWriter.write("decrement variable "+ data +" by seven" +  "\n");
            myWriter.write("decrement property "+ data +" by seven" +  "\n");
            myWriter.write("decrement attribute "+ data +" by seven" +  "\n");

            //decrement by ten
            myWriter.write("decrement variable named "+ data + " by ten" + "\n");
            myWriter.write("decrement property named "+ data + " by ten" +  "\n");
            myWriter.write("decrement attribute named "+ data +" by ten" +  "\n");
            myWriter.write("decrement variable "+ data +" by ten" +  "\n");
            myWriter.write("decrement property "+ data +" by ten" +  "\n");
            myWriter.write("decrement attribute "+ data +" by ten" +  "\n");

            //decrement  by fifty
            myWriter.write("decrement variable named "+ data + " by fifty" + "\n");
            myWriter.write("decrement property named "+ data + " by fifty" +  "\n");
            myWriter.write("decrement attribute named "+ data +" by fifty" +  "\n");
            myWriter.write("decrement variable "+ data +" by fifty" +  "\n");
            myWriter.write("decrement property "+ data +" by fifty" +  "\n");
            myWriter.write("decrement attribute "+ data +" by fifty" +  "\n");

            //decrement by hundred
            myWriter.write("decrement variable named "+ data + " by hundred" + "\n");
            myWriter.write("decrement property named "+ data + " by hundred" +  "\n");
            myWriter.write("decrement attribute named "+ data +" by hundred" +  "\n");
            myWriter.write("decrement variable "+ data +" by hundred" +  "\n");
            myWriter.write("decrement property "+ data +" by hundred" +  "\n");
            myWriter.write("decrement attribute "+ data +" by hundred" +  "\n");





            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
