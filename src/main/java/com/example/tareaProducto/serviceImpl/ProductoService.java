package com.example.tareaProducto.serviceImpl;

import com.example.tareaProducto.entity.Producto;
import java.util.List;


public interface ProductoService {
    Producto create(Producto producto);
    Producto update(Producto producto);
    void delete(int id);
    Producto read(int id);
    List<Producto> readAll();
}
