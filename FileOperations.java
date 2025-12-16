import java.io.File;
import java.util.*;

public class FileOperations
{ 
   public static void main(String args[])
   {
      File folder=new File("C:\\FolderCreate");
      boolean b=folder.exists();
      boolean create=folder.mkdir();
    
     if(create)
     {
       System.out.println("Folder is created");
     }  
    else
     { 
       System.out.println("Floder is exist");
     }
   }
}//class