package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserLibrary {
	@Override
	public String toString() {
		return "UserLibrary [id=" + id + ", book_name=" + book_name + ", book_desc=" + book_desc + ", price=" + price
				+ ", getPrice()=" + getPrice() + ", getId()=" + getId() + ", getBook_name()=" + getBook_name()
				+ ", getBook_desc()=" + getBook_desc() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public UserLibrary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserLibrary(int id, String book_name, String book_desc, long price) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.book_desc = book_desc;
		this.price = price;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String book_name;
	private String book_desc;
	private long price;
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_desc() {
		return book_desc;
	}
	public void setBook_desc(String book_desc) {
		this.book_desc = book_desc;
	}

}
