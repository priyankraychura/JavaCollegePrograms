import java.util.ArrayList;

public class PR53_LibraryManagement {
    private ArrayList<Book> books;

    private PR53_LibraryManagement(ArrayList<Book> books) {
        this.books = books;
    }

    private PR53_LibraryManagement() {
        books = new ArrayList<>();
    }

    private void insertBook(Book b){
        books.add(b);
    }

//    public void updateBook(String title, String newTitle, String newAuthor, int newPubYear, long newTimestamp){
//        for(Book b: books){
//            if(b.getTitle().equals(title)){
//                b.setTitle(newTitle);
//                b.setAuthor(newAuthor);
//                b.setPubYear(newPubYear);
//                b.setTimpstamp(newTimestamp);
//                break;
//            }
//        }
//    }

//    public void updateBook(Book bookToUpdate, String newTitle, String newAuthor, int newPubYear, long newTimestamp){
//        bookToUpdate.setTitle(newTitle);
//        bookToUpdate.setAuthor(newAuthor);
//        bookToUpdate.setPubYear(newPubYear);
//        bookToUpdate.setTimpstamp(newTimestamp);
//    }

//    public void updateBook(Book bookToUpdate, String newTitle, String newAuthor, int newPubYear, long newTimestamp){
//        int index = books.indexOf(bookToUpdate);
//        if (index != -1){
//            System.out.println("Index of this book object is: " + index);
//            Book updatedbook = new Book(newTitle, newAuthor, newPubYear, newTimestamp);
//            books.set(index, updatedbook);
//        }
//    }

    private void updateBook(Book b, String newTitle, String newAuthor, int newPubYear, long newTimestamp){
        b.setTitle(newTitle);
        b.setAuthor(newAuthor);
        b.setPubYear(newPubYear);
        b.setTimpstamp(newTimestamp);
    }

    private void removeBook(Book b){
        books.remove(b);
    }

    private Book searchBook(String title){
        for(Book b: books){
            if(b.getTitle().equals(title)){
                return b;
            }
        }
        return null;
    }

    private void displayAll(){
        for (Book b: books){
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        PR53_LibraryManagement library = new PR53_LibraryManagement();

        Book b1 = new Book("title 1", "author", 2023, System.currentTimeMillis());
        Book b2 = new Book("title 2", "author", 2023, System.currentTimeMillis());
        Book b3 = new Book("title 3", "author", 2023, System.currentTimeMillis());
        Book b4 = new Book("title 4", "author", 2023, System.currentTimeMillis());

        library.insertBook(b1);
        library.insertBook(b2);
        library.insertBook(b3);
        library.insertBook(b4);

        library.displayAll();
        library.updateBook(b3, "newTitle 3", "Priyank", 2024, System.currentTimeMillis());
        library.removeBook(b4);
        library.displayAll();

        Book foundBook = library.searchBook("newTitle 3");
        if (foundBook != null){
            System.out.println("Found book: " + foundBook.getTitle() + " by " + foundBook.getAuthor() + " published in " + foundBook.getPubYear());
        }else {
            System.out.println("Book not found!");
        }
    }
}

class Book{
    private String title;
    private String author;
    private int pubYear;
    private long timpstamp;

    public Book(String title, String author, int pubYear, long timestamp) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
        this.timpstamp = timestamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public long getTimpstamp() {
        return timpstamp;
    }

    public void setTimpstamp(long timpstamp) {
        this.timpstamp = timpstamp;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pubYear=" + pubYear +
                ", timpstamp=" + timpstamp +
                '}';
    }
}