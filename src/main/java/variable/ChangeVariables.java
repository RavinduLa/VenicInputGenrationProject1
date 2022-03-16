package variable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeVariables {
    public static void generate() throws IOException {
        System.out.println("Generating change variables commands");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/nounlist.txt");
        FileWriter myWriter = new FileWriter("src/output.txt");
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

            myWriter.write("Change variable named " + data + " to " +replaceWord +"\n");
            myWriter.write("Change attribute named " + data + " to " +replaceWord +"\n");
            myWriter.write("Change property named " + data + " to " +replaceWord +"\n");

            myWriter.write("Change variable " + data + " to " +replaceWord +"\n");
            myWriter.write("Change attribute " + data + " to " +replaceWord +"\n");
            myWriter.write("Change property " + data + " to " +replaceWord +"\n");

            myWriter.write("Edit variable named " + data + " to " +replaceWord +"\n");
            myWriter.write("Edit attribute named " + data + " to " +replaceWord +"\n");
            myWriter.write("Edit property named " + data + " to " +replaceWord +"\n");

            myWriter.write("Edit variable " + data + " to " +replaceWord +"\n");
            myWriter.write("Edit attribute " + data + " to " +replaceWord +"\n");
            myWriter.write("Edit property " + data + " to " +replaceWord +"\n");

            if(count == 10){
                myWriter.write("Change variable named " + data + " to " +nounList.get(200) +"\n");
                myWriter.write("Change attribute named " + data + " to " +nounList.get(200) +"\n");
                myWriter.write("Change property named " + data + " to " +nounList.get(200) +"\n");

                myWriter.write("Change variable " + data + " to " +nounList.get(200) +"\n");
                myWriter.write("Change attribute " + data + " to " +nounList.get(200) +"\n");
                myWriter.write("Change property " + data + " to " +nounList.get(200) +"\n");

                myWriter.write("Edit variable named " + data + " to " +nounList.get(200) +"\n");
                myWriter.write("Edit attribute named " + data + " to " +nounList.get(200) +"\n");
                myWriter.write("Edit property named " + data + " to " +nounList.get(200) +"\n");

                myWriter.write("Edit variable " + data + " to " +nounList.get(200) +"\n");
                myWriter.write("Edit attribute " + data + " to " +nounList.get(200) +"\n");
                myWriter.write("Edit property " + data + " to " +nounList.get(200) +"\n");
                break;
            }
            count --;
        }
        myReader.close();
        myWriter.close();
        System.out.println("Closed reader and writer");
    }
}
