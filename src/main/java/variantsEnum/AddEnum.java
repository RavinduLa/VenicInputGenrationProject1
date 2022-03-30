package variantsEnum;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddEnum {
    public static void generate() throws IOException {
        System.out.println("Generating add enum commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/output/enum/add-enum.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            myWriter.write("Add enum named "+ data + "\n");
            myWriter.write("Add enum "+ data + "\n");
            myWriter.write("Insert enum named "+ data + "\n");
            myWriter.write("Insert enum "+ data + "\n");
            myWriter.write("Put enum named "+ data + "\n");
            myWriter.write("Put enum "+ data + "\n");
            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
