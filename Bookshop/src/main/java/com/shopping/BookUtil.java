package com.shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookUtil {
	
	@Autowired
	Book book;
	
	
	public void offer(@Value("${book.bookPrice}") String p) {
		int price=Integer.parseInt(p);
		if(price<2000) {
			System.out.println("no offer ...try again");
		}
		else {
			System.out.println("10 % offer");
		}
		
	}

}
