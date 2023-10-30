package com.sophie.store.backend.context.purchase_has_product.infrastructure.persistence;

import com.sophie.store.backend.context.product.infrastructure.persistence.ProductEntity;
import com.sophie.store.backend.context.purchase.infrastructure.persistence.PurchaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "purchase_has_product")
public class PurchaseHasProductEntity {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "purchase_id")
    private PurchaseEntity purchase;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    @Column(name = "quantity")
    private Integer quantity;

}
