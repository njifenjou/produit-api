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



    @GetMapping("/all")

    public List<Produit> getAllProduits(){
        return produitService.getAllProduits();
    }

    @PostMapping

    public Produit createProduit(@RequestBody Produit produit){
        return produitService.createProduit(produit);
    }

    @GetMapping("{id}")

    public Produit getProduitById(@PathVariable Long id){
        return produitService.getProduitById(id);
    }

    @DeleteMapping("{id}")
    public String deleteProduitById(@PathVariable Long id){
        return produitService.deleteProduitById(id);
    }

    @PutMapping("{id}")

    public Produit editProduit (@PathVariable Long id, @RequestBody Produit produit){
        return produitService.editProduit(id,produit);
    }
}
