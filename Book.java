package com.example.SpringProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@ Entity
public class Book {
	@Id
	private Long id;
    private String title;
    private String author;
    private double price;
    private int stock;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Long id, String title, String author, double price, int stock) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", stock=" + stock
				+ "]";
	}


}
