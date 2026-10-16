//Question 4: Default vs Public Access (Two Classes in Same File)

//WAP to create a class Book with:

//A default (no modifier) variable title.

//A public method printTitle() that prints the title.

//In your Driver class main method, create a Book object, set the title directly (e.g., b.title = "Java Basics";), and call printTitle().




class DriverBook
{
	public static void main(String args[])
	{
		Book myBook = new Book();
		myBook.title = " WAHOO...! ";
		
		myBook.printTitle();
	}

}