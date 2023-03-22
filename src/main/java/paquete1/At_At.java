/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author WORKING
 */
public class At_At  extends Nave implements INave{
    private int capacidad_AT;
    private double consumo_AT;
    private int cant_Naves_AT ;

    public At_At() {
    }

    public At_At(int capacidad_AT, double consumo_AT, int cant_Naves_AT, double cant_Parsec) {
        super(cant_Parsec);
        this.capacidad_AT = capacidad_AT;
        this.consumo_AT = consumo_AT;
        this.cant_Naves_AT = cant_Naves_AT;
    }

    public int getCapacidad_AT() {
        return capacidad_AT;
    }

    public double getConsumo_AT() {
        return consumo_AT;
    }

    public int getCant_Naves_AT() {
        return cant_Naves_AT;
    }

    
    

    @Override
    public double calcular_Combustible_Necesario(double consumo, double cant_Parsec) {
        
        return (consumo-(consumo*0.25))*cant_Parsec;
    }
    
     public String informacion (){
        At_At h = new At_At();
        
        getCant_Parsec();
        String info = "";
        
        info = "At-At: "+"<hr><br>"+
                "Capacidad: "+capacidad_AT+" personas"+"<br>"+
                "Consumo: "+consumo_AT+" litros por Parsec"+"<br>"+
                "Cantidad de naves de este tipo: "+cant_Naves_AT+"<br>"+
                "Consumo necesario de combustible para recorrer "+cant_Parsec+" parsec: "+(h.calcular_Combustible_Necesario(consumo_AT,cant_Parsec))+" litros"+"<hr><br><br>";
        return info;
        
    }
}
