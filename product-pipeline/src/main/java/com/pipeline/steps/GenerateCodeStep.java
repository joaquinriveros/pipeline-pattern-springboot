package com.pipeline.steps;

import com.pipeline.model.Product;
import com.pipeline.pipeline.ProductProcessor;

import java.util.UUID;

public class GenerateCodeStep implements ProductProcessor {
    @Override
    public Product process(Product input) {
        input.setGeneratedCode(UUID.randomUUID().toString().substring(0, 8));
        return input;
    }
}
