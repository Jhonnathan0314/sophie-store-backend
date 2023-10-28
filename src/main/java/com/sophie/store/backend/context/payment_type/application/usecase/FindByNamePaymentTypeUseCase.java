package com.sophie.store.backend.context.payment_type.application.usecase;

import com.sophie.store.backend.context.payment_type.domain.model.PaymentType;
import com.sophie.store.backend.context.payment_type.domain.port.PaymentTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FindByNamePaymentTypeUseCase {

    private final PaymentTypeRepository paymentTypeRepository;

    public Optional<PaymentType> findByName(String name) {
        return paymentTypeRepository.findByName(name);
    }

}
