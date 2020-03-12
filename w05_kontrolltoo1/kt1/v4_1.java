/**
 * v4_1
 */
// Koosta funktsioon, kus antakse ette kahe ainekursuse ainepunktid ja hinded. Arvuta nende põhjal kaalutud keskmine.
public class v4_1 {

    public static void main(String[] args) {
        int[] Aine_A_hinded = {2, 5, 4, 3}; 
        int[] Aine_A_punktid = { 1, 4, 2, 6 }; 
        int[] Aine_B_hinded = {3, 4, 4, 5}; 
        int[] Aine_B_punktid = { 2, 3, 1, 3 };       
        float kaalKeskm = 0;
        float total = 0;
        int totalPunktid = 0;        

        //Arvutame kaalutud keskmine

        for (int i = 0; i < Aine_A_punktid.length; i++) {
            totalPunktid = (Aine_A_punktid[i] + Aine_B_punktid[i] + totalPunktid);          
            total += ((Aine_A_hinded[i] * Aine_A_punktid[i]) + (Aine_B_hinded[i] * Aine_B_punktid[i])); 

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
        System.out.println("Kahe aine kaalutud keskmine on: " + kaalKeskm +" palli.");

    }
}