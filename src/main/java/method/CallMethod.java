package method;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CallMethod {
    public static void generate() throws IOException {
        System.out.println("Generating call method commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File verbFile = new File("src/verblist.txt");
        FileWriter myWriter = new FileWriter("src/call-method.txt");
        Scanner verbReader = new Scanner(verbFile);
        System.out.println("Created scanner, reader, writer and file objects");

        while (verbReader.hasNextLine()){
            String data = verbReader.nextLine();
            myWriter.write("Call method " + data + "\n");
            myWriter.write("Call method named " + data + "\n");
            myWriter.write("Call function " + data + "\n");
            myWriter.write("Call function named " + data + "\n");

            myWriter.write("Invoke method " + data + "\n");
            myWriter.write("Invoke method named " + data + "\n");
            myWriter.write("Invoke function " + data + "\n");
            myWriter.write("Invoke function named " + data + "\n");
        }
        verbReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
