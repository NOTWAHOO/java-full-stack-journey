class ProductDetails
{
    String productName;
    int price;

    static String shopName = "ABC Store";

    public static void main(String args[])
    {
        ProductDetails product1 = new ProductDetails();
        ProductDetails product2 = new ProductDetails();
        ProductDetails product3 = new ProductDetails();

        product1.productName = "Laptop";
        product1.price = 50000;

        product2.productName = "Phone";
        product2.price = 30000;

        product3.productName = "Headphones";
        product3.price = 5000;

        product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();
    }

    void displayProduct()
    {
        System.out.println("Product : " + productName);
        System.out.println("Price : " + price);
        System.out.println("Shop Name : " + shopName);
    }
}