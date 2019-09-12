package lego;

public class Boite {
	private int number;
	private String name;
	
	private int pieces;


	private int figurines;
	private float price;

	
	public Boite(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Voici une boîte de lego \""+name+"\" (id = "+number+") contenant "+pieces+" pièces, avec "+figurines+" figurines. Elle coute "+price+"€.";
	}
	
	
	public int getPieces() {
		return pieces;
	}
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}
	public int getFigurines() {
		return figurines;
	}
	public void setFigurines(int figurines) {
		this.figurines = figurines;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}
