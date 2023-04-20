import java.util.Comparator;

public class BookComparetor implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().hashCode()-o2.getTitle().hashCode();
    }

  

    
}