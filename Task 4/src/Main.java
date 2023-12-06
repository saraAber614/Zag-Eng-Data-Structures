

public class Main {
    public static void main(String[] args) {
      LinkedList input= new LinkedList();

      input.addFirst(100);
      input.addFirst(200);
      input.addFirst(300);

      input.addLast(700);
      input.addLast(50);
      input.printElements();
       input.removeFirst();
       input.removeLast();
       input.indexof(300);
       input.printElements();

       input.max();
        input.min();
        input.size();
        input.contains(10);

    }
}