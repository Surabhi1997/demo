//package com.example.demo.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.model.ProductResponse;

//@Controller
//public class ProductController {
//
//	@RequestMapping(value = {"/products"}, method = RequestMethod.GET)
//    public String products(){
//		  return "admin/products";
//    }
//    
//	@RequestMapping(value = {"/getAllProducts"}, method = RequestMethod.GET)
//    public String getAllProducts(){
//		  return "admin/getAllProducts";
//    }
//}

//@RestController
//@RequestMapping("/productjson")
//public class ProductController {
//
//    @GetMapping(path = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
//    public List <ProductResponse> getAllProducts() {
//        List <ProductResponse> products = List.of(
//            new ProductResponse(1, "T.V.", 1000),
//            new ProductResponse(2, "A.C.", 2000)
//        );
//        return products;
//    }
//}
