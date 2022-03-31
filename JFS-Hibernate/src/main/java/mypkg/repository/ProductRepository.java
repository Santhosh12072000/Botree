package mypkg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mypkg.entity.Bike;
import mypkg.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

	Product findByName(String name);

	Product findByQuantity(int quantity);
	
	Product findByPrice(double price);

	Bike save(Bike bike);

	List<Bike> saveAll(List<Bike> bikes);

	List<Bike> findAllBikes();

	Bike findBybikeId(int id);

	void deleteByBikeId(int id);
	
}
