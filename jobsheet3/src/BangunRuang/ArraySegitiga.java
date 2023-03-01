package BangunRuang;

public class ArraySegitiga {
    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];

        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.printf("Segitiga ke-%d dengan panjang alas %d dan tinggi %d:\n", (i+1), sgArray[i].alas, sgArray[i].tinggi);
            System.out.println("Luas Segitiga : " + sgArray[i].hitungLuas());
            System.out.println("Keliling Segitiga : " +  sgArray[i].hitungKeliling());
        }
    }

}
