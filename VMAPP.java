import java.util.*;
public class VMAPP
{  
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
       Vector v=new Vector();
    do{
          System.out.println("Case 1 : Add elements in vactor");
         System.out.println("Case 2 : Size of vector");
         System.out.println("Case 3 : Display vactor");
         System.out.println("Case 4 : Search elements");
         System.out.println("Case 5 : Remove elements from vector");
         System.out.println("Case 6 : exit");
   
         
         System.out.println("Enter the choice");
         int ch=sc.nextInt();
        
      switch(ch)
      {
         case 1:
                  System.out.println("Enter the elements in vector");
                  int val=sc.nextInt();
                  v.add(val);
                  System.out.println("Value is added");
                  break;
          case 2:
                 System.out.println("Size of vector is"+v.size());
                 break;
          case 3:
                  Iterator i=v.iterator();
                  while(i.hasNext())
                  {  
                      Object obj=i.next();
                      System.out.println(obj);
                  }
                     break;
 
           case 4:
                    System.out.println("Enter element for searching");
                    int num=sc.nextInt();
                    boolean a=v.contains(num);
                    if(a)
                    { System.out.println("Value is found");
                    }
                   else
                    { System.out.println("Value not found");
                    }
                 
                    break;
            case 5:
                    System.out.println("Enter data for deleting");
                     val=sc.nextInt();
                   int ind=v.indexOf(val);
                  if(ind!=-1)
                  {   v.remove(ind);
                      System.out.println("element is remove");
                  } 
                     break;

            case 6:
                    System.exit(0);
                 
            default:
                       System.out.println("Choice miss match");
                       break;
      }//switch


    }while(true);

  }
}