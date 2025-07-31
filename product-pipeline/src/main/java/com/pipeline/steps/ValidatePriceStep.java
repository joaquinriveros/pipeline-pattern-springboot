package com.pipeline.steps;

import com.pipeline.model.Product;
import com.pipeline.pipeline.ProductProcessor;

public class ValidatePriceStep implements ProductProcessor {
    @Override
    public Product process(Product input) {
        if (input.getPrice() <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que 0");
        }
        return input;
    }
}
