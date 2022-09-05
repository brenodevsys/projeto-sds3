package com.devbreno.brenovendas.services;

import com.devbreno.brenovendas.dto.SaleDTO;
import com.devbreno.brenovendas.entities.Sale;
import com.devbreno.brenovendas.repositories.SaleRepository;
import com.devbreno.brenovendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class SaleService {

    @Autowired
    SaleRepository saleRepository;

    @Autowired
    SellerRepository sellerRepository;

    @Transactional()
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(SaleDTO::new);
    }

}
