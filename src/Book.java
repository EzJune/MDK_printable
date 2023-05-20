

public class Book implements Printable {


    @Override
    public void print() {
        System.out.println("Printing Books");
    }

    public static void printBooks(Printable[] printable) {
        printable = new Printable[3];
        printable[0] = new Book();
        printable[1] = new Book();
        printable[2] = new Book();


    }

}