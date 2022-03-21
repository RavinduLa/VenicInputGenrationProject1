package branches;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MergeBranch {

    public static void generate() throws IOException {
        System.out.println("Generating merge branch commands");

        System.out.println("Creating scanner, reader, writer and file objects");

        //initialize files, readers and writers
        File nounFile = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/merge-branch.txt");
        Scanner nounReader = new Scanner(nounFile);
        System.out.println("Created scanner, reader, writer and file objects");

        while (nounReader.hasNextLine()){
            String data = nounReader.nextLine();
            myWriter.write("Merge branch " +data + " to current" + "\n");
            myWriter.write("Merge branch " +data + " in to current" + "\n");
            myWriter.write("Merge branch " +data + " to current branch" + "\n");
            myWriter.write("Merge branch " +data + " in to current branch" + "\n");
            myWriter.write("Merge branch named " +data + " to current" + "\n");
            myWriter.write("Merge branch named " +data + " in to current" + "\n");
            myWriter.write("Merge branch named " +data + " to current branch" + "\n");
            myWriter.write("Merge branch named " +data + " in to current branch" + "\n");

        }

        nounReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
