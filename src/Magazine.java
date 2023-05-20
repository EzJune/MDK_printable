public class Magazine implements Printable
{
    @Override
    public void print()
    {
        System.out.println("Printing magazines");
    }

    public static void printMagazines(Printable[] printable)
    {
        printable = new Printable[3];
        printable[0] = new Magazine();
        printable[1] = new Magazine();
        printable[2] = new Magazine();
    }
}
