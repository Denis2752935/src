public class SalesManager {
    protected long[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max(long i) {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

}
