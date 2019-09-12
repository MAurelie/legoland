package lego;

public class Boite implements Comparable<Boite>

{
	private int number;
	private String name;

	private int pieces;


	private int figurines;
	private double price;


	public Boite(int number, String name, int pieces, int figurines, double price) {
		super();
		this.number = number;
		this.name = name;
		this.pieces = pieces;
		this.figurines = figurines;
		this.price= price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	@Override
	public int compareTo(Boite b) {
		
		if(b.getPrice()<this.getPrice())
		{
			return -1;
		}
		else if (b.getPrice() == this.getPrice())
		{
			return 0;
		}
		
		else 
		{
			return 1;
		}
	}
	




}
