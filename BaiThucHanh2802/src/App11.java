public class App11 {

    public static void main(String[] args) {
        int i, j, k;
        for (i = 0; i <= 20; ++i) {
            for (j = 0; j <= 10; ++j) {
                for (k = 0; k <= 4; ++k) {
                    if (i * 10000 + j * 20000 + k * 50000 == 200000) {
                        System.out.printf("\nCan %d to 100k, va %d to 200k, va %d to 500k", i, j, k);
                    }
                }
            }
        }
    }
}