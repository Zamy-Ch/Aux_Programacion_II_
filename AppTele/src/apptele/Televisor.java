package apptele;
public class Televisor {
    private String marca;
    private int resolucion;
    private String tipo;
    
    public Televisor(String marca, int resolucion, String tipo){
        this.marca=marca;
        this.resolucion=resolucion;
        this.tipo=tipo;
    }
    public Televisor(){
        marca="Samsum";
        resolucion=200;
        tipo="oled";
    }
    
    public String toString(){
        return "Marca:"+marca+" - Resolicion:"+resolucion+" - Tipo:"+tipo;
    }
    
}
