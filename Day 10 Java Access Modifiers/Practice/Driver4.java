public class Driver4 {
    public static void main(String[] args) {
        Book myBook = new Book();

        // Direct access is allowed because both classes share the default package
        myBook.title = "Java Basics";

        myBook.printTitle();
    }
}