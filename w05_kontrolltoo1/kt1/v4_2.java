
// 4 - Kaalutud keskmine
//* Funktsioonile antakse ette kogumina õppeainete punktid ning teise kogumina nende ainete hinded. Leitakse kaalutud keskmine. 

public class v4_2 {

    public static void main(String[] args) {
        int[] hinded = {3, 4, 4}; //Koostatud masiiv hinnetena
        int[] punktid = { 2, 3, 1 }; //Koostatud masiiv punktidena        
        float kaalKeskm = 0;
        float total = 0;
        int totalPunktid = 0;        

        //Arvutame kaalutud keskmine

        for (int i = 0; i < punktid.length; i++) {
            totalPunktid = punktid[i] + totalPunktid;           
            total += (hinded[i] * punktid[i]); 
        }        
        kaalKeskm = total/totalPunktid;
       
        //Seame tingimused mis hinne keskmise punktisumma korral saad ning teostame väljaprindid.
        if (kaalKeskm > 4.9) {
            System.out.println("Kaalutud kesmine hinned on A");
        } else if (kaalKeskm > 3.9) {
            System.out.println("Kaalutud keskmine hinne on B");
        } else if (kaalKeskm > 2.9) {
            System.out.println("Kaalutud keskmine hinne on C");
        } else {
            System.out.println("Kukkusid läbi");
        }
        System.out.println("Punktides on se: " + kaalKeskm +" palli.");

    }
}