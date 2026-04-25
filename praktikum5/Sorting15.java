package praktikum5;

public class Sorting15 {
    int[] arrayData;
    int jumlahElemen;

    Sorting15(int Data[], int jmlElemen) {
        jumlahElemen = jmlElemen;
        arrayData = new int[jmlElemen];
        for (int i = 0; i < jumlahElemen; i++) {
            arrayData[i] = Data[i];
        }
    }

    void bubbleSort() {
        int temp = 0; 
        
        for (int i = 0; i < jumlahElemen - 1; i++) {
            for (int j = 1; j < jumlahElemen - i; j++) {
                if (arrayData[j - 1] > arrayData[j]) {
                    temp = arrayData[j];
                    arrayData[j] = arrayData[j - 1];
                    arrayData[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < jumlahElemen - 1; i++) {
            int min = i;

            for (int j = i + 1; j < jumlahElemen; j++) {
                if (arrayData[j] < arrayData[min]) {
                    min = j;
                }
            }
            
            int temp = arrayData[i];
            arrayData[i] = arrayData[min];
            arrayData[min] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i <= arrayData.length - 1; i++) {
            int temp = arrayData[i];
            int j = i - 1;

            while (j >= 0 && arrayData[j] > temp) {
                arrayData[j + 1] = arrayData[j];
                j--;
            }
            
            arrayData[j + 1] = temp;
        }
    }

    void tampil() {
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print(arrayData[i] + " ");
        }
        System.out.println();
    }
}
