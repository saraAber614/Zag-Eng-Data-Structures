import java.util.NoSuchElementException;

public class LinkedList{
  private class Node {
    public Node(int Num){
      this.value=Num;
    }
     int value;
      Node nextNode;
  }
  private Node first;
  private Node last;

  public void addFirst(int value){ //receive values and add it in the front of linked list
    Node node= new Node(value);
    if(first==null)
       first=last=node;
    else {
        node.nextNode = first;
        first = node;
    }
  }
   public void addLast(int item){ //add values in the last of linked list
       Node node=new Node(item);
      if(first==null)
           first=last=node;
       else {
           last=node;
       }

   }
   public void removeFirst(){ //remove value from the head of linked list
      if (first==null)
          throw new NoSuchElementException("not exist List");
      else if (first==last) {
          first=last=null;
      }
         Node temp=first;
         first=first.nextNode;
         temp=null;
   }

   public void removeLast() {  //remove value from the tail of linked list
       if (last == null)
           throw new NoSuchElementException("not exist List");
       else if (first == last) {
           first = last = null;
       }
       Node beforeLast = first;
       Node current = first;
       while (current.nextNode != null){
           beforeLast = current.nextNode;
       }
       last=beforeLast;
       last.nextNode=null;

   }
   public int indexof(int value){  //to return the index of this value
     if(first==null)
         throw new NoSuchElementException("not exist List");

     Node current=first;
     int count=0;

     while(current!=null) {
         if (current.value == value)
             return count;

         count++;
         current=current.nextNode;
     }
       return -1;
   }
    public boolean contains(int value){  //to know if the value is exist or no
      int index= indexof(value);
       return index !=-1;
    }

    public int size(){  //return the size of the linked list.
        int count=0;
        Node current=first;

        while(current != null) {
            current=current.nextNode;

             count++;
        }
        return count;
    }
    public Node printElements(){  //print all values in linked list
      Node current=first;
      while(current!=null) {
          System.out.println(current);
          current = current.nextNode;
      }
      return current;
    }
    public Node max(){  //return max value in  linked list
        Node max = first;
        Node current=first;
        while(current != null)
            if (current>max)  // ?!!!
                max=current;
        current.nextNode=current;

        return max;
    }
    public Node min(){  // return min value in linked list.
        Node min = first;
        Node current=first;
        while(current != null)
            if (current < min)  // ?!!!
                min=current;
        current.nextNode=current;

        return min;
    }



}
