import java.util.ArrayList;
import java.util.Scanner;

public class BookSuggestionSystem {

    static ArrayList<String> books = new ArrayList<>();
    
    public static String generateRandomBook() {
    
        java.util.Random randomGenerator = new java.util.Random();
    
        int randomIndex = randomGenerator.nextInt(books.size());
        int randomPage = randomGenerator.nextInt(100);
    
        String randomBook = books.get(randomIndex) + ", page: " + randomPage;
        
        System.out.println(randomBook);
        
        return randomBook;
    }
    
    
    public static void addToBooksArray(String bookName) {
        
        books.add(bookName);
    
        System.out.println(bookName + " added successfully!");
    }
    
    public static void getAllBooks(){
        
    }
    
    
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        
        System.out.println("""
                    
        Welcome to the Book Suggestion System!
        
            1. Get Suggestions
            2. Add Book
            3. Remove Book
            4. Update book
            5. Show books
        
        Select option to begin
                    """);
                    
        while(true){
        
            int day = inputCollector.nextInt();
            
            switch(day){
            
                case 1:
                if(books.isEmpty()) {
                    System.out.println("No books added yet.");
                }
                else {
                    System.out.println(generateRandomBook());
                }
                break;
                    
                case 2:
                    System.out.println("Enter book name:");
                    String bookName = inputCollector.nextLine();
                    addToBooksArray(bookName);

                    break;
                    
                case 3:
                    System.out.println("Update Books");
                    break;
                    
                case 4:
                    System.out.println("Show all Books");
                    break;
                    
                default:
                    System.out.println("Invalid Entry");
                    break;
            }
        }


    }
}
