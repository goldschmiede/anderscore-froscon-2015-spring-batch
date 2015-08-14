package com.anderscore.springbatchexample.simple.processor;

import java.util.Arrays;

import org.springframework.batch.item.ItemProcessor;

import com.anderscore.springbatchexample.simple.model.Product;

/**
 * Processor that finds existing products and updates a product quantity appropriately
 */
public class ProductItemProcessor2 implements ItemProcessor<Product,Product>
{
//	static final int[] FILTER_ID_ARRAY = new int[] {7, 8}; 
	
    @Override
    public Product process(Product product) throws Exception
    {        
        // Hinzufügen einer besonderen Beschreibung zu Produkten mit einer bestimmten ID
        if(product.getId() == 8) {
        	product.setDescription("Processor2 sagt Hallo!");
        }   
        return product;
    }
}