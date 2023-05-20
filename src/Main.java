public class Main
{
    public static void main(String[] args)
    {
        Printable[] printables = new Printable[6];
        printables[0] = new Magazine();
        printables[1] = new Magazine();
        printables[2] = new Magazine();
        printables[3] = new Book();
        printables[4] = new Book();
        printables[5] = new Book();

        for (Printable printable : printables) {
            printable.print();
        }
        
    }
}
