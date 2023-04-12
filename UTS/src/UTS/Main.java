package UTS;

public class Main {
    public static void main(String[] args) {

        String nama = "Achmad Raihan Fahrezi Effendy";
        int[] nim =  {2,2,4,1,7,2,0,1,9,2};
        System.out.println(nama);

        int[] hasil = konversiNama(nama);
        int[] result = new int[nama.length() + nim.length];

        for (int i = 0; i < nim.length; i++) {
            result[i] = nim[i];
        }
        int k = 0;
        for (int i = nim.length; i < result.length; i++) {
//            for (int j = 0; j < hasil.length; j++) {
                result[i] = hasil[k++];
//            }
        }
        int[] sort = bubbleSort(result);

        System.out.print("result = ");
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + ",");
        }

        System.out.println("\nBinary Search (2): ");
        System.out.println(FindBinarySearch(sort, 2, 0, sort.length));
    }

    static int[] konversiNama(String value) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] result = new int[value.length()];
        for (int i = 0; i < value.trim().length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (value.trim().toLowerCase().charAt(i) == alphabet[j] && value.charAt(i) != ' ') {
                    result[i] = j+1;
                }
            }
        }
        return result;
    }

    static int[] bubbleSort(int[] value) {
        for (int i = 0; i < value.length - 1; i++) {
            for (int j = 1; j < value.length - i; j++ ) {
                if (value[j] < value[j - 1]) {
                    int tmp = value[j];
                    value[j] = value[j - 1];
                    value[j - 1] = tmp;
                }
            }
        }
        return value;
    }


    static  int FindBinarySearch(int[] value, int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (cari == value[mid]) {
                return mid;
            } else if(value[mid] > cari) {
                return FindBinarySearch(value,cari, left, mid - 1);
            } else {
                return FindBinarySearch(value,cari,mid + 1, right);
            }
        }
        return -1;
    }
}