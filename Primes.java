
public class Primes {
	public boolean isPrime(int x)
	{
		for(int i = 2; i < Math.sqrt(x); i++)
		{
			if(x%i == 0)
				return false;
		}
		return true;
	}
	public int lowPrimeFact(int x)
	{
		for(int i = 2; i < Math.sqrt(x); i++)
		{
			if(x%i == 0)
				return i;
		}
		return x;
	}
}
