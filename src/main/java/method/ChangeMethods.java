package method;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeMethods {
    public static void generate() throws IOException {
        System.out.println("Generating change methods commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/verblist.txt");
        FileWriter myWriter = new FileWriter("src/output.txt");
        Scanner myReader = new Scanner(myObj);
        Scanner myReader2 = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");


        List<String> verbList = new ArrayList<String>();

        System.out.println("Creating noun list");

        while (myReader.hasNextLine()){
            String data = myReader.nextLine();
            verbList.add(data);
        }

        System.out.println("Created noun list");
        int count = verbList.size();
        System.out.println("Noun List Size : " + count);

        while (myReader2.hasNextLine()) {
            String data = myReader2.nextLine();
            String replaceWord = verbList.get(count-1);
            if (replaceWord.isEmpty()){
                replaceWord = "start";
            }
            myWriter.write("Change method named " +data + " to " + replaceWord + "\n" );
            myWriter.write("Change function named " +data +" to " + replaceWord + "\n" );
            myWriter.write("Change method " +data + " to " + replaceWord + "\n" );
            myWriter.write("Change function " +data +" to " + replaceWord + "\n" );

            myWriter.write("Alter method named " +data + " to " + replaceWord + "\n" );
            myWriter.write("Alter function named " +data +" to " + replaceWord + "\n" );
            myWriter.write("Alter method " +data + " to " + replaceWord + "\n" );
            myWriter.write("Alter function " +data +" to " + replaceWord + "\n" );

            if(count == 5){
                replaceWord = verbList.get(200);
                myWriter.write("Change method named " +data + "to " + replaceWord + "\n" );
                myWriter.write("Change function named " +data +"to " + replaceWord + "\n" );
                myWriter.write("Change method " +data + "to " + replaceWord + "\n" );
                myWriter.write("Change function " +data +"to " + replaceWord + "\n" );

                myWriter.write("Alter method named " +data + "to " + replaceWord + "\n" );
                myWriter.write("Alter function named " +data +"to " + replaceWord + "\n" );
                myWriter.write("Alter method " +data + "to " + replaceWord + "\n" );
                myWriter.write("Alter function " +data +"to " + replaceWord + "\n" );

                break;
            }


            count --;


        }
        myReader.close();
        myWriter.close();
        System.out.println("Closed reader and writer");
    }
}
