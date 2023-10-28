package com.sophie.store.backend.context.payment_type.domain.port;

import com.sophie.store.backend.context.payment_type.domain.model.PaymentType;

import java.util.List;
import java.util.Optional;

public interface PaymentTypeRepository {
    List<PaymentType> findAll();
    Optional<PaymentType> findById(Long id);
    Optional<PaymentType> findByName(String name);
    PaymentType create(PaymentType category);
    PaymentType update(PaymentType category);
    void deleteById(Long id);
}
