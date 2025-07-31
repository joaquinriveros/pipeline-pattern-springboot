package com.pipeline.steps;

import com.pipeline.model.Product;
import com.pipeline.pipeline.ProductProcessor;

public class TitleCaseStep implements ProductProcessor {
    @Override
    public Product process(Product input) {
        String titleCase = Character.toUpperCase(input.getName().charAt(0)) +
                           input.getName().substring(1).toLowerCase();
        input.setName(titleCase);
        return input;
    }
}
