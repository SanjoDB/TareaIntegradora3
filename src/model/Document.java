package model;

public class Document{

    /** 
	 * price double, is use to store the price of the document
	 */
    protected double price;

    /** 
	 * year int, is use to store the year of the released of the document
	 */
    protected int year;

    //protected image;

    /** 
	 * Constructor used for obj document
	 * @param price
	 * @param year
	 */
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

    /**
	 * Method used to show the information of a Document
	 * @return Document
	 */
	public String toString(){

        return "Document Price: " + getPrice() + "\n" +
        "Year: " + getYear() + "\n";

    }
}