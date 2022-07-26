public class Main {

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{2, 4, 3, 7, 9, 5, 13});
        System.out.println("Максимальный объем продаж: " + salesManager.maxSale(salesManager.sales) + " ед.");
    }
}
