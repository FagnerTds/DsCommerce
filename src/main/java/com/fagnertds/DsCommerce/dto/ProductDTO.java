package com.fagnertds.DsCommerce.dto;

import com.fagnertds.DsCommerce.entities.Product;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDTO {

    private Long id;
    @Size (min = 3, max = 120, message = "Nome precisa ter de 3 a 120 caracteres")
    @NotBlank(message = "campo requerido")
    private String name;
    @Size (min = 10, message = "Descrição deve ter no mínimo 10 caracteres")
    @NotBlank(message = "campo requerido")
    private String description;
    @Positive(message = "campo deve conter apenas números positivos")
    private Double price;
    private String imgUrl;

    public ProductDTO (){
    }

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
