package classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeleteClass {

    public static void generate() throws IOException {
        System.out.println("Generating delete class commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/output/class/remove-class.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            myWriter.write("Delete class named "+ data + "\n");
            myWriter.write("Delete class "+ data + "\n");
            myWriter.write("Remove class named "+ data + "\n");
            myWriter.write("Remove class "+ data + "\n");
            myWriter.write("Cut class named "+ data + "\n");
            myWriter.write("Cut class "+ data + "\n");
            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
