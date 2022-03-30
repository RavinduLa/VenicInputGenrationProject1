package extension;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeleteExtension {

    public static void generate() throws IOException {
        System.out.println("Generating delete extension commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/output/class/remove-class.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            myWriter.write("Delete extension named "+ data + "\n");
            myWriter.write("Delete extension "+ data + "\n");
            myWriter.write("Remove extension named "+ data + "\n");
            myWriter.write("Remove extension "+ data + "\n");
            myWriter.write("Cut extension named "+ data + "\n");
            myWriter.write("Cut extension "+ data + "\n");
            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
