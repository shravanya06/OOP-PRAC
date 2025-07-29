package labprgrms;

public class appleswap {
	public static void main(String[] args) {
		int jerryBag=5;
	    int tomBag=3;
	    System.out.println("Before Swapping:");
        System.out.println("Jerry's Bag: " + 5 + " apples");
        System.out.println("Tom's Bag: " + 3 + " apples");

        // Swapping the values
        int temp = jerryBag;
        jerryBag = tomBag;
        tomBag = temp;

        // Display after swapping
        System.out.println("\nAfter Swapping:");
        System.out.println("Jerry's Bag: " + 5 + " apples");
        System.out.println("Tom's Bag: " + 3 + " apples");
    }

	    
	   
	}
		
	

