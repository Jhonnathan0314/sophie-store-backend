package com.sophie.store.backend.context.product.application.usecase;

import com.sophie.store.backend.context.product.domain.model.Product;
import com.sophie.store.backend.context.product.domain.port.ProductRepository;
import com.sophie.store.backend.utils.constants.ErrorMessages;
import com.sophie.store.backend.utils.exceptions.NoResultsException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAllProductUseCase {

    private final ProductRepository productRepository;
    private final ErrorMessages errorMessages = new ErrorMessages();

    public List<Product> findAll() throws NoResultsException {
        List<Product> products = productRepository.findAll();
        if(products == null || products.isEmpty()) throw new NoResultsException(errorMessages.NO_RESULTS);
        return products;
    }

}
