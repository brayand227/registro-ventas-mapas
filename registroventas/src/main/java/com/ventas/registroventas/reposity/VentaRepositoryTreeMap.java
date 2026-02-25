package com.ventas.registroventas.reposity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import org.springframework.stereotype.Repository;

import com.ventas.registroventas.model.Venta;

@Repository("ventaRepositoryTreeMap")
public class VentaRepositoryTreeMap implements VentaRepository {
    private Map<Long, Venta> datos = new TreeMap<>();
    private Long secuencia = 1L;

    @Override
    public Venta guardar(Venta venta) {
        venta.setCodigoProducto(secuencia++);
        datos.put(venta.getCodigoProducto(), venta);
        return venta;
    }

    @Override
    public List<Venta> listar() {
        return new ArrayList<>(datos.values());
    }

    @Override
    public Optional<Venta> buscarPorCodigo(Long codigoProducto) {
        return Optional.ofNullable(datos.get(codigoProducto));
    }

}
