package Clases;

import java.util.Date;

public class Tarjeta_Credito {
    
    private String nombre;
    private String tipo_Interes;
    private String institucion;
    private String tipo_Moneda;
    
    private double saldo_Disponible;
    private double saldo_Usado;
    private double limite_Credito;
    private double monto_A_pagar;
    private double tasa_Interes;
    
    private Date fecha_Apertura;
    private Date fecha_finalizacion;
    private Date fecha_Corte;
    private Date fecha_Limite_Pago;

    public Tarjeta_Credito(String nombre, String tipo_Interes, String institucion, String tipo_Moneda, double saldo_Disponible, double saldo_Usado, double limite_Credito, double monto_A_pagar, double tasa_Interes, Date fecha_Apertura, Date fecha_finalizacion, Date fecha_Corte, Date fecha_Limite_Pago) {
        this.nombre = nombre;
        this.tipo_Interes = tipo_Interes;
        this.institucion = institucion;
        this.tipo_Moneda = tipo_Moneda;
        this.saldo_Disponible = saldo_Disponible;
        this.saldo_Usado = saldo_Usado;
        this.limite_Credito = limite_Credito;
        this.monto_A_pagar = monto_A_pagar;
        this.tasa_Interes = tasa_Interes;
        this.fecha_Apertura = fecha_Apertura;
        this.fecha_finalizacion = fecha_finalizacion;
        this.fecha_Corte = fecha_Corte;
        this.fecha_Limite_Pago = fecha_Limite_Pago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_Interes() {
        return tipo_Interes;
    }

    public void setTipo_Interes(String tipo_Interes) {
        this.tipo_Interes = tipo_Interes;
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
        this.saldo_Disponible = this.limite_Credito - this.saldo_Usado;
    }

    public double getSaldo_Usado() {
        return saldo_Usado;
    }

    public void setSaldo_Usado(double saldo_Usado) {
        this.saldo_Usado = saldo_Usado;
    }

    public double getLimite_Credito() {
        return limite_Credito;
    }

    public void setLimite_Credito(double limite_Credito) {
        this.limite_Credito = limite_Credito;
    }

    public double getMonto_A_pagar() {
        return monto_A_pagar;
    }

    public void setMonto_A_pagar(double monto_A_pagar) {
        this.monto_A_pagar = monto_A_pagar;
    }

    public double getTasa_Interes() {
        return tasa_Interes;
    }

    public void setTasa_Interes(double tasa_Interes) {
        this.tasa_Interes = tasa_Interes;
    }

    public Date getFecha_Apertura() {
        return fecha_Apertura;
    }

    public void setFecha_Apertura(Date fecha_Apertura) {
        this.fecha_Apertura = fecha_Apertura;
    }

    public Date getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public void setFecha_finalizacion(Date fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public Date getFecha_Corte() {
        return fecha_Corte;
    }

    public void setFecha_Corte(Date fecha_Corte) {
        this.fecha_Corte = fecha_Corte;
    }

    public Date getFecha_Limite_Pago() {
        return fecha_Limite_Pago;
    }

    public void setFecha_Limite_Pago(Date fecha_Limite_Pago) {
        this.fecha_Limite_Pago = fecha_Limite_Pago;
    }
    
    

}
