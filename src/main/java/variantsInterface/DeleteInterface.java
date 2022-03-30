package variantsInterface;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeleteInterface {
    public static void generate() throws IOException {
        System.out.println("Generating delete interface commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/output/interface/remove-interface.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            myWriter.write("Delete interface named "+ data + "\n");
            myWriter.write("Delete interface "+ data + "\n");
            myWriter.write("Remove interface named "+ data + "\n");
            myWriter.write("Remove interface "+ data + "\n");
            myWriter.write("Cut interface named "+ data + "\n");
            myWriter.write("Cut interface "+ data + "\n");
            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
