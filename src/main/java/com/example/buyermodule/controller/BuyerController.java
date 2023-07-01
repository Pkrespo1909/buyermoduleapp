package com.example.buyermodule.controller;

import com.example.buyermodule.model.Buyer;
import com.example.buyermodule.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buyers")
public class BuyerController {
    @Autowired
    private BuyerService buyerService;

    @PostMapping
    public Buyer createBuyer(@RequestBody Buyer buyer) {
        return buyerService.createBuyer(buyer);
    }

    @GetMapping("/{id}")
    public Buyer getBuyerById(@PathVariable Long id) {
        return buyerService.getBuyerById(id);
    }

    @GetMapping
    public List<Buyer> getAllBuyers() {
        return buyerService.getAllBuyers();
    }
}
