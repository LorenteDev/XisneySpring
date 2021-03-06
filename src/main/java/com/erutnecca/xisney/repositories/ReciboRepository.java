package com.erutnecca.xisney.repositories;

import org.springframework.data.repository.CrudRepository;

import com.erutnecca.xisney.entities.Recibo;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ReciboRepository extends CrudRepository<Recibo, Integer> {
	Recibo findByIdUsuarioAndPrecioTotalAndFechaCompra(int idUsuario, double precioTotal, String fechaCompra);
}