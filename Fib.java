
public class Fib{
	private int numOfNums;
	public Fib(int x)
	{
		numOfNums = x;
	}
	public String sequenceMaker()
	{
		int a = 0;
		int b = 1;
/*		int sum = 0;
		String result = "0";
		for (int i=2; i <= numOfNums; i++)
		{
			sum = a + b;
			a = b;
			b = sum;
			result += "," + sum;
					
		}
		return result; */
		String c = "";
		while(numOfNums > 0)
		{
			c = c + a + ",";
			a = a + b;
			numOfNums = numOfNums - 1;
			if(numOfNums > 0)
			{
				c = c + b + ",";
				b = a + b;
				numOfNums = numOfNums - 1;
			}
		}
		return c;
	}
}