package com.produit.product.service;

import com.produit.product.model.Produit;
import com.produit.product.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProduitService {
    private final ProduitRepository produitRepository;

    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    public Produit createProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public Produit getProduitById(Long id) {
        Optional<Produit> optionalProduit = produitRepository.findById(id);

        if (optionalProduit.isEmpty()) {
            throw new RuntimeException("désolé produit inexistant");
        }
        return optionalProduit.get();
    }

    public String deleteProduitById(Long id) {
        Optional<Produit> optionalProduit = produitRepository.findById(id);
        if(optionalProduit.isEmpty()){
            throw new RuntimeException("produit inexistant");
        }
        produitRepository.delete(optionalProduit.get());

        return "produit supprimé avec succès!! ";
    }

    public Produit editProduit(Long id, Produit produit) {
        Optional<Produit> optionalProduit = produitRepository.findById(id);
        if(optionalProduit.isEmpty()){
            throw new RuntimeException("Modification impossible");
        }
        Produit produit1 = optionalProduit.get();
        produit1.setName(produit.getName());
        produit1.setPrice(produit.getPrice());

        return produitRepository.save(produit1);
    }
}
