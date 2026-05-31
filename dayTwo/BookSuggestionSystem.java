import java.util.ArrayList;

public class BookSuggestionSystem {
    
    public static void generateRandomBook(ArrayList<String> books) {
        if(books.isEmpty()) {
            System.out.println("No books available. Add some books first!");
            return;
        }
    
        java.util.Random randomGenerator = new java.util.Random();
    
        int randomIndex = randomGenerator.nextInt(books.size());
        String randomBook = books.get(randomIndex);
        int randomPage = randomGenerator.nextInt(100) + 1;
    
        
        System.out.println("Book title: " + randomBook);
        System.out.println("page: " +randomPage);
    }
    

    public static void removeFromBooksArray(ArrayList<String> books, String bookName) {
       
        if(books.remove(bookName)) {
            System.out.println(bookName + " removed successfully!");
        } else {
            System.out.println(bookName + " not found in list.");
        }
    }
    
    public static void showAllBooks(ArrayList<String> books){
        if(books.isEmpty()) {
            System.out.println("No books added yet.");
            return;
        }
        System.out.println("\nYour books:");
        for(int index = 0; index < books.size(); index++) {
            System.out.println((index+1) + ". " + books.get(index));
        }
    }
    
    
    public static void main(String[] args){
    
        ArrayList<String> books = new ArrayList<>();
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
                    
        String bookOpen = "yes";
        
        while(bookOpen.equalsIgnoreCase("yes")){
        
        System.out.println("""
        Welcome to the Book Suggestion System!
        
            1. Get Suggestions
            2. Add Book
            3. Remove Book
            4. Update book
            5. Show books
        
        Select option to begin
                    """);
        
            int option = inputCollector.nextInt();
            inputCollector.nextLine(); 
            
            switch(option){
            
            case 1:
                if(books.isEmpty()) {
                    System.out.println("No books available. Add some books first!");
                    break;
                }
                
                String choice;
                do {
                    generateRandomBook(books);
                    
                    System.out.print("Would you like to get another suggestion? (yes/no): ");
                    choice = inputCollector.nextLine();
                    
                } while(choice.equalsIgnoreCase("yes"));
                
                break;
                    
                case 2:
                    System.out.print("Enter book name: ");
                    String bookName = inputCollector.nextLine();
                    books.add(bookName);
                    System.out.println("Book added successfully!");
                    break;
                    
                case 3:
                    System.out.print("Enter book name to remove: ");
                    String removeName = inputCollector.nextLine();
                    removeFromBooksArray(books, removeName);
                    break;
                    
                case 4:
                    showAllBooks(books);
                    break;
                    
                case 5:
                    showAllBooks(books);
                    break;
                    
                default:
                    System.out.println("Invalid Entry");
                    break;
            }
        }


    }
}
