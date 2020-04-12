import java.util.ArrayList;
import java.util.List;


public class gaasid {
    private final List<gaasiarvutus> kokku = new ArrayList<>();

    public void addGaas(final gaasiarvutus gaas){
        kokku.add(gaas);
    }

    public void removeGaas(final int index){
        kokku.remove(index);
    }

    public gaasiarvutus getSpecific(final int index){
        return kokku.get(index);
    }

    public void list(){
        for(int i=0; i<kokku.size();i++){
            System.out.println("Gaas: " + (i + 1) + " " + kokku.get(i).getInfo());
        }
    }





}