/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

/**
 *
 * @author Marco
 */
public class Persona {
    private String nombre;
    private int cedula;
    private int numero;
    private double monto;
    private String mes;
    private int anio;
    private int estado;
    private int facturas;
    
    public Persona(String nombre,int cedula,int numero,double monto,String mes, int anio,int estado,int facturas){
        this.nombre=nombre;
        this.cedula=cedula;
        this.numero=numero;
        this.monto=monto;
        this.mes=mes;
        this.anio=anio;
        this.estado=estado;
        this.facturas=facturas;
    }
    public double getmonto(){
        double interes = monto * 0.5;
        return monto + interes;
    }
            
        
    
      
}


    
    

