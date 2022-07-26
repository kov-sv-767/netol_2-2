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
}
