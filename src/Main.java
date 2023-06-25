public class Main {
    public static void main(String[] args) {
        Printable[] print = new Printable[4];
        print[0] = new Book("Джава");
        print[1] = new Magazine("Математика");
        print[2] = new Book("Історія");
        print[3] = new Magazine("Інформатика");

        Printable printable = () -> System.out.println(" ");

        for (Printable printable1 : print) {
            printable1.print();
        }
        printable.print();
        Magazine.printMagazines(print);
        Book.printBooks(print);
    }
}