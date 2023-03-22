/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author WORKING
 */
public class Lanzadera_imperial extends Nave implements INave{
    private int capacidad_l;
    private double consumo_l;
    private int cant_Naves_l ;

    public Lanzadera_imperial() {
    }

    public Lanzadera_imperial(int capacidad_l, double consumo_l, int cant_Naves_l, double cant_Parsec) {
        super(cant_Parsec);
        this.capacidad_l = capacidad_l;
        this.consumo_l = consumo_l;
        this.cant_Naves_l = cant_Naves_l;
    }

    public int getCapacidad_l() {
        return capacidad_l;
    }

    public double getConsumo_l() {
        return consumo_l;
    }

    public int getCant_Naves_l() {
        return cant_Naves_l;
    }
    
    
    
    @Override
    public double calcular_Combustible_Necesario(double consumo, double cant_Parsec) {
        
        return consumo*cant_Parsec;
    }
    
     public String informacion (){
        Lanzadera_imperial h = new Lanzadera_imperial();
        
        getCant_Parsec();
        String info = "";
        
        info = "LANZADERA IMPERIAL: "+"<hr><br>"+
                "Capacidad: "+capacidad_l+" personas"+"<br>"+
                "Consumo: "+consumo_l+" litros por Parsec"+"<br>"+
                "Cantidad de naves de este tipo: "+cant_Naves_l+"<br>"+
                "Consumo necesario de combustible para recorrer "+cant_Parsec+" parsec: "+(h.calcular_Combustible_Necesario(consumo_l,cant_Parsec))+" litros"+"<hr><br><br>";
        return info;
        
    }
    
    
}
