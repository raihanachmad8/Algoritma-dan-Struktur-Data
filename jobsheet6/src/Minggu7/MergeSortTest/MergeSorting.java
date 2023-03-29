package Minggu7.MergeSortTest;

import Minggu7.TestSearching.Mahasiswa;
import Minggu7.TestSearching.PencariMhs;

public class MergeSorting {
    public void mergeSort(int[] data) {
        sort(data,0, data.length - 1);
    }
    private void merge(int[] data, int left, int middle, int right) {
        int[] temp = new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        // membandingkan setiap bagian
        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }

        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            data[c + i] = temp[a + i];
        }
    }

    private void sort(int[] data, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public Mahasiswa[] mergeSortDataMhs(PencariMhs m) {
        return sortMhs(m,0, m.listMhs.length - 1);
    }
    public Mahasiswa[] sortMhs(PencariMhs m, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sortMhs(m, left, middle);
            sortMhs(m, middle + 1, right);
            return mergeMhs(m, left, middle, right);
        }
        return m.listMhs;
    }

    private Mahasiswa[] mergeMhs(PencariMhs m, int left, int middle, int right) {
        PencariMhs temp = new PencariMhs(right + 1);
        for (int i = left; i <= right; i++) {
            temp.listMhs[i] = m.listMhs[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;


        // membandingkan setiap bagian
        while (a <= middle && b <= right) {
            if (temp.listMhs[a].nim <= temp.listMhs[b].nim) {
                m.listMhs[c] = temp.listMhs[a];
                a++;
            } else {
                m.listMhs[c] = temp.listMhs[b];
                b++;
            }
            c++;
        }

        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            m.listMhs[c + i] = temp.listMhs[a + i];
        }
        return m.listMhs;
    }


}
