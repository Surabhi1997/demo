package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.example.demo.feign.ProductManufacturerProxyForUser;
//import com.example.demo.model.ProductResponse;

@Controller
public class UserController {
	
//	@Autowired
//	ProductManufacturerProxyForUser proxy;

    @RequestMapping(value = {"/dashboard"}, method = RequestMethod.GET)
    public String homePage(){
        return "user/dashboard";
    }
    
//    @GetMapping("/getAllProductFromManufacturer")
//    public List<ProductResponse> getAllProductfromManufacturer()
//    {
//    	return proxy.getAllProductsFromProductManufacturer();
//    }
//    
//    @GetMapping("/getproductbyid/{pid}")
//	public Optional<ProductResponse> getProduct(@PathVariable int pid)
//	{
//    	return proxy.getProduct(pid);
//	}
//    
}