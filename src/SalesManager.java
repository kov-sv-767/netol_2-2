public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }
    public int maxSale(int[] sales) {
        int max = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
            }
        }
        return max;
    }
    public int minSale(int[] sales) {
        int min = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < min) {
                min = sales[i];
            }
        }
        return min;
    }
    public int averageValue(int[] sales) {
        int sum = sales[0];
        int cutSum = 0;
        for (int i = 1; i < sales.length; i++) {
            sum += sales[i];
        }
        cutSum = sum - maxSale(sales)-minSale(sales);
        return ((cutSum)/(sales.length-2));
    }
}
