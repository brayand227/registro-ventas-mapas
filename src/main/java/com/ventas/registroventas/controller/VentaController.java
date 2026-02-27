package com.ventas.registroventas.controller;

import com.ventas.registroventas.model.Venta;
import com.ventas.registroventas.reposity.VentaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/ventas")
public class VentaController {

    private final Map<String, VentaRepository> repositorios;

    public VentaController(Map<String, VentaRepository> repositorios) {
        this.repositorios = repositorios;
    }

    @GetMapping
    public String listarVentas(
            @RequestParam(defaultValue = "ventaRepositoryHashMap") String tipo,
            Model model) {

        VentaRepository repo = repositorios.get(tipo);

        model.addAttribute("ventas", repo.listar());
        model.addAttribute("venta", new Venta()); // ⭐ para el formulario
        model.addAttribute("tipoActual", tipo);

        return "lista";
    }

    @PostMapping("/guardar")
    public String guardarVenta(
            @ModelAttribute Venta venta,
            @RequestParam String tipo) {

        VentaRepository repo = repositorios.get(tipo);
        repo.guardar(venta);

    
        return "redirect:/ventas?tipo=" + tipo;
    }
}