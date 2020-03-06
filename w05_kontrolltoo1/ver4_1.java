/**
 * ver4_1
 */
// 4 - Kaalutud keskmine
//* Funktsioonile antakse ette kogumina õppeainete punktid ning teise kogumina nende ainete hinded. Leitakse kaalutud keskmine. 

public class ver4_1 {

    public static void main(String[] args) {
        int[] punktid = { 90, 15, 25, 51, 60, 87, 93 }; //Koostatud masiiv punktidena
        String[] hinded = { "F", "F", "E", "E", "A", "A" }; //Koostatud masiiv hinnetena
        int counter = 0;
        int total = 0;
        int keskmine = 0;

        //Arvutame keskmine

        for (int i = 0; i < punktid.length; i++) {
            total = punktid[i] + total;
            counter++;
            keskmine = total / counter;
        }
        //Seame tingimused mis hinne keskmise punktisumma korral saad ning teostame väljaprindid.
        if (keskmine > 89) {
            System.out.println("Kaalutud kesmine hinned on A");
        } else if (keskmine > 79) {
            System.out.println("Kaalutud keskmine hinne on B");
        } else if (keskmine > 49) {
            System.out.println("Kaalutud keskmine hinne on C");
        } else {
            System.out.println("Kukkusid läbi");
        }
        System.out.println("Punktides on se: " + keskmine +" palli.");

    }
}