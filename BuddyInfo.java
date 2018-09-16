/**
 * A class that represents information about a buddy
 * BuddyInfo has a name and a boolean that determines whether or not the buddy is scum, 
 * that is, a piece of human garbage. The worst of the worst.
 * @author Ehren Julien-Neitzert
 */

public class BuddyInfo {
	private String name;
	private boolean scum;
	
	/**
	 * Creates a new BuddyInfo
	 * @param name determines the name of the buddy
	 * @param scumOfTheEarth boolean describes whether the buddy is scum (the lowest of the low)
	 */
	public BuddyInfo(String name, boolean scumOfTheEarth) {
		this.name = name;
		this.scum = scumOfTheEarth;
	}
	
	public static void main(String[] args) {
		BuddyInfo trevor = new BuddyInfo("Trever", false);
		BuddyInfo noid = new BuddyInfo("noid", true);
		System.out.println("Hello " + trevor.getName());
	}
	
	/**
	 * Gets the name of the buddy
	 * @return A String representing the name of the buddy
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gives the buddy a new name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Tells you if your buddy is scum
	 * @return a boolean representing the buddy's scum status. 
	 * 
	 * If true then the buddy is unfortunately scum; a broken human being with no moral barometer. 
	 */
	public boolean isScum() {
		return scum;
	}

	/**
	 * Sets whether or not your buddy is scum
	 * @param scum a boolean. 
	 * 
	 * If true then you have spent many sleepless nights tossing and turning, 
	 * wondering why on earth this buddy of your is such a cruel, heartless 
	 * being and why you became buddies with them in the first place. 
	 * 
	 * If false then this buddy has achieved the impossible: 
	 * they have performed a miraculous act so selfless that they
	 * have redeemed themself and can no longer be considered scum. 
	 */
	public void setScum(boolean scum) {
		this.scum = scum;
	}

}
