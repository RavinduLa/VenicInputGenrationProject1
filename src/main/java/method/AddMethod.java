package method;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddMethod {
    public static void generate() throws IOException {
        System.out.println("Generating add methods commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/verblist.txt");
        FileWriter myWriter = new FileWriter("src/add-method.txt");
        Scanner myReader = new Scanner(myObj);
        Scanner myReader2 = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");


            /*List<String> nounList = new ArrayList<String>();

            System.out.println("Creating noun list");

            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                nounList.add(data);
            }

            System.out.println("Created noun list");
            int count = nounList.size();
            System.out.println("Noun List Size : " + count);*/

        while (myReader2.hasNextLine()) {
            String data = myReader2.nextLine();
            myWriter.write("Add a method named " +data +"\n" );
            myWriter.write("Add a function named " +data +"\n" );

            myWriter.write("Create a method named " +data +"\n" );
            myWriter.write("Create a function named " +data +"\n" );

            myWriter.write("Put a method named " +data +"\n" );
            myWriter.write("Put a function named " +data +"\n" );
        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
