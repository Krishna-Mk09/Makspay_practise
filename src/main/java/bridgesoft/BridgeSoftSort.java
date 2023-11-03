package bridgesoft;

public class BridgeSoftSort {
    public static void main(String[] args) {
        int[] array = {11, 5, 3, 4, 2, 1, 10, 0};

    }




    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i]);
        }
    }
}
