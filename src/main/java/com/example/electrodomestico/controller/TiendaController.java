package com.example.electrodomestico.controller;

import com.example.electrodomestico.entity.Electrodomestico;
import com.example.electrodomestico.service.TiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/electrodomestico")
public class TiendaController {

    @Autowired
    TiendaService tiendaService;

    @GetMapping
    public List<Electrodomestico> getElectrodomesticos(){
        return tiendaService.getElectrodomesticoList();
    }

    @GetMapping("/{id}")
    public Electrodomestico getElectrodomesticoById(@PathVariable int id){
        return tiendaService.getElectrodomesticoById(id);
    }

    @PostMapping()
    public void crearElectrodomestico(@RequestBody Electrodomestico electrodomestico){
        tiendaService.addElectrodomestico(electrodomestico);
    }

    @PutMapping()
    public void updateElectrodomestico(@RequestBody Electrodomestico electrodomestico){
        tiendaService.updateElectrodomestico(electrodomestico);
    }

    @DeleteMapping("/{id}")
    public void deleteElectrodomestico(@PathVariable int id){
        tiendaService.deleteElectrodomestico(id);
    }






}
