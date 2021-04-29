package com.example.electrodomestico.repository;

import com.example.electrodomestico.entity.Electrodomestico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectrodomesticoRepository extends JpaRepository<Electrodomestico, Integer> {
}
