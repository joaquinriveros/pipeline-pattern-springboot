package com.pipeline.service;

import com.pipeline.dto.ProductRequest;
import com.pipeline.model.Product;
import com.pipeline.pipeline.Pipeline;
import com.pipeline.pipeline.ProductProcessor;
import com.pipeline.steps.*;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    private final Pipeline pipeline;

    public ProductService() {
        List<ProductProcessor> steps = List.of(
                new ValidateNameStep(),
                new ValidatePriceStep(),
                new ValidateStockStep(),
                new GenerateCodeStep(),
                new TitleCaseStep()
        );
        this.pipeline = new Pipeline(steps);
    }

    public Product processProduct(ProductRequest request) {
        Product product = new Product(request.getName(), request.getPrice(), request.getStock(), null);
        return pipeline.execute(product);
    }
}
