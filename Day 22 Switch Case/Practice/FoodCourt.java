
public class FoodCourt {

    double calculateBill(String item, int quantity) {
        double unitPrice = 0.0;

        switch (item.toLowerCase()) {
            case "burger":
                unitPrice = 120.0;
                break;

            case "pizza":
                unitPrice = 250.0;
                break;

            case "sandwich":
                unitPrice = 80.0;
                break;

            case "pasta":
                unitPrice = 150.0;
                break;

            default:
                System.out.println("Item not on menu: " + item);
                return 0.0;
        }

        double total = unitPrice * quantity;

        // Apply discount if 3 or more items are ordered
        if (quantity >= 3) {
            total = total - 50.0;
        }

        return total;
    }

    public static void main(String[] args) {
        FoodCourt court = new FoodCourt();

        String item = "Pizza";
        int quantity = 3;

        double bill = court.calculateBill(item, quantity);
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total after discount: Rs. " + bill);
    }
}