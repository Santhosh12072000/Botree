package com.shopping;

import org.springframework.stereotype.Component;

@Component
public class Book {
        int BookId=100;
        String BookName= "one day life will change";
        int BookPrice=500;
		public int getBookId() {
			return BookId;
		}
		public void setBookId(int bookId) {
			BookId = bookId;
		}
		public String getBookName() {
			return BookName;
		}
		public void setBookName(String bookName) {
			BookName = bookName;
		}
		public int getBookPrice() {
			return BookPrice;
		}
		public void setBookPrice(int bookPrice) {
			BookPrice = bookPrice;
		}
}