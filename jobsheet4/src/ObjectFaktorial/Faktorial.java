package ObjectFaktorial;

public class Faktorial {
    public int nilai;
    public long start;
    public int faktorialBF(int n) {
        this.start = System.nanoTime();
        int fakto = 1; // 1
        for (int i = 1; i <= n; i++) { // 1
            fakto *= i;    // 1
        }

        return fakto; // 1

        // 1 + n (1 + 1) + 1
        // 1 + n*2 + 1
        // n*2
        // n = O(n)

        // misal n = 20
        // 1 + 20 (1 + 1) + 1
        // 1 + 20*2 + 1
        // 1 + 20*2 + 1
        // 42

    }

    public int faktorialDC(int n) {
        if (n == 1) { // 1
            return 1; // 1
        } else {
            int fakto = n * faktorialDC(n-1); // 1
            return fakto; // 1
        }
        // misal n = 4
        //    4    *   3     *    2    *   1
        // (1 + 1) + (1 + 1) + (1 + 1) + 1 + 1
        // 2 + 2 + 2 + 1 + 1
        // 8 = n * 2 = O(n) karena jumlah perhitungan tergantung pada jumlah n
        // misal n = 20
        // (1+1) * (20-1) + 1 + 1
        // 2 * 19  + 1 + 1
        // 40
    }
    void getRunningTime() {
        System.out.println("Time Execution : " + (System.nanoTime() - this.start) + " ns");
    }
}
