package method.addMethodVariations.withAccessModifiers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddPublicMethod {
    public static void generate() throws IOException {
        System.out.println("Generating add methods commands with public access");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/verblist.txt");
        FileWriter myWriter = new FileWriter("src/add-method-public.txt");
        Scanner myReader = new Scanner(myObj);
        Scanner myReader2 = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");



        while (myReader2.hasNextLine()) {
            String data = myReader2.nextLine();


            //####   Add a method named.... ####
            //base
            myWriter.write("Add a public method named " +data +"\n" );
            myWriter.write("Add a public function named " +data +"\n" );

            myWriter.write("Create a public method named " +data +"\n" );
            myWriter.write("Create a public function named " +data +"\n" );

            myWriter.write("Put a public method named " +data +"\n" );
            myWriter.write("Put a public function named " +data +"\n" );


            //####   Add method named.... ####
            //base
            myWriter.write("Add public method named " +data +"\n" );
            myWriter.write("Add public function named " +data +"\n" );

            myWriter.write("Create public method named " +data +"\n" );
            myWriter.write("Create public function named " +data +"\n" );

            myWriter.write("Put public method named " +data +"\n" );
            myWriter.write("Put public function named " +data +"\n" );

            //with {number} parameters
            //2 parameters
            myWriter.write("Add public method named " + data + " with two parameters"+"\n" );
            myWriter.write("Add public function named " + data + " with two parameters" +"\n" );

            myWriter.write("Create public method named " + data +" with two parameters"+"\n" );
            myWriter.write("Create public function named " + data +" with two parameters" +"\n" );

            myWriter.write("Put public method named " + data + " with two parameters" +"\n" );
            myWriter.write("Put public function named " + data + " with two parameters" +"\n" );

            //3 parameters
            myWriter.write("Add public method named " + data + " with three parameters"+"\n" );
            myWriter.write("Add public function named " + data + " with three parameters" +"\n" );

            myWriter.write("Create public method named " + data +" with three parameters"+"\n" );
            myWriter.write("Create public function named " + data +" with three parameters" +"\n" );

            myWriter.write("Put public method named " + data + " with three parameters" +"\n" );
            myWriter.write("Put public function named " + data + " with three parameters" +"\n" );

            //5 parameters
            myWriter.write("Add public method named " + data + " with five parameters"+"\n" );
            myWriter.write("Add public function named " + data + " with five parameters" +"\n" );

            myWriter.write("Create public method named " + data +" with five parameters"+"\n" );
            myWriter.write("Create public function named " + data +" with five parameters" +"\n" );

            myWriter.write("Put public method named " + data + " with five parameters" +"\n" );
            myWriter.write("Put public function named " + data + " with five parameters" +"\n" );


            //return type variations
            //boolean
            myWriter.write("Add public method named " + data + " with return type boolean"+"\n" );
            myWriter.write("Add public function named " + data + " with return type boolean" +"\n" );

            myWriter.write("Create public method named " + data +" with return type boolean"+"\n" );
            myWriter.write("Create public function named " + data +" with return type boolean" +"\n" );

            myWriter.write("Put public method named " + data + " with return type boolean" +"\n" );
            myWriter.write("Put public function named " + data + " with return type boolean" +"\n" );

            //integer
            myWriter.write("Add public method named " + data + " with return type integer"+"\n" );
            myWriter.write("Add public function named " + data + " with return type integer" +"\n" );

            myWriter.write("Create public method named " + data +" with return type integer"+"\n" );
            myWriter.write("Create public function named " + data +" with return type integer" +"\n" );

            myWriter.write("Put public method named " + data + " with return type integer" +"\n" );
            myWriter.write("Put public function named " + data + " with return type integer" +"\n" );

            //float
            myWriter.write("Add public method named " + data + " with return type float"+"\n" );
            myWriter.write("Add public function named " + data + " with return type float" +"\n" );

            myWriter.write("Create public method named " + data +" with return type float"+"\n" );
            myWriter.write("Create public function named " + data +" with return type float" +"\n" );

            myWriter.write("Put public method named " + data + " with return type float" +"\n" );
            myWriter.write("Put public function named " + data + " with return type float" +"\n" );

            //double
            myWriter.write("Add public method named " + data + " with return type double"+"\n" );
            myWriter.write("Add public function named " + data + " with return type double" +"\n" );

            myWriter.write("Create public method named " + data +" with return type double"+"\n" );
            myWriter.write("Create public function named " + data +" with return type double" +"\n" );

            myWriter.write("Put public method named " + data + " with return type double" +"\n" );
            myWriter.write("Put public function named " + data + " with return type double" +"\n" );

            //string
            myWriter.write("Add public method named " + data + " with return type string"+"\n" );
            myWriter.write("Add public function named " + data + " with return type string" +"\n" );

            myWriter.write("Create public method named " + data +" with return type string"+"\n" );
            myWriter.write("Create public function named " + data +" with return type string" +"\n" );

            myWriter.write("Put public method named " + data + " with return type string" +"\n" );
            myWriter.write("Put public function named " + data + " with return type string" +"\n" );


            //with return type after fourth method
            myWriter.write("Add public method named " + data + " with return type boolean after fourth method"+"\n" );
            myWriter.write("Add public function named " + data + " with return type boolean after fourth method" +"\n" );

            myWriter.write("Create public method named " + data +" with return type boolean after fourth method"+"\n" );
            myWriter.write("Create public function named " + data +" with return type boolean after fourth method" +"\n" );

            myWriter.write("Put public method named " + data + " with return type boolean after fourth method" +"\n" );
            myWriter.write("Put public function named " + data + " with return type boolean after fourth method" +"\n" );


            //#### Add method... ####
            myWriter.write("Add public method " +data +"\n" );
            myWriter.write("Add public function " +data +"\n" );

            myWriter.write("Create public method " +data +"\n" );
            myWriter.write("Create public function " +data +"\n" );

            myWriter.write("Put public method " +data +"\n" );
            myWriter.write("Put public function " +data +"\n" );


            //with {number} parameters
            //2 parameters
            myWriter.write("Add public method " + data + " with two parameters" +"\n" );
            myWriter.write("Add public function " + data + " with two parameters" +"\n" );

            myWriter.write("Create public method " + data + " with two parameters" +"\n" );
            myWriter.write("Create public function " + data + " with two parameters" +"\n" );

            myWriter.write("Put public method " + data + " with two parameters" +"\n" );
            myWriter.write("Put public function " + data + " with two parameters" +"\n" );

            //3 parameters
            myWriter.write("Add public method " + data + " with three parameters" +"\n" );
            myWriter.write("Add public function " + data + " with three parameters" +"\n" );

            myWriter.write("Create public method " + data + " with three parameters" +"\n" );
            myWriter.write("Create public function " + data + " with three parameters" +"\n" );

            myWriter.write("Put public method " + data + " with three parameters" +"\n" );
            myWriter.write("Put public function " + data + " with three parameters" +"\n" );

            //5 parameters
            myWriter.write("Add public method " + data + " with five parameters" +"\n" );
            myWriter.write("Add public function " + data + " with five parameters" +"\n" );

            myWriter.write("Create public method " + data + " with five parameters" +"\n" );
            myWriter.write("Create public function " + data + " with five parameters" +"\n" );

            myWriter.write("Put public method " + data + " with five parameters" +"\n" );
            myWriter.write("Put public function " + data + " with five parameters" +"\n" );


            //return type variations
            //boolean
            myWriter.write("Add public method " + data + " with return type boolean"+"\n" );
            myWriter.write("Add public function " + data + " with return type boolean" +"\n" );

            myWriter.write("Create public method " + data +" with return type boolean"+"\n" );
            myWriter.write("Create public function " + data +" with return type boolean" +"\n" );

            myWriter.write("Put public method " + data + " with return type boolean" +"\n" );
            myWriter.write("Put public function " + data + " with return type boolean" +"\n" );

            //integer
            myWriter.write("Add public method " + data + " with return type integer"+"\n" );
            myWriter.write("Add public function " + data + " with return type integer" +"\n" );

            myWriter.write("Create public method " + data +" with return type integer"+"\n" );
            myWriter.write("Create public function " + data +" with return type integer" +"\n" );

            myWriter.write("Put public method " + data + " with return type integer" +"\n" );
            myWriter.write("Put public function " + data + " with return type integer" +"\n" );

            //float
            myWriter.write("Add public method " + data + " with return type float"+"\n" );
            myWriter.write("Add public function " + data + " with return type float" +"\n" );

            myWriter.write("Create public method " + data +" with return type float"+"\n" );
            myWriter.write("Create public function " + data +" with return type float" +"\n" );

            myWriter.write("Put public method " + data + " with return type float" +"\n" );
            myWriter.write("Put public function " + data + " with return type float" +"\n" );

            //double
            myWriter.write("Add public method " + data + " with return type double"+"\n" );
            myWriter.write("Add public function " + data + " with return type double" +"\n" );

            myWriter.write("Create public method " + data +" with return type double"+"\n" );
            myWriter.write("Create public function " + data +" with return type double" +"\n" );

            myWriter.write("Put public method " + data + " with return type double" +"\n" );
            myWriter.write("Put public function " + data + " with return type double" +"\n" );

            //string
            myWriter.write("Add public method " + data + " with return type string"+"\n" );
            myWriter.write("Add public function " + data + " with return type string" +"\n" );

            myWriter.write("Create public method " + data +" with return type string"+"\n" );
            myWriter.write("Create public function " + data +" with return type string" +"\n" );

            myWriter.write("Put public method " + data + " with return type string" +"\n" );
            myWriter.write("Put public function " + data + " with return type string" +"\n" );


            //with return type after fourth method
            myWriter.write("Add public method " + data + " with return type boolean after fourth method"+"\n" );
            myWriter.write("Add public function " + data + " with return type boolean after fourth method" +"\n" );

            myWriter.write("Create public method " + data +" with return type boolean after fourth method"+"\n" );
            myWriter.write("Create public function " + data +" with return type boolean after fourth method" +"\n" );

            myWriter.write("Put public method " + data + " with return type boolean after fourth method" +"\n" );
            myWriter.write("Put public function " + data + " with return type boolean after fourth method" +"\n" );




        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
