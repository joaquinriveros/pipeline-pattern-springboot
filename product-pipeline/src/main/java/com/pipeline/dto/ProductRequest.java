package com.pipeline.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProductRequest {
    @NotBlank(message = "El nombre es obligatorio")
    private String name;

    @Min(value = 1, message = "El precio debe ser mayor a 0")
    private double price;

    @Min(value = 0, message = "El stock no puede ser negativo")
    private int stock;
}