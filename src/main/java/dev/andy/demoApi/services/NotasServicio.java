package dev.andy.demoApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.andy.demoApi.models.Notas;
import dev.andy.demoApi.repository.NotasRepository;

@Service
public class NotasServicio {
    
    @Autowired
    private NotasRepository notasRepository;

    public List<Notas> ListNotas(){
        return notasRepository.findAll();
    }
    
    public Notas getNotas(Integer id){
        return notasRepository.findById(id).get();
    }

    public Notas saveNotas(Notas notas){
        return notasRepository.save(notas);
    }

    public void deleteNotas(Integer id){
        notasRepository.deleteById(id);
    }

}
