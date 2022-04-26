package br.com.meli.dhprojetointegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.meli.dhprojetointegrador.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
