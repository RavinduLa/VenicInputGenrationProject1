package classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddClass {
    public static void generate() throws IOException {
        System.out.println("Generating add class commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/output/class/add-class.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            myWriter.write("Add class named "+ data + "\n");
            myWriter.write("Add class "+ data + "\n");
            myWriter.write("Insert class named "+ data + "\n");
            myWriter.write("Insert class "+ data + "\n");
            myWriter.write("Put class named "+ data + "\n");
            myWriter.write("Put class "+ data + "\n");
            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
