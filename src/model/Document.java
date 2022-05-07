package model;

public class Document{

    protected double price;
    protected int year;
    //protected image;

    public Document(double price, int year){

        this.price=price;
        this.year=year;

    }

    public double getPrice(){
		
		return price;
		
	}

	public void setPrice(double price){
		
		this.price= price;
		
	}

    public int getYear(){
		
		return year;
		
	}

	public void setYear(int year){
		
		this.year= year;
		
	}

	public String toString(){

        return "Document Price: " + getPrice() + "\n" +
        "Year: " + getYear() + "\n";

    }
}