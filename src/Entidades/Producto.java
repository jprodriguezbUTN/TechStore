/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author jprod
 */
public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private Categoria categoria;

    public int getId() { return id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    
    public void setPrecio(double precio) { if(precio>0) this.precio = precio; }

    public int getStock() { return stock; }

    public void setStock(int stock) { if (stock>=0) this.stock = stock; }

    public Categoria getCategoria() { return categoria; }

    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public Producto(int id, String nombre, double precio, int stock, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", categoria=" + categoria + '}';
    }
    
}
