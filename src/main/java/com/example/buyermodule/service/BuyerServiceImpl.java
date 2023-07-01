package com.example.buyermodule.service;

import com.example.buyermodule.model.Buyer;
import com.example.buyermodule.repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private BuyerRepository buyerRepository;

    @Override
    public Buyer createBuyer(Buyer buyer) {
        return buyerRepository.save(buyer);
    }

    @Override
    public Buyer getBuyerById(Long id) {
        Optional<Buyer> optionalBuyer = buyerRepository.findById(id);
        return optionalBuyer.orElse(null);
    }

    @Override
    public List<Buyer> getAllBuyers() {
        return buyerRepository.findAll();
    }
}
