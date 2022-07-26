public class Main {

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{2, 4, 3, 7, 9, 5, 13});
        System.out.println("МаксимальнЫй объем продаж: " + salesManager.maxSale(salesManager.sales) + " ед.");
        System.out.println("МИнимальный объем продаж " + salesManager.minSale(salesManager.sales) + " ед.");
        System.out.println("Среднее обрезанное значение объема продаж: " + salesManager.averageValue(salesManager.sales));
    }
}
