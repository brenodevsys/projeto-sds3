package com.devbreno.brenovendas.repositories;

import com.devbreno.brenovendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
