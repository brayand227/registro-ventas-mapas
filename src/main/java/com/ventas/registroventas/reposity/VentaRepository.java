package com.ventas.registroventas.reposity;

import java.util.List;
import java.util.Optional;

import com.ventas.registroventas.model.Venta;

public interface VentaRepository {
    Venta guardar(Venta venta);

    List<Venta> listar();

    Optional<Venta> buscarPorCodigo(String codigoProducto);

    

}
