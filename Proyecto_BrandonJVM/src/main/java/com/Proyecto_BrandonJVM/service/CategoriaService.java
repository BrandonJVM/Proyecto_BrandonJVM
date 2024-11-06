
package com.Proyecto_BrandonJVM.service;
import com.Proyecto_BrandonJVM.demo.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    // Get a list of categories in a List
    public List<Categoria> getCategorias(boolean activos);

    // Get a Category, based on the ID of a category
    public Categoria getCategoria(Categoria categoria);

    // Insert a new category if the category ID is empty
    // Update a category if the category ID is NOT empty
    public void save(Categoria categoria);

    // Delete the category that has the ID passed as a parameter
    public void delete(Categoria categoria);
}