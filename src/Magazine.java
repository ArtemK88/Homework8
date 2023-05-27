public class Magazine implements Printable{
    private String title;
    public Magazine(String title){
        this.title = title;
    }
    @Override
    public void print(){
        System.out.println("Журнал : " + title);
    }
    public static void printMagazines(Printable[] printable) {
        System.out.println("Назва журналу : ");
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                item.print();
            }
        }
    }
}