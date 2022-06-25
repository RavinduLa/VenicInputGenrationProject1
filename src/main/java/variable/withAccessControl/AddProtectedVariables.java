package variable.withAccessControl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddProtectedVariables {
    public static void generate() throws IOException {
        System.out.println("Generating add protected variables commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/add-protected-variables.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            myWriter.write("Add protected variable named "+ data + "\n");
            myWriter.write("Add protected property named "+ data + "\n");
            myWriter.write("Add protected attribute named "+ data + "\n");
            myWriter.write("Add protected variable "+ data + "\n");
            myWriter.write("Add protected property "+ data + "\n");
            myWriter.write("Add protected attribute "+ data + "\n");

            myWriter.write("Insert protected variable named "+ data + "\n");
            myWriter.write("Insert protected property named "+ data + "\n");
            myWriter.write("Insert protected attribute named "+ data + "\n");
            myWriter.write("Insert protected variable "+ data + "\n");
            myWriter.write("Insert protected property "+ data + "\n");
            myWriter.write("Insert protected attribute "+ data + "\n");

            myWriter.write("Create protected variable named "+ data + "\n");
            myWriter.write("Create protected property named "+ data + "\n");
            myWriter.write("Create protected attribute named "+ data + "\n");
            myWriter.write("Create protected variable "+ data + "\n");
            myWriter.write("Create protected property "+ data + "\n");
            myWriter.write("Create protected attribute "+ data + "\n");

            myWriter.write("Put protected variable named "+ data + "\n");
            myWriter.write("Put protected property named "+ data + "\n");
            myWriter.write("Put protected attribute named "+ data + "\n");
            myWriter.write("Put protected variable "+ data + "\n");
            myWriter.write("Put protected property "+ data + "\n");
            myWriter.write("Put protected attribute "+ data + "\n");



            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
