import java.util.*;
class MergeSort {
    void merge(int a[], int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int a1[] = new int[n1];
        int a2[] = new int[n2];
        for (int i = 0; i < n1; i++) a1[i] = a[start + i];
        for (int j = 0; j < n2; j++) a2[j] = a[mid + 1 + j];
        int i = 0, j = 0, k = start;
        while (i < n1 && j < n2) {
            if (a1[i] <= a2[j]) a[k++] = a1[i++];
            else a[k++] = a2[j++];
        }
        while (i < n1) a[k++] = a1[i++];
        while (j < n2) a[k++] = a2[j++];
    }

    void sort(int a[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(a, start, mid);
            sort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }
}

public class MergeSortJava {
    public static void main(String[] args) {
        int a[] = {38, 27, 43, 3, 9, 82, 10};
        MergeSort m = new MergeSort();
        m.sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
