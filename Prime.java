
public class Prime {
	public static void erasto (int max){
		//fast calculation with Erastothenes' filter
		long time1 = System.currentTimeMillis();
		boolean[] isPrim = new boolean[max + 1];
		// Initialisation of array
		for (int i = 0; i <= max; i++)
		isPrim[i] = true;
		// 0 and 1 are no primes
		isPrim[0] = isPrim[1] = false;
		//all mulitples of tested numbers smaller than square root of may are no primes
		int n = (int) Math.ceil(Math.sqrt(max));
		for (int i = 0; i <= n; i++)
			if (isPrim[i])
				for (int j = 2 * i; j <= max; j+=i)
					isPrim[j] =false;
		// print result out
		//System.out.print("Primes from 0 to " + max + ": ");
		//for (int i2 = 0; i2 <= max; i2++)
			//if (isPrim[i2])
				//System.out.print(" " + i2 + "\n\r ");
		

		long time2 = System.currentTimeMillis();

		long timeEnde = time2-time1;
		System.out.println("needed time: " + timeEnde + " milliseconds");
	}
	
	
	//Test with checkPrime, based on erasto
	public static boolean checkPrime (int ntest){
		boolean[] isPrim = new boolean[ntest+ 1];
		// Initialisation of array
		for (int i = 0; i <= ntest; i++)
		isPrim[i] = true;
		// 0 and 1 are no primes
		isPrim[0] = isPrim[1] = false;
		//all multiples of numbers smaller than square root of max are no primes
		int n = (int) Math.ceil(Math.sqrt(ntest));
		for (int i = 0; i <= n; i++)
			if (isPrim[i])
				for (int j = 2 * i; j <= ntest; j+=i)
					isPrim[j] =false;
		return isPrim[ntest];
	}
	//Demonstration
	public static void main (String [] args){
		erasto(2047483646);
		//if (checkPrime(9881689)==true)
			//System.out.println("It's a prime!");
	}
}
//by Niklas Götz