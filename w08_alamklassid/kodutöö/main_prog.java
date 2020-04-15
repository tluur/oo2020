package kooli;


public class main_prog {
    public static void main(String[] args) throws Exception {

        kujund kuj1 = new trapets(9, 14, 0, 0, 0, 0, 16);
        kujund kuj2 = new trapets(9, 14, 0, 0, 0, 0, 0);
        kujund kuj3 = new trapets(9, 14, 2, 5, 0, 0, 0);
        System.out.println(kuj1.getTPindala() + "cm2 on trapetsi pindala.");
        System.out.println(kuj2.getTKeskjoon() + "cm on trapetsi keskjoone pikkus.");
        System.out.println(kuj2.getTYmbermoot() + "cm on trapetsi keskjoone pikkus.");
        
    }

}