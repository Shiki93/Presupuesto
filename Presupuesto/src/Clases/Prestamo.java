package Clases;

import java.util.Date;

public class Prestamo {
    
    private String nombre;
    private String tipo_Interes;
    private String institucion;
    private String tipo_Moneda;
    
    private double monto_Inicial;
    private double monto_pagado;
    private double monto_restante;
    private double monto_A_Pagar;
    private double tasa_interes;
    
    private Date fecha_Apertura;
    private Date fecha_finalizacion;
    private Date fecha_Pago;

    public Prestamo(String nombre, String tipo_Interes, String institucion, String tipo_Moneda, double monto_Inicial, double monto_pagado, double monto_restante, double monto_A_Pagar, double tasa_interes, Date fecha_Apertura, Date fecha_finalizacion, Date fecha_Pago) {
        this.nombre = nombre;
        this.tipo_Interes = tipo_Interes;
        this.institucion = institucion;
        this.tipo_Moneda = tipo_Moneda;
        this.monto_Inicial = monto_Inicial;
        this.monto_pagado = monto_pagado;
        this.monto_restante = monto_restante;
        this.monto_A_Pagar = monto_A_Pagar;
        this.tasa_interes = tasa_interes;
        this.fecha_Apertura = fecha_Apertura;
        this.fecha_finalizacion = fecha_finalizacion;
        this.fecha_Pago = fecha_Pago;
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

    public double getMonto_Inicial() {
        return monto_Inicial;
    }

    public void setMonto_Inicial(double monto_Inicial) {
        this.monto_Inicial = monto_Inicial;
    }

    public double getMonto_pagado() {
        return monto_pagado;
    }

    public void setMonto_pagado(double monto_pagado) {
        this.monto_pagado = monto_pagado;
    }

    public double getMonto_restante() {
        return monto_restante;
    }

    public void setMonto_restante(double monto_restante) {
        this.monto_restante = this.monto_Inicial - this.monto_pagado;
    }

    public double getMonto_A_Pagar() {
        return monto_A_Pagar;
    }

    public void setMonto_A_Pagar(double monto_A_Pagar) {
        this.monto_A_Pagar = monto_A_Pagar;
    }

    public double getTasa_interes() {
        return tasa_interes;
    }

    public void setTasa_interes(double tasa_interes) {
        this.tasa_interes = tasa_interes;
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

    public Date getFecha_Pago() {
        return fecha_Pago;
    }

    public void setFecha_Pago(Date fecha_Pago) {
        this.fecha_Pago = fecha_Pago;
    }
    
    
    
}
