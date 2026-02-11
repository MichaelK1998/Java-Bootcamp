public class Meeting {
    public static void main(String[] args) {
        double sales = 24309.65;
        int roundedSales = (int) sales;
        System.out.println("This month, we made " + roundedSales + " sales.");
        double profit = 18562.18;
        int roundedProfit = (int) profit;
        System.out.println("Factoring in costs, we made $" + roundedProfit + " in profit. ");
        double refunds = 688.78;
        int roundedRefunds = (int) refunds;
        System.out.println("The refunds are at a low $" + roundedRefunds +". This is a good sign! ");
        double shipping = 1233.57;
        int roundedShipping = (int) shipping;
        System.out.println("Shipping costs were high. We paid $" + roundedShipping + " in shipping. ");

    }
}
