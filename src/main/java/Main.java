import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import branches.BranchesCreation;
import branches.CheckoutBranch;
import branches.MergeBranch;
import classes.*;
import extension.CreateExtension;
import extension.DeleteExtension;
import extension.EditExtension;
import method.AddMethod;
import method.CallMethod;
import method.ChangeMethods;
import method.DeleteMethod;
import protocol.AddProtocol;
import protocol.DeleteProtocol;
import protocol.EditProtocol;
import struct.AddStruct;
import struct.DeleteStruct;
import struct.EditStruct;
import variable.*;
import variantsEnum.AddEnum;
import variantsEnum.DeleteEnum;
import variantsEnum.EditEnum;
import variantsInterface.AddInterface;
import variantsInterface.DeleteInterface;
import variantsInterface.EditInterface;

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
            //IncrementVariables.generate();
            //IterateArrays.generate();

            AddClass.generate();
            DeleteClass.generate();
            EditClass.generate();
            ExtendClass.generate();
            ImplementInterfaces.generate();
            ImplementProtocol.generate();

            CreateExtension.generate();
            DeleteExtension.generate();
            EditExtension.generate();

            AddProtocol.generate();
            DeleteProtocol.generate();
            EditProtocol.generate();

            AddStruct.generate();
            DeleteStruct.generate();
            EditStruct.generate();

            AddEnum.generate();
            DeleteEnum.generate();
            EditEnum.generate();

            AddInterface.generate();
            DeleteInterface.generate();
            EditInterface.generate();

        } catch (FileNotFoundException e) {
            System.out.println("File Not found exception occurred");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("IOException occurred");
            e.printStackTrace();
        }
    }
}
