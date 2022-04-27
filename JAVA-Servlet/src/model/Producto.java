package model;

public class Producto {
	private int id;
	private String name;
	private String color;
	private int stock;
		
	public Producto(int id, String name, String color, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.stock = stock;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getStock() {
		return stock;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", name=" + name + ", color=" + color
				+ ", stock=" + stock + "]";
	}
	

}
