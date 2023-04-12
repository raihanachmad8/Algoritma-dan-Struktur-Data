package UTS;

public class Main {
    public static void main(String[] args) {

        String nama = "Achmad Raihan Fahrezi Effendy";
        for (int i = 0; i < nama.length(); i++) {
            System.out.print(konversiNama(nama)[i] + " ");
        }
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
        int[] sort = insertionSort(result);

        System.out.print("result = ");
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + ",");
        }

        System.out.println("\nSequantial Search (2): ");
        System.out.println(sequentialSearch(sort, 2));
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

    static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }


    public static int sequentialSearch(int[] arr, int target) {
        int posisi = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target && posisi == -1) {
                posisi = i;
            } else if (arr[i] == target && posisi != -1) {
                System.err.println("Peringantan terdapat data yang sama!!");
            }
        }
        return posisi;
    }

}