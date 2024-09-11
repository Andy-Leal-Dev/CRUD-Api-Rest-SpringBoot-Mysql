package dev.andy.demoApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.andy.demoApi.models.Notas;

public interface NotasRepository extends JpaRepository<Notas,Integer>{
    
}
