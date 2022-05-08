package model;

public abstract class Automobile extends Vehicle{

	/** 
	 * numDoor int, is use to store the number of the doors of the automobile
	 */
    protected int numDoor;

	/** 
	 * polarized boolean, it states if the windows of the automobile are polarized or not
	 */
    protected boolean polarized;

	//Relationship
    protected CarType type1;

	/** 
	 * Constructor used for obj automobile
	 * @param basePrice
	 * @param salePrice
	 * @param brand
	 * @param model
	 * @param cylinderCapacity
	 * @param mileage
	 * @param badge
	 * @param type
	 * @param soat
	 * @param revision
	 * @param propertyCard
	 * @param numDoor
	 * @param polarized
	 * @param type1
	 */
    public Automobile(double basePrice, double salePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard, int numDoor, boolean polarized, int type1){

		super(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard);
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