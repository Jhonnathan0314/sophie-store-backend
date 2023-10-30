package com.sophie.store.backend.context.purchase_has_product.application.dto;

import com.sophie.store.backend.context.product.application.dto.ProductCreateDTO;
import com.sophie.store.backend.context.purchase.application.dto.PurchaseGenerateDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseHasProductAddDTO {
    private Integer quantity;
}
