// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DynamicArray array=new DynamicArray(2);
        array.insert(1000);
        array.insert(50);
        array.insert(30);
        array.insert(10);
        //array.removeAt(1);
        System.out.println( array.indexOf(30));
        System.out.println(array.max());
        System.out.println(array.min());
        array.remove(10);
        array.print_Array();
    }
}