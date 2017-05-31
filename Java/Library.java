import java.util.*;

public class Library {
	
	public Library() {
		
	}
	
	public void getFinishedBooks(HashMap<String,Boolean> library) {
		if (library.size() < 1) {
			System.out.println("Library is empty.");
		}
		else {
			for(String book : library.keySet()) {
				if (library.get(book)) {
					System.out.println(book);
				}
			}
		}
	}
	
	// The below function is optional for Codecademy submission
	
	public void getUnfinishedBooks(HashMap<String,Boolean> library) {
		if (library.size() < 1) {
			System.out.println("Library is empty.");
		}
		else {
			for(String book : library.keySet()) {
				if (!library.get(book)) {
					System.out.println(book);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		HashMap<String,Boolean> myBooks = new HashMap<String,Boolean>();
		myBooks.put("Road Down The Funnel",true);
		myBooks.put("Rat: A Biology",false);
		myBooks.put("TimeIn",true);
		myBooks.put("3D Food Printing",false);
		
		Library myLibrary = new Library();
		System.out.println("Finished books: ");
		myLibrary.getFinishedBooks(myBooks);
		System.out.println("Unfinished books: ");
		myLibrary.getUnfinishedBooks(myBooks);
		
	}
}