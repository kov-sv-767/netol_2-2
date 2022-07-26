public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }
    public long maxSale(long []sales) {
        long max = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
            }
        }
        return max;
    }
    public long minSale(long[] sales) {
        long min = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < min) {
                min = sales[i];
            }
        }
        return min;
    }
    public long averageValue(long[] sales) {
        long sum = sales[0];
        long cutSum = 0;
        for (int i = 1; i < sales.length; i++) {
            sum += sales[i];
        }
        cutSum = sum - maxSale(sales)-minSale(sales);
        return ((cutSum)/(sales.length-2));
    }
}
