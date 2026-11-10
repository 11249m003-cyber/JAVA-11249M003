class SalesArray {
    public static void main(String[] args) {

        int sales[] = {12000, 15000, 10000, 18000,
                       9000, 20000, 14000, 16000,
                       11000, 22000, 13000, 17000};

        int max = sales[0];
        int min = sales[0];

        for (int i = 1; i < 12; i++) {
            if (sales[i] > max) {
                max = sales[i];
            }

            if (sales[i] < min) {
                min = sales[i];
            }
        }

        System.out.println("Highest Sales: " + max);
        System.out.println("Lowest Sales: " + min);
    }
}
