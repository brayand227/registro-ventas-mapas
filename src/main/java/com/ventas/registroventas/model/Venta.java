package com.ventas.registroventas.model;

public class Venta {

    private String nombreProducto;
    private String codigoProducto;
    private int cantidadVendida;
    private double precio;

    public Venta() {
    }

    public Venta(String nombreProducto, String codigoProducto, int cantidadVendida, double precio) {
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        this.cantidadVendida = cantidadVendida;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getValorTotal() {
        return precio * cantidadVendida;
    }

}