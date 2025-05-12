package com.example.Banco.controller;

import com.example.Banco.model.BancoModelo;
import com.example.Banco.service.BancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BancoControlador {
    @Autowired
    private BancoService bancoService;
    private List<BancoModelo> listaClientes = new ArrayList<>();

    @GetMapping("/")
    public String fromulario(Model model) {
        model.addAttribute("cliente", new BancoModelo());
        return "formulario";
    }

    @PostMapping("/agregar")
    public String agregar(@ModelAttribute BancoModelo cliente, Model model) {
        bancoService.calcularDatos(cliente);
        listaClientes.add(cliente);
        model.addAttribute("cliente", listaClientes);
        return "resultado";
    }
}
