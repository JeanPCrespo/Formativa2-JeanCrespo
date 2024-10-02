package com.example.formativa2.productos;

public class Productos {
    private String img;
    private String nombre;
    private double precio;
    private String detalles;

    public Productos(String img, double precio, String nombre, String detalles) {
        this.img = img;
        this.precio = precio;
        this.nombre = nombre;
        this.detalles = detalles;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}
