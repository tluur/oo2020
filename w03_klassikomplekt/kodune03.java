/**
 * kodune03
 */
public class kodune03 {

    public String mark;
    public int aasta;
    public int usteArv;

    public kodune03(String mark, int aasta, int usteArv) {
        this.mark = mark;
        this.aasta = aasta;
        this.usteArv = usteArv;
    }

    public String getMark(String mark) {
        if (mark.equals("bmw")) {
            return "BMW ehk Bayerische Motoren Werke AG.";
        } else if(mark.equals("audi")) {
            return "Audi logoks on neli üksteisega seotud rõngast, mis tähistavad autotootjaid, kes moodustasid Auto Unioni.";
        } else if(mark.equals("ford")) {
            return "Ettevõte sai alguse tehasest, mille Henry Ford avas Detroitis 1903. aastal.";
        } else if(mark.equals("toyota")) {
            return "Toyota Motor Corporation sai alguse Koromo linnas (tänapäeval Toyota) 1933. aastal.";
        } else{
            return "Sellist marki ei ole kirjas";
        }

    }

    public String getAasta(int aasta) {
        if (aasta < 2020) {
            return "Kuni 1990 aastani autot veel uueks.";
        } else if (aasta < 1990) {
            return "Collector car";
        } else if (aasta < 1970) {
            return "Classic car";
        } else if (aasta < 1940) {
            return "Vintage car";
        } else {
            return "Lendav taldrik !";
        }

    }

    public String getusteArv(int usteArv) {
        if (usteArv < 6) {
            return "Farmer vagon";
        } else if (usteArv < 5) {
            return "Family Car";
        } else if (usteArv < 3) {
            return "Turkish sedan";
        } else {
            return "Coupee";
        }

    }


}