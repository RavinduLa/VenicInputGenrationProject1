package variable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IncrementVariables {
    public static void generate() throws IOException {
        System.out.println("Generating increment variables commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/increment-variables.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();

            //increment by one
            myWriter.write("Increment variable named "+ data + " by one" + "\n");
            myWriter.write("Increment property named "+ data + " by one" +  "\n");
            myWriter.write("Increment attribute named "+ data +" by one" +  "\n");
            myWriter.write("Increment variable "+ data +" by one" +  "\n");
            myWriter.write("Increment property "+ data +" by one" +  "\n");
            myWriter.write("Increment attribute "+ data +" by one" +  "\n");

            //increment by five
            myWriter.write("Increment variable named "+ data + " by five" + "\n");
            myWriter.write("Increment property named "+ data + " by five" +  "\n");
            myWriter.write("Increment attribute named "+ data +" by five" +  "\n");
            myWriter.write("Increment variable "+ data +" by five" +  "\n");
            myWriter.write("Increment property "+ data +" by five" +  "\n");
            myWriter.write("Increment attribute "+ data +" by five" +  "\n");

            //increment  by seven
            myWriter.write("Increment variable named "+ data + " by seven" + "\n");
            myWriter.write("Increment property named "+ data + " by seven" +  "\n");
            myWriter.write("Increment attribute named "+ data +" by seven" +  "\n");
            myWriter.write("Increment variable "+ data +" by seven" +  "\n");
            myWriter.write("Increment property "+ data +" by seven" +  "\n");
            myWriter.write("Increment attribute "+ data +" by seven" +  "\n");

            //increment by ten
            myWriter.write("Increment variable named "+ data + " by ten" + "\n");
            myWriter.write("Increment property named "+ data + " by ten" +  "\n");
            myWriter.write("Increment attribute named "+ data +" by ten" +  "\n");
            myWriter.write("Increment variable "+ data +" by ten" +  "\n");
            myWriter.write("Increment property "+ data +" by ten" +  "\n");
            myWriter.write("Increment attribute "+ data +" by ten" +  "\n");

            //increment  by fifty
            myWriter.write("Increment variable named "+ data + " by fifty" + "\n");
            myWriter.write("Increment property named "+ data + " by fifty" +  "\n");
            myWriter.write("Increment attribute named "+ data +" by fifty" +  "\n");
            myWriter.write("Increment variable "+ data +" by fifty" +  "\n");
            myWriter.write("Increment property "+ data +" by fifty" +  "\n");
            myWriter.write("Increment attribute "+ data +" by fifty" +  "\n");

            //increment by hundred
            myWriter.write("Increment variable named "+ data + " by hundred" + "\n");
            myWriter.write("Increment property named "+ data + " by hundred" +  "\n");
            myWriter.write("Increment attribute named "+ data +" by hundred" +  "\n");
            myWriter.write("Increment variable "+ data +" by hundred" +  "\n");
            myWriter.write("Increment property "+ data +" by hundred" +  "\n");
            myWriter.write("Increment attribute "+ data +" by hundred" +  "\n");





            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
