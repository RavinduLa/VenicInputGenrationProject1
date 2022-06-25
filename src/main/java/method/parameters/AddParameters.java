package method.parameters;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddParameters {
    public static void generate() throws IOException {
        System.out.println("Generating add parameters to method commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/verblist.txt");
        FileWriter myWriter = new FileWriter("src/add-parameter.txt");
        Scanner myReader = new Scanner(myObj);
        Scanner myReader2 = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");


        List<String> verbList = new ArrayList<String>();

        System.out.println("Creating verb list");

        while (myReader.hasNextLine()){
            String data = myReader.nextLine();
            verbList.add(data);
        }

        System.out.println("Created verb list");
        int count = verbList.size();
        System.out.println("Verb List Size : " + count);

        while (myReader2.hasNextLine()) {
            String data = myReader2.nextLine();
            String replaceWord = verbList.get(count-1);
            if (replaceWord.isEmpty()){
                replaceWord = "start";
            }

            //string parameters
            myWriter.write("Add string parameter " +replaceWord + " to " + data + " method" + "\n" );
            myWriter.write("Add string parameter " +replaceWord + " to " + data + " function" + "\n" );

            myWriter.write("Insert string parameter " +replaceWord + " to " + data + " method" + "\n" );
            myWriter.write("Insert string parameter " +replaceWord + " to " + data + " function" + "\n" );

            myWriter.write("Put string parameter " +replaceWord + " to " + data + " method" + "\n" );
            myWriter.write("Put string parameter " +replaceWord + " to " + data + " function" + "\n" );

            //integer parameters
            myWriter.write("Add integer parameter " +replaceWord + " to " + data + " method" + "\n" );
            myWriter.write("Add integer parameter " +replaceWord + " to " + data + " function" + "\n" );

            myWriter.write("Insert integer parameter " +replaceWord + " to " + data + " method" + "\n" );
            myWriter.write("Insert integer parameter " +replaceWord + " to " + data + " function" + "\n" );

            myWriter.write("Put integer parameter " +replaceWord + " to " + data + " method" + "\n" );
            myWriter.write("Put integer parameter " +replaceWord + " to " + data + " function" + "\n" );

            //float parameters
            myWriter.write("Add float parameter " +replaceWord + " to " + data + " method" + "\n" );
            myWriter.write("Add float parameter " +replaceWord + " to " + data + " function" + "\n" );

            myWriter.write("Insert float parameter " +replaceWord + " to " + data + " method" + "\n" );
            myWriter.write("Insert float parameter " +replaceWord + " to " + data + " function" + "\n" );

            myWriter.write("Put float parameter " +replaceWord + " to " + data + " method" + "\n" );
            myWriter.write("Put float parameter " +replaceWord + " to " + data + " function" + "\n" );

            //double parameters
            myWriter.write("Add double parameter " +replaceWord + " to " + data + " method" + "\n" );
            myWriter.write("Add double parameter " +replaceWord + " to " + data + " function" + "\n" );

            myWriter.write("Insert double parameter " +replaceWord + " to " + data + " method" + "\n" );
            myWriter.write("Insert double parameter " +replaceWord + " to " + data + " function" + "\n" );

            myWriter.write("Put double parameter " +replaceWord + " to " + data + " method" + "\n" );
            myWriter.write("Put double parameter " +replaceWord + " to " + data + " function" + "\n" );

            //boolean parameters
            myWriter.write("Add boolean parameter " +replaceWord + " to " + data + " method" + "\n" );
            myWriter.write("Add boolean parameter " +replaceWord + " to " + data + " function" + "\n" );

            myWriter.write("Insert boolean parameter " +replaceWord + " to " + data + " method" + "\n" );
            myWriter.write("Insert boolean parameter " +replaceWord + " to " + data + " function" + "\n" );

            myWriter.write("Put boolean parameter " +replaceWord + " to " + data + " method" + "\n" );
            myWriter.write("Put boolean parameter " +replaceWord + " to " + data + " function" + "\n" );


            if(count == 5){
                replaceWord = verbList.get(200);

                //string parameters
                myWriter.write("Add string parameter " +replaceWord + " to " + data + " method" + "\n" );
                myWriter.write("Add string parameter " +replaceWord + " to " + data + " function" + "\n" );

                myWriter.write("Insert string parameter " +replaceWord + " to " + data + " method" + "\n" );
                myWriter.write("Insert string parameter " +replaceWord + " to " + data + " function" + "\n" );

                myWriter.write("Put string parameter " +replaceWord + " to " + data + " method" + "\n" );
                myWriter.write("Put string parameter " +replaceWord + " to " + data + " function" + "\n" );

                //integer parameters
                myWriter.write("Add integer parameter " +replaceWord + " to " + data + " method" + "\n" );
                myWriter.write("Add integer parameter " +replaceWord + " to " + data + " function" + "\n" );

                myWriter.write("Insert integer parameter " +replaceWord + " to " + data + " method" + "\n" );
                myWriter.write("Insert integer parameter " +replaceWord + " to " + data + " function" + "\n" );

                myWriter.write("Put integer parameter " +replaceWord + " to " + data + " method" + "\n" );
                myWriter.write("Put integer parameter " +replaceWord + " to " + data + " function" + "\n" );

                //float parameters
                myWriter.write("Add float parameter " +replaceWord + " to " + data + " method" + "\n" );
                myWriter.write("Add float parameter " +replaceWord + " to " + data + " function" + "\n" );

                myWriter.write("Insert float parameter " +replaceWord + " to " + data + " method" + "\n" );
                myWriter.write("Insert float parameter " +replaceWord + " to " + data + " function" + "\n" );

                myWriter.write("Put float parameter " +replaceWord + " to " + data + " method" + "\n" );
                myWriter.write("Put float parameter " +replaceWord + " to " + data + " function" + "\n" );

                //double parameters
                myWriter.write("Add double parameter " +replaceWord + " to " + data + " method" + "\n" );
                myWriter.write("Add double parameter " +replaceWord + " to " + data + " function" + "\n" );

                myWriter.write("Insert double parameter " +replaceWord + " to " + data + " method" + "\n" );
                myWriter.write("Insert double parameter " +replaceWord + " to " + data + " function" + "\n" );

                myWriter.write("Put double parameter " +replaceWord + " to " + data + " method" + "\n" );
                myWriter.write("Put double parameter " +replaceWord + " to " + data + " function" + "\n" );

                //boolean parameters
                myWriter.write("Add boolean parameter " +replaceWord + " to " + data + " method" + "\n" );
                myWriter.write("Add boolean parameter " +replaceWord + " to " + data + " function" + "\n" );

                myWriter.write("Insert boolean parameter " +replaceWord + " to " + data + " method" + "\n" );
                myWriter.write("Insert boolean parameter " +replaceWord + " to " + data + " function" + "\n" );

                myWriter.write("Put boolean parameter " +replaceWord + " to " + data + " method" + "\n" );
                myWriter.write("Put boolean parameter " +replaceWord + " to " + data + " function" + "\n" );

                break;
            }


            count --;


        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
