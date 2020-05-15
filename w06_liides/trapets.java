package kooli;

public class trapets extends kujund {
    int kylg_a;  //külg 1
    int kylg_b;  //külg 2
    int kylg_c;  //külg 3
    int kylg_d;  //külg 4
    int keskjoon_k;  //kesk telg
    int pindala_S;  //pindala
    int kõrgus_h;  //kõrgus

    public trapets(int a, int b, int c, int d, int k, int S, int h){
        this.kylg_a = a;
        this.kylg_b = b;
        this.kylg_c = c;
        this.kylg_d = d;
        this.keskjoon_k = k;
        this.pindala_S = S;
        this.kõrgus_h = h;
    }
    @Override
    public double getTKeskjoon(){
        return (a + b) / 2;
    }

    @Override
    public double getTYmbermoot(){
        return a + b + c + d;
    }

    @Override
    public double getTPindala(){
        return ((a + b) / 2) * h;
    }

}