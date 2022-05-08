package model;

public class Soat extends Document{

    /** 
	 * moneyCovering double, is use to store the amount of money recovered if any accident occur
	 */
    private double moneyCovering;

    /** 
	 * Constructor used for obj document
	 * @param price
	 * @param year
     * @param moneyCovering
	 */
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

    /**
	 * Method used to show the information of a Soat Document
	 * @return Soat Document
	 */
    public String toString(){

        return "Document Price: " + super.price + "\n" +
        "Year: " + super.year + "\n" +
        "Money covering: " + getMoneyCovering() + "\n";

    }
}