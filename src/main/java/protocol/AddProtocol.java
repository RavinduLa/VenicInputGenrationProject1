package protocol;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddProtocol {
    public static void generate() throws IOException {
        System.out.println("Generating add protocol commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/output/protocol/add-protocol.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            myWriter.write("Add protocol named "+ data + "\n");
            myWriter.write("Add protocol "+ data + "\n");
            myWriter.write("Insert protocol named "+ data + "\n");
            myWriter.write("Insert protocol "+ data + "\n");
            myWriter.write("Put protocol named "+ data + "\n");
            myWriter.write("Put protocol "+ data + "\n");
            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
