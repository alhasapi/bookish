package com.alhasapi.book.service;

import com.alhasapi.book.model.PurchaseHistory;
import com.alhasapi.book.model.User;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);
}
