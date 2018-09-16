import java.util.HashMap;

/**
 * Represents a collection of BuddyInfo objects
 * @author Ehren Julien-Neitzert
 * 
 */

public class AddressBook {
	HashMap<String, BuddyInfo> buddies;
	
	public static void main(String args[]) {
		System.out.println("Address book");
		AddressBook book = new AddressBook();
		book.addBuddy(new BuddyInfo("Trevor", false));
		book.removeBuddy("Trevor");
	}
	
	/**
	 * Creates a new AddressBook
	 */
	public AddressBook() {
		buddies = new HashMap<String, BuddyInfo>();
	}
	
	/**
	 * Adds a BuddyInfo to the AddressBook
	 * @param buddy the BuddyInfo object to add
	 */
	public void addBuddy(BuddyInfo buddy) {
		buddies.put(buddy.getName(), buddy);
	}
	
	/**
	 * Removes some BuddyInfo from the AddressBook
	 * @param buddyName The name of the buddy to remove
	 */
	public void removeBuddy(String buddyName) {
		buddies.remove(buddyName);
	}
}
