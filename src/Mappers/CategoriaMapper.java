/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mappers;

import Entidades.Categoria;
import Dtos.CategoriaDto;

/**
 *
 * @author jprod
 */
public class CategoriaMapper {
    public CategoriaDto toDto(Categoria categoria){
        return new CategoriaDto(categoria.getId(),categoria.getNombre());
    }
    
    public Categoria toEntidad(CategoriaDto dto){
        return new Categoria(dto.getId(),dto.getNombre());
    }
}
