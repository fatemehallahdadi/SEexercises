package com.mapsa.exercise.seriesd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamExample {
    public static class Product {
        private long id;
        private String name;
        private float price;

        public Product(long id, String name, float price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }
        public static void main(String[] args) {
            List<Product> productList = new ArrayList<Product>();
            productList.add(new Product(1, "hp labtab", 1000f));
            productList.add(new Product(2, "hp c", 2000f));
            List<Float> productPriceList=new ArrayList<Float>();
           for(Product product:productList)
           {
               if(product.price>1000f)
                   productPriceList.add(product.price)
           }
//            List<Float> productPriceList = productList.stream()
//                    .filter(p -> p.price > 1000f)
//                    .map(p -> p.price)
//                   .collect(Collectors.toList());
//            System.out.println(productPriceList);
//            Stream.iterate(1,element->element+1)
//                    .filter(element->element%5==0)
//                    .limit(5)
//                    .forEach(System.out::println);
        }
    }
