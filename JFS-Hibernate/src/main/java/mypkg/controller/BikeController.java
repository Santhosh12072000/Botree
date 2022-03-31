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

import mypkg.entity.Bike;
import mypkg.entity.Product;
import mypkg.service.BikeService;
import mypkg.service.ProductService;
@RestController
public class BikeController {
	@Autowired
	private BikeService bikeservice;
	

	@PostMapping("/addbike")
	public Bike addproduct(@RequestBody Bike bike) {
		return bikeservice.saveBike(bike);
	}
	@PostMapping("/addbikes")
	public List<Bike> addbikes(@RequestBody List<Bike> bikes) {
		return bikeservice.saveBikes(bikes);
	}
	@GetMapping("/bikes")
	public List<Bike>findAllBikes(){
		return bikeservice.getBikes();
	}
//	@GetMapping("/product/{name}")
//	public Product findProductByName(@PathVariable String name)
//	{
//		return productservice.getProductByName(name);
//	}
//	@GetMapping("/findProductById/{id}")
//	public Product findProductById(@PathVariable int id) {
//		return productservice.getProductById(id);
//		
//	}
//	@GetMapping("/findProductByQuantity/{quantity}")
//	public Product findProductByQuantity(@PathVariable int quantity) {
//		return productservice.getProductByQuantity(quantity);
//		
//	}
//	@GetMapping("/findProductByPrice/{price}")
//	public Product findProductByPrice(@PathVariable double price) {
//		return productservice.getProductByPrice(price);
//		
//	}
	@PutMapping("/updatebike")
	public Bike updateBike(@RequestBody Bike bike) {
		return bikeservice.updateBike(bike);
	}
	@DeleteMapping("/deletebike/{id}")
	public String deleteProduct(@PathVariable int id) {
		return bikeservice.deleteBike(id);
	}


}
