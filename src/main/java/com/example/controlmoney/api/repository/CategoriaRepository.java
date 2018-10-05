package com.example.controlmoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.controlmoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
