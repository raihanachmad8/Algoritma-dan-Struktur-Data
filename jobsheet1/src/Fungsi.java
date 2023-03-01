import java.io.PrintStream;

public class Fungsi {
    public Fungsi() {
    }

    public static void main(String[] args) {
        String[] namaBunga01D = new String[]{"Algonema", "Keladi", "Alocasia", "Mawar"};
        int[][] royalGarden01D = new int[][]{{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
        int[] var10000 = new int[]{75000, 50000, 60000, 10000};
        PrintStream var4 = System.out;
        int var10001 = drawTableTotalStock(namaBunga01D, royalGarden01D);
        var4.println("Total Stock seluruh cabang : " + var10001);
    }

    static int drawTableTotalStock(String[] namaBunga, int[][] royalGarden) {
        int[] stock = new int[]{0, 0, 0, 0};
        int total = 0;
        System.out.print(centerString("", 20));

        int i;
        for(i = 0; i < namaBunga.length; ++i) {
            System.out.printf("%s", centerString(namaBunga[i], 20));
        }

        System.out.println("");

        int j;
        for(i = 1; i <= royalGarden.length; ++i) {
            System.out.print(centerString("RoyalGarden" + i, 20));

            for(j = 0; j < royalGarden[i - 1].length; ++j) {
                System.out.printf(centerString(String.valueOf(royalGarden[i - 1][j]), 20));
            }

            System.out.println();
        }

        System.out.println("Stock Tanaman Seluruh Cabang");

        for(i = 0; i < stock.length; ++i) {
            System.out.print(centerString("RoyalGarden" + (i + 1), 20));

            for(j = 0; j < royalGarden[i].length; ++j) {
                stock[i] += royalGarden[j][i];
                total += stock[i];
            }

            System.out.println(stock[i]);
        }

        return total;
    }

    static String centerString(String value, int length) {
        String result01D = "";
        int pad01D = (length - value.length()) / 2;

        int i;
        for(i = 0; i < pad01D; ++i) {
            result01D = result01D + " ";
        }

        result01D = result01D + value;

        for(i = result01D.length(); i < length; ++i) {
            result01D = result01D + " ";
        }

        return result01D;
    }
}