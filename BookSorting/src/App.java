import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        Book b1 = new Book("c", 534, "A","2010");
        Book b2 = new Book("d", 568, "B","2015");
        Book b3 = new Book("a", 656, "C","2018");
        Book b4 = new Book("e", 320, "D","2000");
        Book b5 = new Book("b", 177, "E","1950");
        
        Set<Book> bookSetbytitle=new TreeSet<>(new BookComparetor());

        bookSetbytitle.add(b1);
        bookSetbytitle.add(b2);
        bookSetbytitle.add(b3);
        bookSetbytitle.add(b4);
        bookSetbytitle.add(b5);

        for(Book book:bookSetbytitle){
            System.out.println(book);
        }
        System.out.println("********");

        Set<Book> bookSetbyPageNumber =new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                
                return o2.getPageCount()-o1.getPageCount();
            }

            
        });

        bookSetbyPageNumber.addAll(bookSetbytitle);

        for(Book book:bookSetbyPageNumber){
            System.out.println(book);
        }

        
        
    }
}
