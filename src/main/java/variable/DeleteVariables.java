package variable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeleteVariables {
    public static void generate() throws IOException {
        System.out.println("Generating delete variables commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/output.txt");
        Scanner myReader = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            myWriter.write("Delete variable named "+ data + "\n");
            myWriter.write("Delete property named "+ data + "\n");
            myWriter.write("Delete attribute named "+ data + "\n");
            myWriter.write("Delete variable "+ data + "\n");
            myWriter.write("Delete property "+ data + "\n");
            myWriter.write("Delete attribute "+ data + "\n");

            myWriter.write("Remove variable named "+ data + "\n");
            myWriter.write("Remove property named "+ data + "\n");
            myWriter.write("Remove attribute named "+ data + "\n");
            myWriter.write("Remove variable "+ data + "\n");
            myWriter.write("Remove property "+ data + "\n");
            myWriter.write("Remove attribute "+ data + "\n");

            myWriter.write("Cut variable named "+ data + "\n");
            myWriter.write("Cut property named "+ data + "\n");
            myWriter.write("Cut attribute named "+ data + "\n");
            myWriter.write("Cut variable "+ data + "\n");
            myWriter.write("Cut property "+ data + "\n");
            myWriter.write("Cut attribute "+ data + "\n");



            //System.out.println(data);
        }
        myReader.close();
        myWriter.close();
        System.out.println("Closed reader and writer");
    }
}
