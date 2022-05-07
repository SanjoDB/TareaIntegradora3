package model;

public abstract class Automobile extends Vehicle{

	/** 
	 * numDoor int is use to store the name of the specie
	 */
    protected int numDoor;

	/** 
	 * polarized boolean is use to store the name of the specie
	 */
    protected boolean polarized;

	//Relationship
    protected CarType type1;

	/** 
	 * Constructor used for obj autombobile
	 * @param basePrice
	 * @param brand
	 * @param model
	 * @param cylinderCapacity
	 * @param mileage
	 * @param badge
	 * @param type
	 * @param soat
	 * @param revision
	 * @param propertyCard
	 */
    public Automobile(double basePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard, int numDoor, boolean polarized, int type1){

		super(basePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard);
        this.numDoor=numDoor;
        this.polarized=polarized;

        switch(type1){

			case 1:
				this.type1 = CarType.SEDAN;
			break;

			case 2:
				this.type1 = CarType.VAN;
			break;

		}

    }

    public int getNumDoor(){
		
		return numDoor;
		
	}

	public void setNumDoor(int numDoor){
		
		this.numDoor= numDoor;
		
	}

    public boolean getPolarized(){
		
		return polarized;
		
	}

	public void setPolarized(boolean polarized){
		
		this.polarized= polarized;
		
	}

	public CarType getType1(){
		
		return type1;
		
	}

	public void setType1(CarType type1){
		
		this.type1= type1;
		
	}

}