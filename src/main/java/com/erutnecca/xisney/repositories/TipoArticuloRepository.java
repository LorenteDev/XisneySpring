package com.erutnecca.xisney.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.erutnecca.xisney.entities.TipoArticulo;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TipoArticuloRepository extends CrudRepository<TipoArticulo, Integer> {
	Optional<TipoArticulo> findByNombre(String nombre);
}