package extension;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateExtension {

    public static void generate() throws IOException {
        System.out.println("Generating add extension commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/output/extension/add-extension.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            myWriter.write("Add extension named "+ data + "\n");
            myWriter.write("Add extension "+ data + "\n");
            myWriter.write("Insert extension named "+ data + "\n");
            myWriter.write("Insert extension "+ data + "\n");
            myWriter.write("Put extension named "+ data + "\n");
            myWriter.write("Put extension "+ data + "\n");
            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
