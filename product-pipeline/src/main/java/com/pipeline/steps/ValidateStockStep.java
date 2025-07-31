package com.pipeline.steps;

import com.pipeline.model.Product;
import com.pipeline.pipeline.ProductProcessor;

public class ValidateStockStep implements ProductProcessor {
    @Override
    public Product process(Product input) {
        if (input.getStock() < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
        return input;
    }
}
