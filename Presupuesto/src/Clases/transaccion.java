package Clases;

import java.util.Date;

public class Transaccion {
    
    private String detalle;
    private String tipo;
    private String categoria;
    
    private double monto;
    private int id;
    
    private Date fecha_Transaccion;

    public Transaccion(String detalle, String tipo, String categoria, double monto, int id,  Date fecha_Transaccion) {
        this.detalle = detalle;
        this.tipo = tipo;
        this.categoria = categoria;
        this.monto = monto;
        this.fecha_Transaccion = fecha_Transaccion;
        this.id = id;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha_Transaccion() {
        return fecha_Transaccion;
    }

    public void setFecha_Transaccion(Date fecha_Transaccion) {
        this.fecha_Transaccion = fecha_Transaccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}