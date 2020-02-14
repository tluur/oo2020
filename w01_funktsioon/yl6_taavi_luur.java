/**
 * yl6_taavi_luur
 */
public class yl6_taavi_luur {

    // Bubble sort asendusmeetod
    public static void bubbleSort(int[] arr) {
        int counter = 0; // loopide lugemiseks
        int n = arr.length;
        int ajut = 0;
        for (int i = 0; i < n; i++) {
            counter = i + 1;
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    ajut = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = ajut;
                }

            }
        }

        System.out.println("Tehti " + counter + " loopi ja peale Bubble Sorteerimist :");

    }

    public static void main(String[] args) {
        int arr[] = { 3, 60, 35, 2, 45, 320, 5, 65, 98, 45, 78, 45, 158, 147, 567, 678, 789, 864, 999 };

        System.out.println("Enne Sorteerimist :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
        //Kutsume Bubble sort 
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");

        }

    }
}