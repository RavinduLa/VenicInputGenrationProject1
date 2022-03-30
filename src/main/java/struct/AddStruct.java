package struct;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddStruct {

    public static void generate() throws IOException {
        System.out.println("Generating add struct commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/output/struct/add-struct.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            myWriter.write("Add struct named "+ data + "\n");
            myWriter.write("Add struct "+ data + "\n");
            myWriter.write("Insert struct named "+ data + "\n");
            myWriter.write("Insert struct "+ data + "\n");
            myWriter.write("Put struct named "+ data + "\n");
            myWriter.write("Put struct "+ data + "\n");
            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }

}
