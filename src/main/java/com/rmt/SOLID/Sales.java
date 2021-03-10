package com.rmt.SOLID;

import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Sales {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){ products.add(product); }
    public void removeProduct(Product product){ products.remove(product); }

    public BigDecimal calcTotal(){
        return products.stream()
          .map(Product::getValue)
          .reduce(BigDecimal.ZERO, BigDecimal::add, BigDecimal::add);
    }
}
