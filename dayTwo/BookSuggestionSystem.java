import java.util.ArrayList;
import java.util.Scanner;

public class BookSuggestionSystem {

    static ArrayList<String> books = new ArrayList<>();

    public static void getOptions() {

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Select menu option:");
        int number = inputCollector.nextInt();
        String string = inputCollector.nextLine();

        switch (number) {

            default:
                System.out.println("Invalid input");
        }

    }
    
    public static String generateRandomBook(String[] books) {
    
        java.util.Random randomBookGenerator = new java.util.Random();
    
        int randomIndex = randomBookGenerator.nextInt(books.length);
        int randomPage = randomBookGenerator.nextInt(100);
    
        String randomBook = books[randomIndex] + ", page: " + randomPage;
    
        // System.out.println(randomBook);
        
        return randomBook;
    }

    public static void main(String[] args) {
        
        // getOptions();
        
        String[] books = {"Sizwe Bansi" , "Old man and the Sea", "Bright Hemmingway", "Lord of the rings", "Green Rider"};
        
        // // System.out.println(books[0]);
        
        System.out.println(generateRandomBook(books));
        
System.out.println("""
                
    Welcome to the Book Suggestion System!
    
        1. Get Suggestions
        2. Add Book
        3. Remove Book
        4. Update book
        5. Show books
                
                """);
    }
}
