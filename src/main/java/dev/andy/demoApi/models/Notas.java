package dev.andy.demoApi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Notas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String descripcion;

    public Notas(int id, String title, String descripcion){
        super();
        this.id = id;
        this.title = title;
        this.descripcion = descripcion;
    }

    public Notas( String title, String descripcion){
        super();
        this.title = title;
        this.descripcion = descripcion;
    }

    public Notas(){
        super();

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
