package com.pipeline.pipeline;

import com.pipeline.model.Product;
import java.util.List;

public class Pipeline {
    private final List<ProductProcessor> steps;

    public Pipeline(List<ProductProcessor> steps) {
        this.steps = steps;
    }

    public Product execute(Product input) {
        Product current = input;
        for (ProductProcessor step : steps) {
            current = step.process(current);
        }
        return current;
    }
}
