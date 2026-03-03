package appanime;
import java.util.Arrays;
public class Anime {
    public String nombre;
    public String genero;
    private int nroE;
    private String [ ] ep;
    //Constructor
    public Anime(String nombre, String genero, int nroEp){
        this.nombre=nombre;
        this.genero=genero;
        this.nroE=nroEp;
        this.ep=new String[nroE];
        
        for(int i=0; i<nroE; i++){
            ep[i]="Episodio"+ (i+1);
        }
    }
    public String toString(){
        return "Nombre:"+this.nombre+" - Genero:"+this.genero+" - Nro de Episodios:"+nroE+" - "+Arrays.toString(ep);
    }
    
}
