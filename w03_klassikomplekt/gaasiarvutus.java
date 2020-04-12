
public class gaasiarvutus {
    private int T;
    private int P;
    private double M;
    private double R;  
    private Ained aine;
    
public gaasiarvutus(int T, int P, double M, double R, Ained aine){
    this.T = T;
    this.P = P;
    this.M = M;
    this.R = R;
    this.aine = aine;

}

public int getT(){
    return T;
}

public int getP(){
    return P;
}

public double getM(){
    return M;
}

public double getR(){
    return R;
}

public void getAinedd() {
    String ret;
    switch (aine){
        case CO2:
        ret = "co";
        break;

        case H2:
        ret ="h";
        break;

        case O2:
        ret = "o";
        break;

        default:
        ret = "N/A";
        break;
    }
}

public Ained getAineType(){
    return aine;
}

public double getTihedus(){
    return (P*M)/(R*T);
}

public String getInfo(){
    return "Gaasi " + getAineType() + " aine tihedus on " + getTihedus() +" kg/m3.";
}


}