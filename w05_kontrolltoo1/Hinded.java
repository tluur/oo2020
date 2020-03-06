//Programm arvutab keskmise hinde ning kaalutletud hinde
public class Hinded{

    public static void main(String[] args) {
        int[] punktid = {6, 4};
        int[] hinded = {5, 3};

        int summa = 0;
// keskmise hinde leidmine
        for(int i = 0; i < hinded.length; i++){
            summa = summa + hinded[i];
        }
        int keskmine = summa / hinded.length;
        System.out.println("Sinu keskmine hinne on " + keskmine);
// kaalutletud hinde leidmine
        float ylem = 0;
        float alum = 0;

        for(int i = 0; i < punktid.length; i++){
            ylem = ylem + (punktid[i] * hinded[i]);
            alum = alum + punktid[i];
        }
        float kaalhinne = ylem / alum;
        System.out.println("Sinu kaalutletud hinne on " + kaalhinne);
    }
}