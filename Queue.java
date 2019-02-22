package myCollection;

public class Queue<T>{
   Node<T> Front=null;
   Node<T> Rear=null;
  
   public  <T> void enqueue(T value)
   {
	   if(Rear==null)
	   {  Rear=new Node(value);
	       Front=Rear;
       }
	   else
	   {   Rear.Next=new Node(value);
	       Rear=Rear.Next;
	   }
   }
   
   public void dequeue()
   {
	   if(Front==null)
		   System.out.println("Queue Is Empty");
	   else if(Front==Rear)
		    Rear=Front=null;
	   else
			Front=Front.Next;
   }
   
   public void peek()
   {
	  if(Front==null)
		   System.out.println("Queue Is Empty");
      else
           System.out.println("\t"+Front.Data);   		  
   }
   
   public void printQueue()
   {
	   Node Obj=Front;
	   if(Front==null)
		   System.out.println("Queue Is Empty");
	   else
		   while(Obj!=null)
		   {
			   System.out.println(Obj.Data);
			   Obj=Obj.Next;
		   }
   }
}