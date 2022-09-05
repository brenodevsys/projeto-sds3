package com.devbreno.brenovendas.services;

import com.devbreno.brenovendas.dto.SaleDTO;
import com.devbreno.brenovendas.entities.Sale;
import com.devbreno.brenovendas.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    SaleRepository saleRepository;

    public Page<SaleDTO> findAll(Pageable pageable) {
        Page<Sale> result = saleRepository.findAll((org.springframework.data.domain.Pageable) pageable);
        return result.map(x -> new SaleDTO(x));
    }
}
