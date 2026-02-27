package com.ventas.registroventas.reposity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ventas.registroventas.model.Venta;

@Repository("ventaRepositoryLinkedHashMap")
public class VentaRepositoryLinkedHashMap implements VentaRepository {
    private Map<String, Venta> datos = new LinkedHashMap<>();

    @Override
    public Venta guardar(Venta venta) {

        datos.put(venta.getCodigoProducto(), venta);
        return venta;
    }

    @Override
    public List<Venta> listar() {
        return new ArrayList<>(datos.values());
    }

    @Override
    public Optional<Venta> buscarPorCodigo(String codigoProducto) {
        return Optional.ofNullable(datos.get(codigoProducto));
    }

}
