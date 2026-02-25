package com.ventas.registroventas.controller;

import org.springframework.web.bind.annotation.*;

import com.ventas.registroventas.model.Venta;
import com.ventas.registroventas.servicio.VentaService;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @PostMapping
    public Venta guardarVenta(@RequestBody Venta venta) {
        return ventaService.guardar(venta);
    }

    @GetMapping
    public List<Venta> listarTodas() {
        return ventaService.listar();
    }

    @GetMapping("/{codigo}")
    public Venta buscarPorCodigo(@PathVariable Long codigo) {
        return ventaService.buscarPorCodigo(codigo);
    }
}