/**
 * kodune02
 */
public class kodune02 {

    private String mark;
    private int year;
    private int DoorCount;

    public kodune02(String mark, int year, int DoorCount) {
        this.mark = mark;
        this.year = year;
        this.DoorCount = DoorCount;
    }

    public String getMark(String mark2) {
        if (mark == "bmw") {
            return "Badly Made Wobbler";
        } else {
            return "Kihutab kui kurat";
        }

    }

    public String getYear(int aasta) {
        if (year < 1990) {
            return "Vanake";

        } else if (year < 2000) {
            return "Middle age";
        } else if (year < 2010) {
            return "Teenage";
        } else {
            return "You are still young";
        }

    }

    public String getDoorCount(int usteArv) {
        if (DoorCount < 6) {
            return "Farmer vagon";
        } else if (DoorCount < 5) {
            return "Family Car";
        } else {
            return "Coupee";
        }

    }
}