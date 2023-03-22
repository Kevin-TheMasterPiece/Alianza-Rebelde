/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author WORKING
 */
public class Supremacy  extends Nave{
    private int capacidad_s;
    private double consumo_s;
    private int cant_Naves_s ;
    private int navt_s; 

    public Supremacy() {
    }

    public Supremacy(int capacidad_s, double consumo_s, int cant_Naves_s, int navt_s, double cant_Parsec) {
        super(cant_Parsec);
        this.capacidad_s = capacidad_s;
        this.consumo_s = consumo_s;
        this.cant_Naves_s = cant_Naves_s;
        this.navt_s = navt_s;
    }

    public int getCapacidad_s() {
        return capacidad_s;
    }

    public double getConsumo_s() {
        return consumo_s;
    }

    public int getCant_Naves_s() {
        return cant_Naves_s;
    }

    public int getNavt_s() {
        return navt_s;
    }
    
    

    
    public double calcular_Combustible_Necesario(double consumo, double cant_Parsec,int navt_s) {
        
        return (consumo+(navt_s*0.10))*cant_Parsec;
    }
    
     public String informacion (){
        Supremacy h = new Supremacy();
        
        getCant_Parsec();
        String info = "";
        
        info = "SUPREMACY: "+"<hr><br>"+
                "Capacidad: "+capacidad_s+" personas"+"<br>"+
                "Consumo: "+consumo_s+" litros por Parsec"+"<br>"+
                "Cantidad de naves de este tipo: "+cant_Naves_s+"<br>"+
                "Consumo necesario de combustible para recorrer "+cant_Parsec+" parsec: "+(h.calcular_Combustible_Necesario(consumo_s,cant_Parsec,navt_s))+" litros"+"<hr><br><br>";
        return info;
        
    }

    
}
