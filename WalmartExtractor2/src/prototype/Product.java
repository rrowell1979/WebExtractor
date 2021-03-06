package prototype;

import java.util.Calendar;
import java.util.Date;

public class Product 
{
	private String title;
	private Double price;
	private String description;
	private String id;
	private String retailer;
	private String tld;
	private String timestamp;
	
	public Product(String id, String retailer, String tld, String title, Double price, String description) 
	{
		this.id = id;
		this.retailer = retailer;
		this.tld = tld;
		this.title = title;
		this.price = price;
		this.description = description;
		Date date = Calendar.getInstance().getTime();
		java.text.SimpleDateFormat sdf = 
			     new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			String currentTime = sdf.format(date);
		this.timestamp = currentTime;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRetailer() {
		return retailer;
	}

	public void setRetailer(String retailer) {
		this.retailer = retailer;
	}

	public String getTld() {
		return tld;
	}

	public void setTld(String tld) {
		this.tld = tld;
	}
}
