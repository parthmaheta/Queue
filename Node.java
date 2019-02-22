package myCollection;
class Node<T>{
   T Data;
   Node Next;
   
   Node(){ 
    Next=null;
	}
	
  Node(T value)
  {
    Data = value;
	Next = null;
  }
  Node(T value,Node N)
  {
     Data=value;
	 Next=N;
  }
   
}