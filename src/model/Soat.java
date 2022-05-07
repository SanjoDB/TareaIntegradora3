package model;

public class Soat extends Document{

    private double moneyCovering;

    public Soat(double price, int year, double moneyCovering){

        super(price, year);
        this.moneyCovering=moneyCovering;

    }

    public double getMoneyCovering(){
		
		return moneyCovering;
		
	}

	public void setMoneyCovering(double moneyCovering){
		
		this.moneyCovering= moneyCovering;
		
	}

    public String toString(){

        return "Document Price: " + super.price + "\n" +
        "Year: " + super.year + "\n" +
        "Money covering: " + getMoneyCovering() + "\n";

    }
}