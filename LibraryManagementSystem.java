//library management System
import java.util.ArrayList;
import java.util.List;

class Book{
  private String title;
  private String author;
  private String isbn;
  private Boolean isBorrowed;
  
  public Book(String title, String author,String isbn){
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.isBorrowed = false;
  }
  public String getTitle(){ 
    return title;
  }
  public String getAuthor(){
    return author;
  }
  public String getIsbn(){
    return isbn;
  }
  public Boolean isBorrowed(){
    return isBorrowed;
  }
  public void borrowBook(){
    if(isBorrowed){
      isBorrowed = true;
      System.out.println(title+ "has been borrowed");
    }
    else{
      System.out.println(title+"is already borrowed");
    }
  }
  public void returnBook(){
    if(isBorrowed){
      isBorrowed = false;
      System.out.println(title+"has been returned.");
    }else{
      System.out.println(title+" was not borrowed");
    }
  }
  public void displayDetails(){
    System.out.println("Title : "+title+"Author :"+author+"ISBN : "+isbn+"Status :"+(isBorrowed ? " borrowed" : " Availale"));
  }
}
class library{
  private List<Book> books;
    public library(){
      books = new ArrayList<>();
    }
    public void addBook(Book book){
      books.add(book);
      System.out.println(book.getTitle()+ " added to the library");
    }
    public void borrowBook(String title){
      for(Book book:books){
        if(book.getTitle().equalsIgnoreCase(title)){
          book.borrowBook();
          return;
        }
      }
      System.out.println("book not found.");
    }
    public void returnBook(String title){
      for(Book book: books){
        if(book.getTitle().equalsIgnoreCase(title)){
          book.returnBook();
          return;
        }
      }
      System.out.println("book not found.");
    }
    public void displayBooks(){
       System.out.println("\nLibrary books:");
       for(Book book: books){
         book.displayDetails();
       }
    }
}
public class LibraryManagementSystem{
  public static void main (String[] args) {
    library lib = new library();
    Book book11 = new Book("java1", "jamefess ","45235tfdg34");
    Book book12 = new Book("java2", "jamesdfs ","452353df4");
    Book book13 = new Book("java3", "jamefdbgdfs ","45235rwer34");
    Book book14 = new Book("java4", "jamesdvs ","45fdf23534");
    lib.addBook(book11);
    lib.addBook(book12);
    lib.addBook(book13);
    lib.addBook(book14);
        lib.displayBooks();
        lib.borrowBook("Java1");
        lib.displayBooks();
        lib.returnBook("Java1");
        lib.displayBooks();
    
    
    
  }
}










