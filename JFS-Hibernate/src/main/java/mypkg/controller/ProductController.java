package mypkg.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mypkg.entity.Product;
import mypkg.service.ProductService;

@RestController

public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
//	@PostMapping
//	public Product addproduct(@RequestBody Product product) {
//		return productservice.saveProduct(product);
	@PostMapping("/addproduct")
	public Product addproduct(@RequestBody Product product) {
		return productservice.saveProduct(product);
	}
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return productservice.saveProducts(products);
	}
	@GetMapping("/products")
	public List<Product>findAllProducts(){
		return productservice.getProducts();
	}
	@GetMapping("/product/{name}")
	public Product findProductByName(@PathVariable String name)
	{
		return productservice.getProductByName(name);
	}
	@GetMapping("/findProductById/{id}")
	public Product findProductById(@PathVariable int id) {
		return productservice.getProductById(id);
		
	}
	@GetMapping("/findProductByQuantity/{quantity}")
	public Product findProductByQuantity(@PathVariable int quantity) {
		return productservice.getProductByQuantity(quantity);
		
	}
	@GetMapping("/findProductByPrice/{price}")
	public Product findProductByPrice(@PathVariable double price) {
		return productservice.getProductByPrice(price);
		
	}
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return productservice.updateProduct(product);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return productservice.deleteProduct(id);
	}

}