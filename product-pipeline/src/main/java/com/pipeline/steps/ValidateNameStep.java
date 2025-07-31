package com.pipeline.steps;

import com.pipeline.model.Product;
import com.pipeline.pipeline.ProductProcessor;

public class ValidateNameStep implements ProductProcessor {
    @Override
    public Product process(Product input) {
        if (input.getName() == null || input.getName().isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        return input;
    }
}
