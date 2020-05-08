public class hammasr {
    private int hArv;    
    private double aw;
    

    public hammasr(int hArv, double aw){
        this.hArv=hArv;
        this.aw = aw;
    }

    public int getHammArv(){
        return hArv;
    }
    public double getAW(){
        return aw;
    }

    public double getHammPöörded(){
        return hArv * aw;
    }
    
}