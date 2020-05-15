public class mAla implements Inter{

    String[] mala; // mängu ala massiiv

    String voitja;

    public void GameOver() {
        System.out.println("Game Over");
    }

    // mänguala kohad 1 kuni 9
    public mAla() {
        mala = new String[9];

        for (int i = 0; i < mala.length; i++) {
            mala[i] = String.valueOf(i + 1);
        }
    }

    //lisab käigu mänguala kohale

    public boolean SisestaKaik(String _marker, int _slot) {
        if (OnKohtVaba(_slot - 1)) { // Kui pesa kuhu me tahame lisada märgi on vaba
            mala[_slot - 1] = _marker; // -1 kuna massiiv algab 0 -st
            return true;
        } else {
            System.out.println("Tahad panna võetud kohale märkki. Vali uuesdi !");
            return false;
        }
    }

    // Kontrolli kas koht on võetud X või O poolt
    private boolean OnKohtVaba(int _slot) {
        if (mala[_slot] == "X" || mala[_slot] == "O") {
            return false;
        } else {
            return true;
        }
    }

    // Kontrolli võitu
    public boolean OnVoitja(String _marker) {
        for (int i = 0; i < 8; i++) {
            String line = null;
            switch (i) {
                case 0:
                    line = mala[0] + mala[1] + mala[2];
                    break;
                case 1:
                    line = mala[3] + mala[4] + mala[5];
                    break;
                case 2:
                    line = mala[6] + mala[7] + mala[8];
                    break;
                case 3:
                    line = mala[0] + mala[3] + mala[6];
                    break;
                case 4:
                    line = mala[1] + mala[4] + mala[7];
                    break;
                case 5:
                    line = mala[2] + mala[5] + mala[8];
                    break;
                case 6:
                    line = mala[0] + mala[4] + mala[8];
                    break;
                case 7:
                    line = mala[2] + mala[4] + mala[6];
                    break;
            }

            // kontrollime peale igat kordust kas on reas 3 ühesugust märkki (olemasolul on võit)
            if (line.equals(_marker + _marker + _marker)) {
                voitja = _marker;
                return true;
            }
        }

        int nOfFreeSlots = 8;
        for (int i = 0; i < 8; i++) {
            if (!OnKohtVaba(i)) {
                nOfFreeSlots--;
            }
        }

        if (nOfFreeSlots <= 0 && voitja == null) {
            voitja = "viik";
            return true;
        } else {
            return false;
        }
    }

    // Mängulaud
    public void PrintmAla() {
        System.out.println("Hetk mängus: ");
        System.out.println(); 

        
        System.out.println(" | " + mala[0] + " | " + mala[1] + " | " + mala[2] + " | ");
        System.out.println();
        System.out.println(" | " + mala[3] + " | " + mala[4] + " | " + mala[5] + " | ");
        System.out.println();
        System.out.println(" | " + mala[6] + " | " + mala[7] + " | " + mala[8] + " | ");
        
    }

    
}