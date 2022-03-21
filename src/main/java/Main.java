import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import branches.BranchesCreation;
import branches.CheckoutBranch;
import branches.MergeBranch;
import method.AddMethod;
import method.CallMethod;
import method.ChangeMethods;
import method.DeleteMethod;
import variable.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello....");
        System.out.println("Initializing program....");
        try {

            //branches
            /*BranchesCreation.generate();
            CheckoutBranch.generate();
            MergeBranch.generate();

            //methods
            AddMethod.generate();
            CallMethod.generate();
            ChangeMethods.generate();
            DeleteMethod.generate();

            //variables
            ChangeVariables.generate();
            DecrementVariable.generate();
            DeleteVariables.generate();*/
            IncrementVariables.generate();
            //IterateArrays.generate();


        } catch (FileNotFoundException e) {
            System.out.println("File Not found exception occurred");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("IOException occurred");
            e.printStackTrace();
        }
    }
}
