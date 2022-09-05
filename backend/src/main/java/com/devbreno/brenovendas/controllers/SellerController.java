package com.devbreno.brenovendas.controllers;

import com.devbreno.brenovendas.dto.SellerDTO;
import com.devbreno.brenovendas.services.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
@RequiredArgsConstructor
public class SellerController {


    private final SellerService sellerService;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll () {

        return ResponseEntity.ok(sellerService.findAll());
    }


}
