package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 13;
		boolean isPrime = true;
		
		if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a divisor, so it's not prime
                    break;
                }
            }
		

	}
		 if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

}
}