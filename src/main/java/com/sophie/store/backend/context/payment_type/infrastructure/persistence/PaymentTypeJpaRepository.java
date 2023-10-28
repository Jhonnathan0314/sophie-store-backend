package com.sophie.store.backend.context.payment_type.infrastructure.persistence;

import com.sophie.store.backend.context.category.infrastructure.persistence.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentTypeJpaRepository extends JpaRepository<PaymentTypeEntity, Long> {

    Optional<PaymentTypeEntity> findByName(String name);

}
