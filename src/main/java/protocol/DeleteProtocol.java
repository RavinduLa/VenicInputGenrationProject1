package protocol;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeleteProtocol {
    public static void generate() throws IOException {
        System.out.println("Generating delete protocol commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/output/protocol/remove-protocol.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            myWriter.write("Delete protocol named "+ data + "\n");
            myWriter.write("Delete protocol "+ data + "\n");
            myWriter.write("Remove protocol named "+ data + "\n");
            myWriter.write("Remove protocol "+ data + "\n");
            myWriter.write("Cut protocol named "+ data + "\n");
            myWriter.write("Cut protocol "+ data + "\n");
            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }

}
