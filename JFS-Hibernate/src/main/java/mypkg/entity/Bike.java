package mypkg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity
	@Table(name="Bike")
	public class Bike {
		
		@Id
		@GeneratedValue
		private int id;
		private String name;
		private int quantity;
		//@Transient
		private double price;

		public Bike(int id, String name, int quantity, double price) {
			super();
			this.id = id;
			this.name = name;
			this.quantity = quantity;
			this.price = price;
		}
		public Bike() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		
//		@Override
//		public String toString() {
//			return "Bike [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
//		}
//		
		
}
