package mypkg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypkg.entity.Bike;
import mypkg.entity.Product;
import mypkg.repository.ProductRepository;

@Service
public class BikeService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Bike saveBike(Bike bike) {
		return productRepository.save(bike);
	}
	public List<Bike> saveBikes(List<Bike>bikes){
		return productRepository.saveAll(bikes);
	}
	public List<Bike> getBikes(){
		return productRepository.findAllBikes();
	}
//	public Product getProductByName(String name){
//		return productRepository.findByName(name);
//	}
//	public Product getProductById(int id) {
//		
//		return productRepository.findById(id).orElse(null);
//	}
//    public Product getProductByQuantity(int quantity) {
//		
//		return productRepository.findByQuantity(quantity);
//	}
//    public Product getProductByPrice(double price) {
//		
//		return productRepository.findByPrice(price);
//	}
	public Bike updateBike(Bike bike) {
		// TODO Auto-generated method stub
		Bike availableBike=productRepository.findBybikeId(bike.getId());
		availableBike.setName("BMW");
		availableBike.setQuantity(100);
		availableBike.setPrice(1000);
		//availableProduct.setName("micromax");
		return productRepository.save(availableBike);
	}
	public String deleteBike(int id) {
		// TODO Auto-generated method stub
		productRepository.deleteByBikeId(id);
		return "product removed is:"  +id;

	}

	
}
