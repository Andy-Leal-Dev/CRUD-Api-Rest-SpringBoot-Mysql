package dev.andy.demoApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.RestController;

import dev.andy.demoApi.models.Notas;
import dev.andy.demoApi.services.NotasServicio;
import org.springframework.web.bind.annotation.*;





@RestController
public class NotasControllers {
    
    @Autowired
    private NotasServicio notasServicio;

    @GetMapping("/")
    public ResponseEntity<List<Notas>> getAllNotas() {
        return ResponseEntity.ok(notasServicio.ListNotas());
    }

    @GetMapping("/{id}")
    public Notas getNotasbyId(@PathVariable Integer id) {
        return notasServicio.getNotas(id);
    }

    @PostMapping("/Save")
    public Notas saveNotas(@RequestBody Notas notas){
        return notasServicio.saveNotas(notas);
    }

    @PutMapping("/notas/{id}")
    public ResponseEntity<?> putMethodName(@PathVariable Integer id, @RequestBody Notas notas) {
        try {
            Notas notasActual = notasServicio.getNotas(id);
            notasActual.setTitle(notas.getTitle());
            notasActual.setDescripcion(notas.getDescripcion());
            return ResponseEntity.ok(notasServicio.saveNotas(notasActual));

        } catch (Exception e) {
            return new ResponseEntity<Notas>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void deleteNotas(@PathVariable Integer id){
        notasServicio.deleteNotas(id);
    }



}
