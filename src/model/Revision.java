package model;

public class Revision extends Document{

    /** 
	 * gasLevel double, is use to store the level of the gases of the Revision document
	 */
    private double gasLevel;

    /** 
	 * Constructor used for obj document
	 * @param price
	 * @param year
     * @param gasLevel
	 */
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

    /**
	 * Method used to show the information of a revision Document
	 * @return revision Document
	 */
    public String toString(){

        return "Document Price: " + super.price + "\n" +
        "Year: " + super.year + "\n" +
        "Level of gases: " + getGasLevel() + "\n";

    }
}