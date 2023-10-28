package com.sophie.store.backend.context.product.infrastructure.mappers;

import com.sophie.store.backend.context.product.application.dto.ProductUpdateDTO;
import com.sophie.store.backend.context.product.domain.model.Product;
import com.sophie.store.backend.context.product.infrastructure.persistence.ProductEntity;
import com.sophie.store.backend.utils.mappers.Mapper;

import java.util.List;
import java.util.stream.Collectors;

public class ProductUpdateMapper implements Mapper<ProductEntity, Product, ProductUpdateDTO> {

    @Override
    public Product entityToModel(ProductEntity entity) {
        return Product.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .price(entity.getPrice())
                .quantity(entity.getQuantity())
                .qualification(entity.getQualification())
                .updateBy(entity.getUpdateBy())
                .build();
    }

    @Override
    public ProductEntity modelToEntity(Product model) {
        return ProductEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .description(model.getDescription())
                .price(model.getPrice())
                .quantity(model.getQuantity())
                .qualification(model.getQualification())
                .updateBy(model.getUpdateBy())
                .build();
    }

    @Override
    public ProductUpdateDTO modelToDto(Product model) {
        return ProductUpdateDTO.builder()
                .id(model.getId())
                .name(model.getName())
                .description(model.getDescription())
                .price(model.getPrice())
                .quantity(model.getQuantity())
                .qualification(model.getQualification())
                .updateBy(model.getUpdateBy())
                .build();
    }

    @Override
    public Product dtoToModel(ProductUpdateDTO dto) {
        return Product.builder()
                .id(dto.getId())
                .name(dto.getName())
                .description(dto.getDescription())
                .price(dto.getPrice())
                .quantity(dto.getQuantity())
                .qualification(dto.getQualification())
                .updateBy(dto.getUpdateBy())
                .build();
    }

    @Override
    public List<Product> entitiesToModels(List<ProductEntity> entities) {
        return entities.stream()
                .map(this::entityToModel)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductEntity> modelsToEntities(List<Product> models) {
        return models.stream()
                .map(this::modelToEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductUpdateDTO> modelsToDtos(List<Product> models) {
        return models.stream()
                .map(this::modelToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Product> dtosToModels(List<ProductUpdateDTO> dtos) {
        return dtos.stream()
                .map(this::dtoToModel)
                .collect(Collectors.toList());
    }

}