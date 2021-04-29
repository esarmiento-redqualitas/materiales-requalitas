package com.example.electrodomestico.service;

import com.example.electrodomestico.entity.Electrodomestico;
import com.example.electrodomestico.repository.ElectrodomesticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TiendaService {

    @Autowired
    ElectrodomesticoRepository electrodomesticoRepository;

    public List<Electrodomestico> getElectrodomesticoList(){
        return electrodomesticoRepository.findAll();
    }

    public Electrodomestico getElectrodomesticoById(int id){
        Optional<Electrodomestico> optionalElectrodomestico = electrodomesticoRepository.findById(id);

        return optionalElectrodomestico.get();
    }

    public void addElectrodomestico(Electrodomestico electrodomestico){
        electrodomesticoRepository.save(electrodomestico);
    }

    public void updateElectrodomestico(Electrodomestico electrodomestico){
        electrodomesticoRepository.save(electrodomestico);
    }

    public void deleteElectrodomestico(int idElectrodomestico){
        electrodomesticoRepository.deleteById(idElectrodomestico);
    }


}
