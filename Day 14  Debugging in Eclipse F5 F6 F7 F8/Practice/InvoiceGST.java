
class InvoiceGSTCasual  {
	static int gst = 18;
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	
	InvoiceGSTCasual(int amount, String itemName, String billingAddress, String customerId, String customerName)
	{
		this.amount = amount;
		this.itemName = itemName;
		this.billingAddress = billingAddress;
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	void displayInvoice()
	{
	System.out.println("Amount : " +amount);	
	System.out.println("Item Name : " +itemName);
	System.out.println("Billing ddress : " +billingAddress);
	System.out.println("Billing Address : " +customerId);
	System.out.println("Customer Name : " +customerName);
	}
}	
	
	public class InvoiceGST
{
	public static void main(String args[])
	{	InvoiceGSTCasual.gst = 28;
	InvoiceGSTCasual inv = new InvoiceGSTCasual(180000, "Samsung", "Rayagada Kasturi Nagar9th Lane", "S42L1", "Stephen Sabar" );
	InvoiceGSTCasual inv1 = new InvoiceGSTCasual(180000, "Samsung", "Rayagada Kasturi Nagar9th Lane", "S42L1", "Stephen Sabar" );
		System.out.println("Amount : " + inv.amount + " Item : " + inv.itemName + "GST : " + inv.gst);
		System.out.println("Amount : " + inv1.amount + " Item : " + inv1.itemName + "GST : " + inv1.gst);
		inv.displayInvoice();
		inv1.displayInvoice();
	
	}
}
