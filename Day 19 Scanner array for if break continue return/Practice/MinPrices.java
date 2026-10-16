class MinPrices
{
public static void main (String args[])
	{
	int prices[] = {120, 45, 300, 15, 80};
	
	int min = 0;
	
	for(int i = 0; i < prices.length; i++)
		{
		if (prices[i] < min)
			{
			System.out.println("Min : " +prices[i]);
			break;
			}
		}
	}
}