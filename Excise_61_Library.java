import java.util.*;
class Library{
String[] books;
int No_Of_books;

  Library(){
    this.books = new String[100];
    this.No_Of_books = 0;
  }


    public void addBook(String book){
       this.books[No_Of_books] = book;
       No_Of_books++;
       System.out.println(book+" book has been added");
    }

    public void showAvailableBook(){
       System.out.println("available books are:");

       for(String book:this.books ){
        if(book == null){
            continue;
        }
        System.out.println("* " + book);
       }
    }


    public void issueBook(String book){
       for(int i=0;i<this.books.length;i++){
        if(this.books[i].equals(book))
       {
             System.out.println("the book hasbeen issued!");
           this.books[i]  = null;
           return;
        }
        System.out.println("this book does not exist");
       }
    }

    public void returnBook(String book){
      addBook(book);

    }

}


public class Excise_61_Library {
    public static void main(String[] args) {
        
        Library centralLibrary = new Library();
        centralLibrary.addBook("life is alone");
        centralLibrary.addBook("motivated by own");
        centralLibrary.addBook("Algorithims");
        centralLibrary.showAvailableBook();


        centralLibrary.issueBook("Algorithims");
        centralLibrary.showAvailableBook();
        centralLibrary.returnBook("Algorithims");
        centralLibrary.showAvailableBook();
    }
}
