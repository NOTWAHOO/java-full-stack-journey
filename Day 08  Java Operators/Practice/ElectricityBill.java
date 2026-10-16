class ElectricityBill
{
    public static void main(String args[])
    {
        String name = args[0];
        int unit = Integer.parseInt(args[1]);

        int rate = (unit <= 100) ? 2 :
                   (unit > 100 && unit <= 200) ? 3 : 5;

        int totalBill = unit * rate;

        System.out.println("Customer Name : " + name);
        System.out.println("Units : " + unit);
        System.out.println("Rate : Rs. " + rate + " per unit");
        System.out.println("Total Bill : Rs. " + totalBill);
    }
}