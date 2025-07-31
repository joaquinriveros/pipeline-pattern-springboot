package com.pipeline.pipeline;

import com.pipeline.model.Product;

public interface ProductProcessor {
    Product process(Product input);
}
