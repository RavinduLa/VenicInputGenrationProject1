package variantsEnum;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeleteEnum {
    public static void generate() throws IOException {
        System.out.println("Generating delete enum commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/output/enum/remove-enum.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            myWriter.write("Delete enum named "+ data + "\n");
            myWriter.write("Delete enum "+ data + "\n");
            myWriter.write("Remove enum named "+ data + "\n");
            myWriter.write("Remove enum "+ data + "\n");
            myWriter.write("Cut enum named "+ data + "\n");
            myWriter.write("Cut enum "+ data + "\n");
            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
