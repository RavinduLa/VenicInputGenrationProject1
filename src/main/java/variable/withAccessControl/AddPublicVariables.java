package variable.withAccessControl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddPublicVariables {
    public static void generate() throws IOException {
        System.out.println("Generating add public variables commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/add-public-variables.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            myWriter.write("Add public variable named "+ data + "\n");
            myWriter.write("Add public property named "+ data + "\n");
            myWriter.write("Add public attribute named "+ data + "\n");
            myWriter.write("Add public variable "+ data + "\n");
            myWriter.write("Add public property "+ data + "\n");
            myWriter.write("Add public attribute "+ data + "\n");

            myWriter.write("Insert public variable named "+ data + "\n");
            myWriter.write("Insert public property named "+ data + "\n");
            myWriter.write("Insert public attribute named "+ data + "\n");
            myWriter.write("Insert public variable "+ data + "\n");
            myWriter.write("Insert public property "+ data + "\n");
            myWriter.write("Insert public attribute "+ data + "\n");

            myWriter.write("Create public variable named "+ data + "\n");
            myWriter.write("Create public property named "+ data + "\n");
            myWriter.write("Create public attribute named "+ data + "\n");
            myWriter.write("Create public variable "+ data + "\n");
            myWriter.write("Create public property "+ data + "\n");
            myWriter.write("Create public attribute "+ data + "\n");

            myWriter.write("Put public variable named "+ data + "\n");
            myWriter.write("Put public property named "+ data + "\n");
            myWriter.write("Put public attribute named "+ data + "\n");
            myWriter.write("Put public variable "+ data + "\n");
            myWriter.write("Put public property "+ data + "\n");
            myWriter.write("Put public attribute "+ data + "\n");



            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
