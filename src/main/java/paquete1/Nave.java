/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author WORKING
 */
public class Nave{
   
    protected double cant_Parsec;

    public Nave() {
    }

    public Nave(double cant_Parsec) {
        this.cant_Parsec = cant_Parsec;
    }

    public double getCant_Parsec() {
        return cant_Parsec;
    }
    
    public String mostrar_info (){
        
        
        String info = "";
        
        info = "CANTIDAD DE PARSEC ESTIMADA A RECORRER DURANTE LA GUERRA: "+cant_Parsec+"<br><hr><br>";
               
        return info;
                
    }
    
}
    