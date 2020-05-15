public class App {
    public static void main(String[] args) {
        mAla Mlaud = new mAla();
        Osaleja Mängija_X = new Osaleja("X");
        Osaleja Mängija_O = new Osaleja("O");       

        // Kuni võitja selgumiseni kordame
        while (Mlaud.voitja == null) {
            Mlaud.PrintmAla();

            // Kuni sobiva sisendini kordame (defineeritud koht laual)
            while (Mlaud.SisestaKaik(Mängija_X.GetMarker(), Mängija_X.GetMove()) == false) {
                Mlaud.PrintmAla();
            }
            // Kontrollime võitjat
            Mlaud.OnVoitja(Mängija_X.GetMarker());
            if (Mlaud.voitja != null) {
                break;
            }

            Mlaud.PrintmAla();

            // Kuni sobiva sisendini kordame (defineeritud koht laual)
            while (Mlaud.SisestaKaik(Mängija_O.GetMarker(), Mängija_O.GetMove()) == false) {
                Mlaud.PrintmAla();
            }
            // Kontrollime võitjat
            Mlaud.OnVoitja(Mängija_O.GetMarker());
            if (Mlaud.voitja != null) {
                break;
            }

        }

        // Prindime mängulaua peale võitu veel korra välja
        
        Mlaud.PrintmAla();
        System.out.println();     
        System.out.println("Mängija " + Mlaud.voitja + " võitis !");

        // interface-itav meetod: 

        Mlaud.GameOver();
        
    }

    
}