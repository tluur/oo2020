

import java.lang.Math;
public class pendel {
    private int pikkus; 
    


    public pendel(int pikkus){
        this.pikkus = pikkus; 
        
    }

    public int getPikkus(){
        return pikkus;
    }  

    public double getVonkeperiood(){
        return (2*Math.PI*(Math.sqrt(pikkus/9.8)));
    }

    public double getInfo(){
        return getVonkeperiood();
    }


    
}