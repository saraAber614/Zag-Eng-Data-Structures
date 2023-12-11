

public class Main {
    public static void main(String[] args) {
      linkedLisT<Double> input = new linkedLisT();

      input.addFirst(10.0);
      input.addFirst(20.5);
      input.addFirst(35.7);
      input.addFirst(10.0);
      input.addLast(7.8);
      input.addLast(50.5);
      input.printElements();
      input.removeFirst();
      input.removeLast();
      input.indexof(35.7);
      input.printElements();

        input.size();
        input.contains(10.0);
        input.reverse();
    }
}