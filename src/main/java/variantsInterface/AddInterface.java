package variantsInterface;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddInterface {
    public static void generate() throws IOException {
        System.out.println("Generating add interface commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/output/interface/add-interface.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            myWriter.write("Add interface named "+ data + "\n");
            myWriter.write("Add interface "+ data + "\n");
            myWriter.write("Insert interface named "+ data + "\n");
            myWriter.write("Insert interface "+ data + "\n");
            myWriter.write("Put interface named "+ data + "\n");
            myWriter.write("Put interface "+ data + "\n");
            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
