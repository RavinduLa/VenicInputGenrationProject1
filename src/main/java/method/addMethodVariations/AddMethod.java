package method.addMethodVariations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddMethod {
    public static void generate() throws IOException {
        System.out.println("Generating add methods commands without a");
        System.out.println("Creating scanner, reader, writer and file objects");
        File myObj = new File("src/verblist.txt");
        FileWriter myWriter = new FileWriter("src/add-method-no-a.txt");
        Scanner myReader = new Scanner(myObj);
        Scanner myReader2 = new Scanner(myObj);
        System.out.println("Created scanner, reader, writer and file objects");



        while (myReader2.hasNextLine()) {
            String data = myReader2.nextLine();


            //####   Add method named.... ####
            //base
            myWriter.write("Add method named " +data +"\n" );
            myWriter.write("Add function named " +data +"\n" );

            myWriter.write("Create method named " +data +"\n" );
            myWriter.write("Create function named " +data +"\n" );

            myWriter.write("Put method named " +data +"\n" );
            myWriter.write("Put function named " +data +"\n" );

            //with {number} parameters
            //2 parameters
            myWriter.write("Add method named " + data + " with two parameters"+"\n" );
            myWriter.write("Add function named " + data + " with two parameters" +"\n" );

            myWriter.write("Create method named " + data +" with two parameters"+"\n" );
            myWriter.write("Create function named " + data +" with two parameters" +"\n" );

            myWriter.write("Put method named " + data + " with two parameters" +"\n" );
            myWriter.write("Put function named " + data + " with two parameters" +"\n" );

            //3 parameters
            myWriter.write("Add method named " + data + " with three parameters"+"\n" );
            myWriter.write("Add function named " + data + " with three parameters" +"\n" );

            myWriter.write("Create method named " + data +" with three parameters"+"\n" );
            myWriter.write("Create function named " + data +" with three parameters" +"\n" );

            myWriter.write("Put method named " + data + " with three parameters" +"\n" );
            myWriter.write("Put function named " + data + " with three parameters" +"\n" );

            //5 parameters
            myWriter.write("Add method named " + data + " with five parameters"+"\n" );
            myWriter.write("Add function named " + data + " with five parameters" +"\n" );

            myWriter.write("Create method named " + data +" with five parameters"+"\n" );
            myWriter.write("Create function named " + data +" with five parameters" +"\n" );

            myWriter.write("Put method named " + data + " with five parameters" +"\n" );
            myWriter.write("Put function named " + data + " with five parameters" +"\n" );


            //return type variations
            //boolean
            myWriter.write("Add method named " + data + " with return type boolean"+"\n" );
            myWriter.write("Add function named " + data + " with return type boolean" +"\n" );

            myWriter.write("Create method named " + data +" with return type boolean"+"\n" );
            myWriter.write("Create function named " + data +" with return type boolean" +"\n" );

            myWriter.write("Put method named " + data + " with return type boolean" +"\n" );
            myWriter.write("Put function named " + data + " with return type boolean" +"\n" );

            //integer
            myWriter.write("Add method named " + data + " with return type integer"+"\n" );
            myWriter.write("Add function named " + data + " with return type integer" +"\n" );

            myWriter.write("Create method named " + data +" with return type integer"+"\n" );
            myWriter.write("Create function named " + data +" with return type integer" +"\n" );

            myWriter.write("Put method named " + data + " with return type integer" +"\n" );
            myWriter.write("Put function named " + data + " with return type integer" +"\n" );

            //float
            myWriter.write("Add method named " + data + " with return type float"+"\n" );
            myWriter.write("Add function named " + data + " with return type float" +"\n" );

            myWriter.write("Create method named " + data +" with return type float"+"\n" );
            myWriter.write("Create function named " + data +" with return type float" +"\n" );

            myWriter.write("Put method named " + data + " with return type float" +"\n" );
            myWriter.write("Put function named " + data + " with return type float" +"\n" );

            //double
            myWriter.write("Add method named " + data + " with return type double"+"\n" );
            myWriter.write("Add function named " + data + " with return type double" +"\n" );

            myWriter.write("Create method named " + data +" with return type double"+"\n" );
            myWriter.write("Create function named " + data +" with return type double" +"\n" );

            myWriter.write("Put method named " + data + " with return type double" +"\n" );
            myWriter.write("Put function named " + data + " with return type double" +"\n" );

            //string
            myWriter.write("Add method named " + data + " with return type string"+"\n" );
            myWriter.write("Add function named " + data + " with return type string" +"\n" );

            myWriter.write("Create method named " + data +" with return type string"+"\n" );
            myWriter.write("Create function named " + data +" with return type string" +"\n" );

            myWriter.write("Put method named " + data + " with return type string" +"\n" );
            myWriter.write("Put function named " + data + " with return type string" +"\n" );


            //with return type after fourth method
            myWriter.write("Add method named " + data + " with return type boolean after fourth method"+"\n" );
            myWriter.write("Add function named " + data + " with return type boolean after fourth method" +"\n" );

            myWriter.write("Create method named " + data +" with return type boolean after fourth method"+"\n" );
            myWriter.write("Create function named " + data +" with return type boolean after fourth method" +"\n" );

            myWriter.write("Put method named " + data + " with return type boolean after fourth method" +"\n" );
            myWriter.write("Put function named " + data + " with return type boolean after fourth method" +"\n" );


            //#### Add method... ####
            myWriter.write("Add method " +data +"\n" );
            myWriter.write("Add function " +data +"\n" );

            myWriter.write("Create method " +data +"\n" );
            myWriter.write("Create function " +data +"\n" );

            myWriter.write("Put method " +data +"\n" );
            myWriter.write("Put function " +data +"\n" );


            //with {number} parameters
            //2 parameters
            myWriter.write("Add method " + data + " with two parameters" +"\n" );
            myWriter.write("Add function " + data + " with two parameters" +"\n" );

            myWriter.write("Create method " + data + " with two parameters" +"\n" );
            myWriter.write("Create function " + data + " with two parameters" +"\n" );

            myWriter.write("Put method " + data + " with two parameters" +"\n" );
            myWriter.write("Put function " + data + " with two parameters" +"\n" );

            //3 parameters
            myWriter.write("Add method " + data + " with three parameters" +"\n" );
            myWriter.write("Add function " + data + " with three parameters" +"\n" );

            myWriter.write("Create method " + data + " with three parameters" +"\n" );
            myWriter.write("Create function " + data + " with three parameters" +"\n" );

            myWriter.write("Put method " + data + " with three parameters" +"\n" );
            myWriter.write("Put function " + data + " with three parameters" +"\n" );

            //5 parameters
            myWriter.write("Add method " + data + " with five parameters" +"\n" );
            myWriter.write("Add function " + data + " with five parameters" +"\n" );

            myWriter.write("Create method " + data + " with five parameters" +"\n" );
            myWriter.write("Create function " + data + " with five parameters" +"\n" );

            myWriter.write("Put method " + data + " with five parameters" +"\n" );
            myWriter.write("Put function " + data + " with five parameters" +"\n" );


            //return type variations
            //boolean
            myWriter.write("Add method " + data + " with return type boolean"+"\n" );
            myWriter.write("Add function " + data + " with return type boolean" +"\n" );

            myWriter.write("Create method " + data +" with return type boolean"+"\n" );
            myWriter.write("Create function " + data +" with return type boolean" +"\n" );

            myWriter.write("Put method " + data + " with return type boolean" +"\n" );
            myWriter.write("Put function " + data + " with return type boolean" +"\n" );

            //integer
            myWriter.write("Add method " + data + " with return type integer"+"\n" );
            myWriter.write("Add function " + data + " with return type integer" +"\n" );

            myWriter.write("Create method " + data +" with return type integer"+"\n" );
            myWriter.write("Create function " + data +" with return type integer" +"\n" );

            myWriter.write("Put method " + data + " with return type integer" +"\n" );
            myWriter.write("Put function " + data + " with return type integer" +"\n" );

            //float
            myWriter.write("Add method " + data + " with return type float"+"\n" );
            myWriter.write("Add function " + data + " with return type float" +"\n" );

            myWriter.write("Create method " + data +" with return type float"+"\n" );
            myWriter.write("Create function " + data +" with return type float" +"\n" );

            myWriter.write("Put method " + data + " with return type float" +"\n" );
            myWriter.write("Put function " + data + " with return type float" +"\n" );

            //double
            myWriter.write("Add method " + data + " with return type double"+"\n" );
            myWriter.write("Add function " + data + " with return type double" +"\n" );

            myWriter.write("Create method " + data +" with return type double"+"\n" );
            myWriter.write("Create function " + data +" with return type double" +"\n" );

            myWriter.write("Put method " + data + " with return type double" +"\n" );
            myWriter.write("Put function " + data + " with return type double" +"\n" );

            //string
            myWriter.write("Add method " + data + " with return type string"+"\n" );
            myWriter.write("Add function " + data + " with return type string" +"\n" );

            myWriter.write("Create method " + data +" with return type string"+"\n" );
            myWriter.write("Create function " + data +" with return type string" +"\n" );

            myWriter.write("Put method " + data + " with return type string" +"\n" );
            myWriter.write("Put function " + data + " with return type string" +"\n" );


            //with return type after fourth method
            myWriter.write("Add method " + data + " with return type boolean after fourth method"+"\n" );
            myWriter.write("Add function " + data + " with return type boolean after fourth method" +"\n" );

            myWriter.write("Create method " + data +" with return type boolean after fourth method"+"\n" );
            myWriter.write("Create function " + data +" with return type boolean after fourth method" +"\n" );

            myWriter.write("Put method " + data + " with return type boolean after fourth method" +"\n" );
            myWriter.write("Put function " + data + " with return type boolean after fourth method" +"\n" );




        }
        myReader.close();
        myWriter.close();
        System.out.println("Done");
        System.out.println("######################################");
    }
}
