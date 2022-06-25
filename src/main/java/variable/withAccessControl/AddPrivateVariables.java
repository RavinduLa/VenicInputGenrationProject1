package variable.withAccessControl;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddPrivateVariables {
    public static void generate() throws IOException {
        System.out.println("Generating add private variables commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/add-private-variables.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            myWriter.write("Add private variable named "+ data + "\n");
            myWriter.write("Add private property named "+ data + "\n");
            myWriter.write("Add private attribute named "+ data + "\n");
            myWriter.write("Add private variable "+ data + "\n");
            myWriter.write("Add private property "+ data + "\n");
            myWriter.write("Add private attribute "+ data + "\n");

            myWriter.write("Insert private variable named "+ data + "\n");
            myWriter.write("Insert private property named "+ data + "\n");
            myWriter.write("Insert private attribute named "+ data + "\n");
            myWriter.write("Insert private variable "+ data + "\n");
            myWriter.write("Insert private property "+ data + "\n");
            myWriter.write("Insert private attribute "+ data + "\n");

            myWriter.write("Create private variable named "+ data + "\n");
            myWriter.write("Create private property named "+ data + "\n");
            myWriter.write("Create private attribute named "+ data + "\n");
            myWriter.write("Create private variable "+ data + "\n");
            myWriter.write("Create private property "+ data + "\n");
            myWriter.write("Create private attribute "+ data + "\n");

            myWriter.write("Put private variable named "+ data + "\n");
            myWriter.write("Put private property named "+ data + "\n");
            myWriter.write("Put private attribute named "+ data + "\n");
            myWriter.write("Put private variable "+ data + "\n");
            myWriter.write("Put private property "+ data + "\n");
            myWriter.write("Put private attribute "+ data + "\n");



            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
