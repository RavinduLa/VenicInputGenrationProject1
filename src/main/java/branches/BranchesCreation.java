package branches;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BranchesCreation {

    public static void generate() throws IOException {
        System.out.println("Generating create branch commands");

        System.out.println("Creating scanner, reader, writer and file objects");

        //initialize files, readers and writers
        File nounFile = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/branch-creation.txt");
        Scanner nounReader = new Scanner(nounFile);
        System.out.println("Created scanner, reader, writer and file objects");

        while (nounReader.hasNextLine()){
            String data = nounReader.nextLine();
            myWriter.write("Create branch " +data + "\n");
            myWriter.write("Create new branch " +data + "\n");
            myWriter.write("Create branch named " +data + "\n");
            myWriter.write("Create new branch named " +data + "\n");

            myWriter.write("Add branch " +data + "\n");
            myWriter.write("Add new branch " +data + "\n");
            myWriter.write("Add branch named " +data + "\n");
            myWriter.write("Add new branch named " +data + "\n");

            myWriter.write("Insert branch " +data + "\n");
            myWriter.write("Insert new branch " +data + "\n");
            myWriter.write("Insert branch named " +data + "\n");
            myWriter.write("Insert new branch named " +data + "\n");
        }

        nounReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
