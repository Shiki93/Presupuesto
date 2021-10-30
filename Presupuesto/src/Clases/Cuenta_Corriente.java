package Clases;

import java.util.Date;
import java.util.ArrayList;

public class Cuenta_Corriente {
    
    private String nombre;
    private String institucion;
    private String tipo_Moneda;
    
    private double saldo_Disponible;
    
    private Date fecha_Apertura;
    
    private ArrayList<Transaccion> lista_Transacciones;

    public Cuenta_Corriente(String nombre, String institucion, String tipo_Moneda, double saldo_Disponible, Date fecha_Apertura) {
        this.nombre = nombre;
        this.institucion = institucion;
        this.tipo_Moneda = tipo_Moneda;
        this.saldo_Disponible = saldo_Disponible;
        this.fecha_Apertura = fecha_Apertura;
        this.lista_Transacciones = new ArrayList<Transaccion>();
    }

    public void add_Transaccion(Transaccion transaccion){
        this.lista_Transacciones.add(transaccion);
    }
    
    public boolean delete_Transaccion(int id){
        for (int i = 0; i < lista_Transacciones.size(); i++){
            if (lista_Transacciones.get(i).getId() == id){
                lista_Transacciones.remove(i);
                return true;
            }
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTipo_Moneda() {
        return tipo_Moneda;
    }

    public void setTipo_Moneda(String tipo_Moneda) {
        this.tipo_Moneda = tipo_Moneda;
    }

    public double getSaldo_Disponible() {
        return saldo_Disponible;
    }

    public void setSaldo_Disponible(double saldo_Disponible) {
        this.saldo_Disponible = saldo_Disponible;
    }

    public Date getFecha_Apertura() {
        return fecha_Apertura;
    }

    public void setFecha_Apertura(Date fecha_Apertura) {
        this.fecha_Apertura = fecha_Apertura;
    }

    public ArrayList<Transaccion> getLista_Transacciones() {
        return lista_Transacciones;
    }
}
