package com.example.buyermodule.service;

import com.example.buyermodule.model.Buyer;

import java.util.List;

public interface BuyerService {
    Buyer createBuyer(Buyer buyer);
    Buyer getBuyerById(Long id);
    List<Buyer> getAllBuyers();
}
