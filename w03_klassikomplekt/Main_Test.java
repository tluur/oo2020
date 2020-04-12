

public class Main_Test {

    public static void main(String[] args) {
        
        gaasid kokku = new gaasid();

        gaasiarvutus gaas1 = new gaasiarvutus(300, 200000, 0.044, 8.3145, Ained.CO2); //300 kelvin, 200 000 pascal, 0,044 kg/mol, 8,3145 J/kg kelvin

        kokku.addGaas(gaas1);
        kokku.list();

        
    }

}