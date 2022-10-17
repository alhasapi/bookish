package com.alhasapi.book.service;

import com.alhasapi.book.model.PurchaseHistory;
import com.alhasapi.book.model.User;
import com.alhasapi.book.repository.IPurchaseHistoryRepository;
import com.alhasapi.book.repository.projection.IPurchaseItem;

import java.time.LocalDateTime;
import java.util.List;

public class PurchaseHistoryService implements IPurchaseHistoryService {
    private final IPurchaseHistoryRepository purchaseHistoryRepository;

    public PurchaseHistoryService(IPurchaseHistoryRepository purchaseHistoryRepository) {
        this.purchaseHistoryRepository = purchaseHistoryRepository;
    }

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory) {
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseHistoryRepository.save(purchaseHistory);
    }

    public List<IPurchaseItem> findPurchaseHistoryOfUser(Long userId) {
        return purchaseHistoryRepository.findAllPurchasesOfUser(userId);
    }
}
