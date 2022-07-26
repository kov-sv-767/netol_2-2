public class Main {

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{2, 4, 3, 7, 9, 5, 13});
        System.out.println("МаксимальнЫй объем продаж: " + salesManager.maxSale(salesManager.sales) + " ед.");
    }
}
