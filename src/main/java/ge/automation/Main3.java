package ge.automation;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};
        System.out.print("დალაგებული მასივი: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            System.out.print(arr[i] + " ");
        }

    }
}