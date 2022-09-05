package com.devbreno.brenovendas.services;

import com.devbreno.brenovendas.dto.SellerDTO;
import com.devbreno.brenovendas.entities.Seller;
import com.devbreno.brenovendas.repositories.SellerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class SellerService {

    private final SellerRepository sellerRepository;

    public Page<SellerDTO> findAll(Pageable pageable) {
        Page<Seller> result = sellerRepository.findAll(pageable);
        return result.map(SellerDTO::new);

    }

}
