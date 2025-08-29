// Java Program to Illustrate book Class that
// takes Input from the books and related informati
// Importing required classes
import java.util.Scanner;

// Class
public class book {

    // Class data members
    public int sNo;
    public String bookName;
    public String authorName;
    public int bookQty;
    public int bookQtyCopy;

    // Creating object of Scanner class to
    // read input from users
    Scanner input = new Scanner(System.in);

    // Constructor to add book details
    public book()
    {
        System.out.println("Enter Serial No of Book:");
        this.sNo = input.nextInt();
        input.nextLine();

        System.out.println("Enter Book Name:");
        this.bookName = input.nextLine();

        System.out.println("Enter Author Name:");
        this.authorName = input.nextLine();

        System.out.println("Enter Quantity of Books:");
        this.bookQty = input.nextInt();
        this.bookQtyCopy = this.bookQty;
    }

    // Override equals for book comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        book other = (book) obj;
        return sNo == other.sNo &&
               bookName.equalsIgnoreCase(other.bookName) &&
               authorName.equalsIgnoreCase(other.authorName);
    }
}
