 public class Book
{
	int bookId;
	String title;
	int copiesSold;
	double pricePerCopy;
	
	Book(int bookId,String title, int copiesSold, double pricePerCopy)
	{
		this.bookId = bookId;
		this.title = title;
		this.copiesSold = copiesSold;
		this.pricePerCopy = pricePerCopy;
	}
	double calculateTotalEarnings()
	{
		return copiesSold * pricePerCopy;
	}
	void displayBookDetails()
	{
	System.out.println("Books : " +bookId);
	System.out.println("Title : " +title);
	System.out.println("Copies Sold : " +copiesSold);
	System.out.println("Price Per Copy : " +pricePerCopy);
	System.out.println("Total cost profit : " +calculateTotalEarnings());
	
	}
}