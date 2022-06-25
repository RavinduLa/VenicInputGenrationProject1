package method.addMethodVariations.withAccessModifiers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddPrivateMethod {
    public static void generate() throws IOException {
        System.out.println("Generating add methods commands with private access");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/verblist.txt");
        FileWriter myWriter = new FileWriter("src/add-method-private.txt");
        Scanner myReader = new Scanner(myObj);
        Scanner myReader2 = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");



        while (myReader2.hasNextLine()) {
            String data = myReader2.nextLine();


            //####   Add a method named.... ####
            //base
            myWriter.write("Add a private method named " +data +"\n" );
            myWriter.write("Add a private function named " +data +"\n" );

            myWriter.write("Create a private method named " +data +"\n" );
            myWriter.write("Create a private function named " +data +"\n" );

            myWriter.write("Put a private method named " +data +"\n" );
            myWriter.write("Put a private function named " +data +"\n" );


            //####   Add method named.... ####
            //base
            myWriter.write("Add private method named " +data +"\n" );
            myWriter.write("Add private function named " +data +"\n" );

            myWriter.write("Create private method named " +data +"\n" );
            myWriter.write("Create private function named " +data +"\n" );

            myWriter.write("Put private method named " +data +"\n" );
            myWriter.write("Put private function named " +data +"\n" );

            //with {number} parameters
            //2 parameters
            myWriter.write("Add private method named " + data + " with two parameters"+"\n" );
            myWriter.write("Add private function named " + data + " with two parameters" +"\n" );

            myWriter.write("Create private method named " + data +" with two parameters"+"\n" );
            myWriter.write("Create private function named " + data +" with two parameters" +"\n" );

            myWriter.write("Put private method named " + data + " with two parameters" +"\n" );
            myWriter.write("Put private function named " + data + " with two parameters" +"\n" );

            //3 parameters
            myWriter.write("Add private method named " + data + " with three parameters"+"\n" );
            myWriter.write("Add private function named " + data + " with three parameters" +"\n" );

            myWriter.write("Create private method named " + data +" with three parameters"+"\n" );
            myWriter.write("Create private function named " + data +" with three parameters" +"\n" );

            myWriter.write("Put private method named " + data + " with three parameters" +"\n" );
            myWriter.write("Put private function named " + data + " with three parameters" +"\n" );

            //5 parameters
            myWriter.write("Add private method named " + data + " with five parameters"+"\n" );
            myWriter.write("Add private function named " + data + " with five parameters" +"\n" );

            myWriter.write("Create private method named " + data +" with five parameters"+"\n" );
            myWriter.write("Create private function named " + data +" with five parameters" +"\n" );

            myWriter.write("Put private method named " + data + " with five parameters" +"\n" );
            myWriter.write("Put private function named " + data + " with five parameters" +"\n" );


            //return type variations
            //boolean
            myWriter.write("Add private method named " + data + " with return type boolean"+"\n" );
            myWriter.write("Add private function named " + data + " with return type boolean" +"\n" );

            myWriter.write("Create private method named " + data +" with return type boolean"+"\n" );
            myWriter.write("Create private function named " + data +" with return type boolean" +"\n" );

            myWriter.write("Put private method named " + data + " with return type boolean" +"\n" );
            myWriter.write("Put private function named " + data + " with return type boolean" +"\n" );

            //integer
            myWriter.write("Add private method named " + data + " with return type integer"+"\n" );
            myWriter.write("Add private function named " + data + " with return type integer" +"\n" );

            myWriter.write("Create private method named " + data +" with return type integer"+"\n" );
            myWriter.write("Create private function named " + data +" with return type integer" +"\n" );

            myWriter.write("Put private method named " + data + " with return type integer" +"\n" );
            myWriter.write("Put private function named " + data + " with return type integer" +"\n" );

            //float
            myWriter.write("Add private method named " + data + " with return type float"+"\n" );
            myWriter.write("Add private function named " + data + " with return type float" +"\n" );

            myWriter.write("Create private method named " + data +" with return type float"+"\n" );
            myWriter.write("Create private function named " + data +" with return type float" +"\n" );

            myWriter.write("Put private method named " + data + " with return type float" +"\n" );
            myWriter.write("Put private function named " + data + " with return type float" +"\n" );

            //double
            myWriter.write("Add private method named " + data + " with return type double"+"\n" );
            myWriter.write("Add private function named " + data + " with return type double" +"\n" );

            myWriter.write("Create private method named " + data +" with return type double"+"\n" );
            myWriter.write("Create private function named " + data +" with return type double" +"\n" );

            myWriter.write("Put private method named " + data + " with return type double" +"\n" );
            myWriter.write("Put private function named " + data + " with return type double" +"\n" );

            //string
            myWriter.write("Add private method named " + data + " with return type string"+"\n" );
            myWriter.write("Add private function named " + data + " with return type string" +"\n" );

            myWriter.write("Create private method named " + data +" with return type string"+"\n" );
            myWriter.write("Create private function named " + data +" with return type string" +"\n" );

            myWriter.write("Put private method named " + data + " with return type string" +"\n" );
            myWriter.write("Put private function named " + data + " with return type string" +"\n" );


            //with return type after fourth method
            myWriter.write("Add private method named " + data + " with return type boolean after fourth method"+"\n" );
            myWriter.write("Add private function named " + data + " with return type boolean after fourth method" +"\n" );

            myWriter.write("Create private method named " + data +" with return type boolean after fourth method"+"\n" );
            myWriter.write("Create private function named " + data +" with return type boolean after fourth method" +"\n" );

            myWriter.write("Put private method named " + data + " with return type boolean after fourth method" +"\n" );
            myWriter.write("Put private function named " + data + " with return type boolean after fourth method" +"\n" );


            //#### Add method... ####
            myWriter.write("Add private method " +data +"\n" );
            myWriter.write("Add private function " +data +"\n" );

            myWriter.write("Create private method " +data +"\n" );
            myWriter.write("Create private function " +data +"\n" );

            myWriter.write("Put private method " +data +"\n" );
            myWriter.write("Put private function " +data +"\n" );


            //with {number} parameters
            //2 parameters
            myWriter.write("Add private method " + data + " with two parameters" +"\n" );
            myWriter.write("Add private function " + data + " with two parameters" +"\n" );

            myWriter.write("Create private method " + data + " with two parameters" +"\n" );
            myWriter.write("Create private function " + data + " with two parameters" +"\n" );

            myWriter.write("Put private method " + data + " with two parameters" +"\n" );
            myWriter.write("Put private function " + data + " with two parameters" +"\n" );

            //3 parameters
            myWriter.write("Add private method " + data + " with three parameters" +"\n" );
            myWriter.write("Add private function " + data + " with three parameters" +"\n" );

            myWriter.write("Create private method " + data + " with three parameters" +"\n" );
            myWriter.write("Create private function " + data + " with three parameters" +"\n" );

            myWriter.write("Put private method " + data + " with three parameters" +"\n" );
            myWriter.write("Put private function " + data + " with three parameters" +"\n" );

            //5 parameters
            myWriter.write("Add private method " + data + " with five parameters" +"\n" );
            myWriter.write("Add private function " + data + " with five parameters" +"\n" );

            myWriter.write("Create private method " + data + " with five parameters" +"\n" );
            myWriter.write("Create private function " + data + " with five parameters" +"\n" );

            myWriter.write("Put private method " + data + " with five parameters" +"\n" );
            myWriter.write("Put private function " + data + " with five parameters" +"\n" );


            //return type variations
            //boolean
            myWriter.write("Add private method " + data + " with return type boolean"+"\n" );
            myWriter.write("Add private function " + data + " with return type boolean" +"\n" );

            myWriter.write("Create private method " + data +" with return type boolean"+"\n" );
            myWriter.write("Create private function " + data +" with return type boolean" +"\n" );

            myWriter.write("Put private method " + data + " with return type boolean" +"\n" );
            myWriter.write("Put private function " + data + " with return type boolean" +"\n" );

            //integer
            myWriter.write("Add private method " + data + " with return type integer"+"\n" );
            myWriter.write("Add private function " + data + " with return type integer" +"\n" );

            myWriter.write("Create private method " + data +" with return type integer"+"\n" );
            myWriter.write("Create private function " + data +" with return type integer" +"\n" );

            myWriter.write("Put private method " + data + " with return type integer" +"\n" );
            myWriter.write("Put private function " + data + " with return type integer" +"\n" );

            //float
            myWriter.write("Add private method " + data + " with return type float"+"\n" );
            myWriter.write("Add private function " + data + " with return type float" +"\n" );

            myWriter.write("Create private method " + data +" with return type float"+"\n" );
            myWriter.write("Create private function " + data +" with return type float" +"\n" );

            myWriter.write("Put private method " + data + " with return type float" +"\n" );
            myWriter.write("Put private function " + data + " with return type float" +"\n" );

            //double
            myWriter.write("Add private method " + data + " with return type double"+"\n" );
            myWriter.write("Add private function " + data + " with return type double" +"\n" );

            myWriter.write("Create private method " + data +" with return type double"+"\n" );
            myWriter.write("Create private function " + data +" with return type double" +"\n" );

            myWriter.write("Put private method " + data + " with return type double" +"\n" );
            myWriter.write("Put private function " + data + " with return type double" +"\n" );

            //string
            myWriter.write("Add private method " + data + " with return type string"+"\n" );
            myWriter.write("Add private function " + data + " with return type string" +"\n" );

            myWriter.write("Create private method " + data +" with return type string"+"\n" );
            myWriter.write("Create private function " + data +" with return type string" +"\n" );

            myWriter.write("Put private method " + data + " with return type string" +"\n" );
            myWriter.write("Put private function " + data + " with return type string" +"\n" );


            //with return type after fourth method
            myWriter.write("Add private method " + data + " with return type boolean after fourth method"+"\n" );
            myWriter.write("Add private function " + data + " with return type boolean after fourth method" +"\n" );

            myWriter.write("Create private method " + data +" with return type boolean after fourth method"+"\n" );
            myWriter.write("Create private function " + data +" with return type boolean after fourth method" +"\n" );

            myWriter.write("Put private method " + data + " with return type boolean after fourth method" +"\n" );
            myWriter.write("Put private function " + data + " with return type boolean after fourth method" +"\n" );




        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
