public class Book implements Printable {
    private String title;
    public Book(String title){
        this.title = title;
    }
    @Override
    public void print(){
        System.out.println("Книга : " + title);
    }
    public static void printBooks(Printable[] printable) {
        System.out.println("Назва книги : ");
        for (Printable item : printable) {
            if (item instanceof Book) {
                item.print();
            }
        }
    }
}
