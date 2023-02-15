public class Fungsi {

    public static void main(String[] args) {
        String[] namaBunga01D = {"Algonema", "Keladi", "Alocasia", "Mawar"};
        int[][] royalGarden01D = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };
        int[] hargaTanaman01D = {75_000, 50_000, 60_000, 10_000};
        System.out.println("Total Stock seluruh cabang : " + drawTableTotalStock(namaBunga01D, royalGarden01D));
    }

    static int drawTableTotalStock(String[] namaBunga, int[][] royalGarden) {
        int[] stock = {0,0,0,0};
        int total = 0;
        System.out.print(centerString("",20));
        for (int i = 0; i < namaBunga.length; i++) {
            System.out.printf("%s", centerString(namaBunga[i],20));
        }
        System.out.println("");
        for (int i = 1; i <= royalGarden.length; i++) {
            System.out.print(centerString("RoyalGarden" + i, 20));
            for (int j = 0; j < royalGarden[i-1].length; j++) {
                System.out.printf(centerString(String.valueOf(royalGarden[i-1][j]),20));
            }
            System.out.println();
        }
        System.out.println("Stock Tanaman Seluruh Cabang");
        for (int i = 0; i < stock.length; i++) {
            System.out.print(centerString("RoyalGarden" + (i+1), 20));
            for (int j = 0; j < royalGarden[i].length; j++) {
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
        for (int i = 0; i < pad01D; i++) {
            result01D += " ";
        }
        result01D+= value;
        for (int i = result01D.length(); i < length; i++) {
            result01D += " ";
        }
        return result01D;
    }
}

