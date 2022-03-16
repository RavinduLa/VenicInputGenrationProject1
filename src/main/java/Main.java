import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import branches.BranchesCreation;
import branches.CheckoutBranch;
import branches.MergeBranch;
import method.CallMethod;
import variable.IterateArrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello....");
        System.out.println("Initializing program....");
        try {

            //IterateArrays.generate();
            //BranchesCreation.generate();
            //CheckoutBranch.generate();
            //MergeBranch.generate();
            CallMethod.generate();

        } catch (FileNotFoundException e) {
            System.out.println("File Not found exception occurred");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("IOException occurred");
            e.printStackTrace();
        }
    }
}
