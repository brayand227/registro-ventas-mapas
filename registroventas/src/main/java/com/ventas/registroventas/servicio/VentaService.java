package com.ventas.registroventas.servicio;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ventas.registroventas.model.Venta;
import com.ventas.registroventas.reposity.VentaRepository;

import java.util.List;

@Service
public class VentaService {

    private final VentaRepository ventaRepository;

    public VentaService(
            @Qualifier("ventaRepositoryHashMap") VentaRepository ventaRepository
    ) {
        this.ventaRepository = ventaRepository;
    }

    public Venta guardar(Venta venta) {
        return ventaRepository.guardar(venta);
    }

    public List<Venta> listar() {
        return ventaRepository.listar();
    }

    public Venta buscarPorCodigo(Long codigo) {
        return ventaRepository.buscarPorCodigo(codigo)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }
}