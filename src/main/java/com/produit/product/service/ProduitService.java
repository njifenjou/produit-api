package com.produit.product.service;

import com.produit.product.model.Produit;
import com.produit.product.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProduitService {
    private final ProduitRepository produitRepository;
    public List<Produit> getAllProduits(){
        return produitRepository.findAll();
    }

    public Produit createProduit(Produit produit) {
        return produitRepository.save(produit);
    }
}
