/**
 * yl7_1_taavi_luur
 */
public class yl7_1_taavi_luur {

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
        int [] arr = new int[30];
        for(int l=0; l < arr.length; l++){
            arr[l] = (int) (Math.random() * 10000);
        
        }

        System.out.println("Enne Sorteerimist :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
        //Kutsume välja Bubble sort
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");

        }

    }
}