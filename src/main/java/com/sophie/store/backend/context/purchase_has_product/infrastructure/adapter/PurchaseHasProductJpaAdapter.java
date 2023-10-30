package com.sophie.store.backend.context.purchase_has_product.infrastructure.adapter;

import com.sophie.store.backend.context.purchase_has_product.domain.model.PurchaseHasProduct;
import com.sophie.store.backend.context.purchase_has_product.domain.port.PurchaseHasProductRepository;
import com.sophie.store.backend.context.purchase_has_product.infrastructure.mappers.PurchaseHasProductMapper;
import com.sophie.store.backend.context.purchase_has_product.infrastructure.persistence.PurchaseHasProductEntity;
import com.sophie.store.backend.context.purchase_has_product.infrastructure.persistence.PurchaseHasProductJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PurchaseHasProductJpaAdapter implements PurchaseHasProductRepository {

    private final PurchaseHasProductJpaRepository purchaseHasProductJpaRepository;
    private final PurchaseHasProductMapper mapper = new PurchaseHasProductMapper();

    @Override
    public Optional<PurchaseHasProduct> findById(Long id) {
        Optional<PurchaseHasProductEntity> optPurchaseHasProduct = purchaseHasProductJpaRepository.findById(id);
        return optPurchaseHasProduct.map(mapper::entityToModel);
    }

    @Override
    public List<PurchaseHasProduct> findAllByPurchaseId(Long purchaseId) {
        List<PurchaseHasProductEntity> purchaseHasProducts = purchaseHasProductJpaRepository.findAllByPurchaseId(purchaseId);
        return mapper.entitiesToModels(purchaseHasProducts);
    }

    @Override
    public List<PurchaseHasProduct> findAllByProductId(Long productId) {
        List<PurchaseHasProductEntity> purchaseHasProducts = purchaseHasProductJpaRepository.findAllByProductId(productId);
        return mapper.entitiesToModels(purchaseHasProducts);
    }

    @Override
    public PurchaseHasProduct add(PurchaseHasProduct purchaseHasProduct) {
        PurchaseHasProductEntity purchaseHasProductEntity = purchaseHasProductJpaRepository.save(mapper.modelToEntity(purchaseHasProduct));
        return mapper.entityToModel(purchaseHasProductEntity);
    }

    @Override
    public void removeById(Long id) {
        purchaseHasProductJpaRepository.deleteById(id);
    }

}
