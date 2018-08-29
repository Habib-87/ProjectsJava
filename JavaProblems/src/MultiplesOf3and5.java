import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 */


public class MultiplesOf3and5 {

	
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>();
		int sum = 0;
		
		for(int i = 3 ; i< 1000; i=i+3) {
			numbers.add(i);
		}
		
		for(int i = 5 ; i< 1000; i=i+5) {
			numbers.add(i);
		}
		
		for (Iterator iterator = numbers.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			sum = sum+integer.intValue();		
		}
		System.out.println(sum);
		
	}

}
