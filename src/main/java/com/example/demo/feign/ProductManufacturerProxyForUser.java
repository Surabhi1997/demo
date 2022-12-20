//package com.example.demo.feign;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import com.example.demo.model.ProductResponse;
//
//
//@FeignClient(name="productmanufacturer", url="localhost:8081")
//public interface ProductManufacturerProxyForUser {
//
//	@GetMapping("/list")
//	public List<ProductResponse> getAllProductsFromProductManufacturer();
//	
//	@GetMapping("/getproductbyid/{pid}")
//	public Optional<ProductResponse> getProduct(@PathVariable int pid);
//	
//}
