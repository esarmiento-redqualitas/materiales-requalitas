package com.example.electrodomestico.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Electrodomestico {
    @Id
    private int id;
    private double precio;
    private String color;
    private char consumo;
    private double peso;


    public Electrodomestico() {
    }

    public Electrodomestico(double precio, double peso) {
        this.precio = precio;
        this.peso = peso;
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularPrecio(){
        double precioArticulo = 0;
        switch (consumo) {
            case 'A':
                precioArticulo = peso * 100;
                break;
            case 'B':
                precioArticulo = peso * 90;
                break;
            case 'C':
                precioArticulo = peso * 80;
                break;
            case 'D':
                precioArticulo = peso * 70;
                break;
            case 'E':
                precioArticulo = peso * 60;
                break;
            case 'F':
                precioArticulo = peso * 50;
                break;

        }
        return precioArticulo;
    }
}
