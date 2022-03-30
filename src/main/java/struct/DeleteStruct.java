package struct;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeleteStruct {

    public static void generate() throws IOException {
        System.out.println("Generating delete struct commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/output/struct/remove-struct.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            myWriter.write("Delete struct named "+ data + "\n");
            myWriter.write("Delete struct "+ data + "\n");
            myWriter.write("Remove struct named "+ data + "\n");
            myWriter.write("Remove struct "+ data + "\n");
            myWriter.write("Cut struct named "+ data + "\n");
            myWriter.write("Cut struct "+ data + "\n");
            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
