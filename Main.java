import myCollection.Queue;
import java.util.Scanner;
/* 
  Program Name: Queue
  Author: Parth Maheta
  Date: 21 feb,2019
  Language: java		  
  Number Of File:3
  Files Name:Main.java,Node.java,Queue.java  
  
  Description: Simple Queue Which Follow 
               First In First Out
  
  Step 1: Compile Main java File Using Command Given Below
           java -d . Node.java          //hit enter
           java -d . Queue.java  //hit enter		   
           javac Main.java             //hit enter
		   
  Step2: Run Program		   
          java Main      //hit enter	


       Thank You

 Written With Love.......	   
		   
*/
public class Main{
  public static void main(String[] args)
   {
     Scanner Scan=new Scanner(System.in);
	 int Choice=0;
	 
	 Queue<Integer> Queue1=new Queue<Integer>();
	   
	   while(Choice!=-1)
	   {
	     System.out.print("\nEnter Choice \n\t-1 For Exit \n\t 1 For Enqueue \n\t 2 For Dequeue \n\t 3 For Peek \n\t4 For Print Queue \n\t Enter Choice:");
		 Choice=Scan.nextInt();
		 Scan.nextLine();

               switch(Choice)
               {   
			       case -1:
				    System.exit(0);
					
			       case 1:
				     System.out.println("Enter Value:");
					 String value=Scan.nextLine();
				     Queue1.enqueue(value);
				   break;
				   
				   case 2:
				     Queue1.dequeue();
					 break;
					
                   case 3:
                     Queue1.peek();
                     break;

                   case 4:
                     Queue1.printQueue();
                     break;
                  
                   default:
                     System.out.println("\t\t\tEnter Proper Choice");   				   
                     				   
               }// end switch
 			   
	   }// end While
	 
   }
}