package com.alhasapi.book.repository.projection;

import java.time.LocalDateTime;

public interface IPurchaseItem {
    public String getTitle();
    public String getPrice();
    public LocalDateTime getPurchaseTime();
}
