package com.produit.product.controller;

import com.produit.product.model.Produit;
import com.produit.product.service.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produit")
@RequiredArgsConstructor
public class ProduitController {
    private final ProduitService produitService;

    @GetMapping("/hello")

    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/all")

    public List<Produit> getAllProduits(){
        return produitService.getAllProduits();
    }

    @PostMapping

    public Produit createProduit(@RequestBody Produit produit){
        return produitService.createProduit(produit);
    }
}
