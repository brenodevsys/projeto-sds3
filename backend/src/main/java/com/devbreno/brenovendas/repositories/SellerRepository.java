package com.devbreno.brenovendas.repositories;

import com.devbreno.brenovendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
