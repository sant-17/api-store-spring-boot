package com.storeapi.persistence;

import com.storeapi.persistence.crud.ProductoCrudRepository;
import com.storeapi.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
