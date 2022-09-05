package com.devbreno.brenovendas.repositories;

import com.devbreno.brenovendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
