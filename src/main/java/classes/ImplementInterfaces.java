package classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImplementInterfaces {
    public static void generate() throws IOException {
        System.out.println("Generating implement protocols to class commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/output/class/implement-interfaces-to-class.txt");
        Scanner myReader = new Scanner(myObj);
        Scanner myReader2 = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");


        List<String> nounList = new ArrayList<String>();

        System.out.println("Creating noun list");

        while (myReader.hasNextLine()){
            String data = myReader.nextLine();
            nounList.add(data);
        }

        System.out.println("Created noun list");
        int count = nounList.size();
        System.out.println("Noun List Size : " + count);

        while (myReader2.hasNextLine()) {
            String data = myReader2.nextLine();
            String replaceWord = nounList.get(count-2);

            myWriter.write("Implement interface named " + data + " to " +"class " +replaceWord +"\n");
            myWriter.write("Implement interface " + data + " to " +"class " +replaceWord +"\n");

            myWriter.write("Implement interface named " + data + " to "  +replaceWord + " class" +"\n");
            myWriter.write("Implement interface " + data + " to " +replaceWord + " class" +"\n");

            myWriter.write("Implement interface named " + data + " to "  +replaceWord +"\n");
            myWriter.write("Implement interface " + data + " to " +replaceWord +"\n");


            if(count == 10){

                myWriter.write("Implement interface named " + data + " to " +"class " +nounList.get(200) +"\n");
                myWriter.write("Implement interface " + data + " to " +"class " +nounList.get(200) +"\n");

                myWriter.write("Implement interface named " + data + " to "  +nounList.get(200) + " class" +"\n");
                myWriter.write("Implement interface " + data + " to " +nounList.get(200) + " class" +"\n");

                myWriter.write("Implement interface named " + data + " to "  +nounList.get(200) +"\n");
                myWriter.write("Implement interface " + data + " to " +nounList.get(200) +"\n");

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
