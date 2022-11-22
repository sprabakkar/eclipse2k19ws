package com.processmanager.fileformater.jsonparser;

import java.io.Serializable;

public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String isbn;
	private String title;
	private String subtitle;
	private String author;
	private String published;
	private String publisher;
	private Integer pages;
	private String description;
	private String website;

	public Book() {
		super();
	}

	public Book(String isbn, String title, String subtitle, String author, String published, String publisher,
			Integer pages, String description, String website) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.subtitle = subtitle;
		this.author = author;
		this.published = published;
		this.publisher = publisher;
		this.pages = pages;
		this.description = description;
		this.website = website;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", subtitle=" + subtitle + ", author=" + author
				+ ", published=" + published + ", publisher=" + publisher + ", pages=" + pages + ", description="
				+ description + ", website=" + website + "]";
	}

}