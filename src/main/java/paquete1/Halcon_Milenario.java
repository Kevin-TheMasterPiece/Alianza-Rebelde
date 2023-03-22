/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author WORKING
 */
public class Halcon_Milenario extends Nave implements INave{
    private int capacidad_h;
    private double consumo_h;
    private int cant_Naves_h ;

    public Halcon_Milenario() {
    }

    public Halcon_Milenario(int capacidad_h, double consumo_h, int cant_Naves_h, double cant_Parsec) {
        super(cant_Parsec);
        this.capacidad_h = capacidad_h;
        this.consumo_h = consumo_h;
        this.cant_Naves_h = cant_Naves_h;
    }

    public int getCapacidad_h() {
        return capacidad_h;
    }

    public double getConsumo_h() {
        return consumo_h;
    }

    public int getCant_Naves_h() {
        return cant_Naves_h;
    }
    
    @Override
    public double calcular_Combustible_Necesario(double consumo, double cant_Parsec) {
        return consumo*cant_Parsec;
    }

    
    
    public String informacion (){
        Halcon_Milenario h = new Halcon_Milenario();
        
        getCant_Parsec();
        String info = "";
        
        info = "HALCON MILENARIO: "+"<hr><br>"+
                "Capacidad: "+capacidad_h+" personas"+"<br>"+
                "Consumo: "+consumo_h+" litros por Parsec"+"<br>"+
                "Cantidad de naves de este tipo: "+cant_Naves_h+"<br>"+
                "Consumo necesario de combustible para recorrer "+cant_Parsec+" parsec: "+(h.calcular_Combustible_Necesario(consumo_h,cant_Parsec))+" litros"+"<hr><br><br>";
        return info;
        
    }

    
    
}
