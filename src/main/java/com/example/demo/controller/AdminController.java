package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.example.demo.feign.ProductManufacturerProxyForAdmin;
//import com.example.demo.model.ProductResponse;

@Controller
public class AdminController {
	
//	@Autowired
//	ProductManufacturerProxyForAdmin proxy;

    @RequestMapping(value = {"/admin/dashboard"}, method = RequestMethod.GET)
    public String adminHome(){
        return "admin/dashboard";
    }
    
    
    
//    @GetMapping("/getAllProductFromManufacturer")
//    public List<ProductResponse> getAllProductfromManufacturer()
//    {
//    	return proxy.getAllProductsFromProductManyfacturer();
//    }
//    
//    @GetMapping("/getproductbyid/{pid}")
//	public Optional<ProductResponse> getProduct(int pid)
//    {
//    	return proxy.getProduct(pid);
//    }
//    
    
}