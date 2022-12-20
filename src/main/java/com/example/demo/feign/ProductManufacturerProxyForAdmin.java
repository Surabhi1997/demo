//package com.example.demo.feign;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import com.example.demo.model.ProductResponse;
//
//
//@FeignClient(name="productmanufacturer", url="localhost:8081")
//public interface ProductManufacturerProxyForAdmin {
//
//	@GetMapping("/list")
//	public List<ProductResponse> getAllProductsFromProductManyfacturer();
//	
//	@GetMapping("/getproductbyid/{pid}")
//	public Optional<ProductResponse> getProduct(int pid);
	
//	@PostMapping("/add")
//	public String createProduct(ProductResponse product);
	
//	@PutMapping("/updateproduct/{pid}")
//	public String editProduct(int pid, ProductResponse product);
//	
//	@DeleteMapping("/deleteproduct/{pid}")
//	public boolean deleteProduct(int pid);
//	
//}
