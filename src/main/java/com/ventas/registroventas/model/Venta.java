package com.ventas.registroventas.model;

public class Venta {

    private String nombreProducto;
    private Long codigoProducto;
    private int cantidadVendida;
    private double valorTotal;

    public Venta() {
    }

    public Venta(String nombreProducto, Long codigoProducto, int cantidadVendida, double valorTotal) {
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        this.cantidadVendida = cantidadVendida;
        this.valorTotal = valorTotal;
    }


    public String getNombreProducto() {
        return nombreProducto;
    }


    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Long getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Long codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}