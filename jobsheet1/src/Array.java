
public class Array {
    public Array() {
    }

    public static void main(String[] args) {
        String[] namaBunga01D = new String[]{"Algonema", "Keladi", "Alocasia", "Mawar"};
        int[] tanamanMati01D = new int[]{1, 2, 0, 5};
        int income = 0;
        int[][] royalGarden01D = new int[][]{{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
        int[] hargaTanaman01D = new int[]{75000, 50000, 60000, 10000};
        System.out.println("-- Royal Garden -- ");
        stock(namaBunga01D, royalGarden01D, hargaTanaman01D);

        for(int i = 0; i < royalGarden01D[0].length; ++i) {
            royalGarden01D[0][i] -= tanamanMati01D[i];
            income += royalGarden01D[0][i] * hargaTanaman01D[i];
        }

        System.out.println("Total pendapatan RoyalGarden 1 : " + income);
    }

    static void stock(String[] namaBunga, int[][] royalGarden, int[] harga) {
        int[] stock = new int[]{0, 0, 0, 0};
        System.out.println("Stock Tanaman Seluruh Cabang");

        for(int i = 0; i < stock.length; ++i) {
            System.out.printf("RoyalGarden %d   ", i + 1);

            for(int j = 0; j < royalGarden[i].length; ++j) {
                stock[i] += royalGarden[j][i];
            }

            System.out.println(namaBunga[i] + " : " + stock[i] + " --> Rp. " + harga[i]);
        }

    }
}
