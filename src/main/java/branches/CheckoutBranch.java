package branches;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CheckoutBranch {
    public static void generate() throws IOException {
        System.out.println("Generating checkout branch commands");

        System.out.println("Creating scanner, reader, writer and file objects");

        //initialize files, readers and writers
        File nounFile = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/checkout-branch.txt");
        Scanner nounReader = new Scanner(nounFile);
        System.out.println("Created scanner, reader, writer and file objects");

        while (nounReader.hasNextLine()){
            String data = nounReader.nextLine();
            myWriter.write("Checkout branch " +data + "\n");
            myWriter.write("Checkout branch named " +data + "\n");

            myWriter.write("Switch to branch " +data + "\n");
            myWriter.write("Switch to branch named " +data + "\n");

            myWriter.write("Move to branch " +data + "\n");
            myWriter.write("Move to branch named " +data + "\n");

        }

        nounReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
