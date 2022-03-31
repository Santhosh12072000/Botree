package mypkg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypkg.entity.Product;
import mypkg.repository.ProductRepository;
@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	public List<Product> saveProducts(List<Product>products){
		return productRepository.saveAll(products);
	}
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	public Product getProductByName(String name){
		return productRepository.findByName(name);
	}
	public Product getProductById(int id) {
		
		return productRepository.findById(id).orElse(null);
	}
    public Product getProductByQuantity(int quantity) {
		
		return productRepository.findByQuantity(quantity);
	}
    public Product getProductByPrice(double price) {
		
		return productRepository.findByPrice(price);
	}
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		Product availableProduct=productRepository.findById(product.getId()).orElse(null);
		availableProduct.setName("micromax");
		availableProduct.setQuantity(100);
		availableProduct.setPrice(1000);
		//availableProduct.setName("micromax");
		return productRepository.save(availableProduct);
	}
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
		return "product removed is:"  +id;

	}
//	public Product deleteProduct(int id) {
//		 TODO Auto-generated method stub
//		return null;
//	}

}
