package com.devbreno.brenovendas.controllers;

import com.devbreno.brenovendas.dto.SellerDTO;
import com.devbreno.brenovendas.services.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sellers")
@RequiredArgsConstructor
public class SellerController {
    private final SellerService sellerService;

    @GetMapping
    public ResponseEntity<Page<SellerDTO>> findAll (Pageable pageable) {
        Page<SellerDTO> list = sellerService.findAll(pageable);
        return ResponseEntity.ok(list);
    }


}
