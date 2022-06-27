package com.example.tareaProducto.repository;

import com.example.tareaProducto.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
}
