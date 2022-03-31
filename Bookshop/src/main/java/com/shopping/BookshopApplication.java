package com.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BookshopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(BookshopApplication.class, args);
		Book book=context.getBean(Book.class);
		System.out.println(book.getBookId());
		System.out.println(book.getBookName());
		System.out.println(book.getBookPrice());
		
		BookUtil bookUtil=context.getBean(BookUtil.class);
		bookUtil.offer("2500");
		//bookUtil.offer();
		
		
		
		
	}

}