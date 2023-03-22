/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author WORKING
 */
public class Destructor_Estelar extends Nave implements INave{
    private int capacidad_d;
    private double consumo_d;
    private int cant_Naves_d ;

    public Destructor_Estelar() {
    }

    public Destructor_Estelar(int capacidad_d, double consumo_d, int cant_Naves_d, double cant_Parsec) {
        super(cant_Parsec);
        this.capacidad_d = capacidad_d;
        this.consumo_d = consumo_d;
        this.cant_Naves_d = cant_Naves_d;
    }

    public int getCapacidad_d() {
        return capacidad_d;
    }

    public double getConsumo_d() {
        return consumo_d;
    }

    public int getCant_Naves_d() {
        return cant_Naves_d;
    }

    
    
    
     @Override
    public double calcular_Combustible_Necesario(double consumo, double cant_Parsec) {
        
        return consumo*cant_Parsec;
    }
    
     public String informacion (){
        Destructor_Estelar h = new Destructor_Estelar();
        
        getCant_Parsec();
        String info = "";
        
        info = "DESTRUCTOR ESTELAR: "+"<hr><br>"+
                "Capacidad: "+capacidad_d+" personas"+"<br>"+
                "Consumo: "+consumo_d+" litros por Parsec"+"<br>"+
                "Cantidad de naves de este tipo: "+cant_Naves_d+"<br>"+
                "Consumo necesario de combustible para recorrer "+cant_Parsec+" parsec: "+(h.calcular_Combustible_Necesario(consumo_d,cant_Parsec))+" litros"+"<hr><br><br>";
        return info;
        
    }
}
