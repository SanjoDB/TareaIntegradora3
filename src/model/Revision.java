package model;

public class Revision extends Document{

    private double gasLevel;

    public Revision(double price, int year, double gasLevel){

        super(price, year);
        this.gasLevel=gasLevel;

    }

    public double getGasLevel(){
		
		return gasLevel;
		
	}

	public void setGasLevel(double gasLevel){
		
		this.gasLevel= gasLevel;
		
	}

    public String toString(){

        return "Document Price: " + super.price + "\n" +
        "Year: " + super.year + "\n" +
        "Level of gases: " + getGasLevel() + "\n";

    }
}