package com.sophie.store.backend.context.purchase_has_product.domain.port;

import com.sophie.store.backend.context.purchase_has_product.domain.model.PurchaseHasProduct;

import java.util.List;
import java.util.Optional;

public interface PurchaseHasProductRepository {

    Optional<PurchaseHasProduct> findById(Long id);
    List<PurchaseHasProduct> findAllByPurchaseId(Long purchaseId);
    List<PurchaseHasProduct> findAllByProductId(Long productId);
    PurchaseHasProduct add(PurchaseHasProduct purchaseHasProduct);
    void removeById(Long id);

}
