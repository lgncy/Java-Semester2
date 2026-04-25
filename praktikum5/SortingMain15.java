package praktikum5;

public class SortingMain15 {
    public static void main(String[] args) {
        // --- 1. Test Bubble Sort ---
        int arr1[] = {20, 10, 2, 7, 12};
        Sorting15 sorter1 = new Sorting15(arr1, arr1.length);
        System.out.println("Data awal pertama:");
        sorter1.tampil();
        sorter1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        sorter1.tampil();
        System.out.println("================================================");

        // --- 2. Test Selection Sort ---
        int arr2[] = {30, 20, 2, 8, 14};
        Sorting15 sorter2 = new Sorting15(arr2, arr2.length);
        System.out.println("Data awal kedua:");
        sorter2.tampil();
        sorter2.selectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        sorter2.tampil();
        System.out.println("================================================");

        // --- 3. Test Insertion Sort ---
        int arr3[] = {40, 10, 4, 9, 3};
        Sorting15 sorter3 = new Sorting15(arr3, arr3.length);
        System.out.println("Data awal ketiga:");
        sorter3.tampil();
        sorter3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        sorter3.tampil();
    }
}
