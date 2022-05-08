package model;

public class Gasoline extends Automobile implements GasolineConsume{

	/** 
	 * tankCapacity double, is use to store the capacity of the tank of the gas automobile
	 */
    private double tankCapacity;

	/** 
	 * typeGasoline GasolineType, is use to store the type of gasoline the automobile uses
	 */
    private GasolineType typeGasoline;

	/** 
	 * Constructor used for obj gasoline autombobile
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
	 * @param tankCapacity
	 * @param typeGasoline
	 */
    public Gasoline(double basePrice, double salePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard, int numDoor, boolean polarized, int type1, double tankCapacity, int typeGasoline){

        super(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1);
        this.tankCapacity=tankCapacity;

        switch(typeGasoline){

			case 1:
				this.typeGasoline = GasolineType.EXTRA;
			break;

			case 2:
				this.typeGasoline = GasolineType.ORDINARY;
			break;

            case 3:
				this.typeGasoline = GasolineType.DIESEL;
			break;

		}

    }

    public double getTankCapacity(){
		
		return tankCapacity;
		
	}

	public void setTankCapacity(double tankCapacity){
		
		this.tankCapacity= tankCapacity;
		
	}

    public GasolineType getTypeGasoline(){
		
		return typeGasoline;
		
	}

	public void setTypeGasoline(GasolineType typeGasoline){
		
		this.typeGasoline= typeGasoline;
		
	}

	/**
	 * Method used to calculate the consume of gasoline of the Automobile
	 */
	public double consumeGasoline(){

		return (getTankCapacity() * (super.cylinderCapacity/150));

	}

	/**
	 * Method used to calculate the sale price of the Gasoline Automobile
	 */
	@Override
	public void sellPrice(int discount, double extraD){

		if(soat.getYear()!=Control.ACTUAL_YEAR && revision.getYear()!=Control.ACTUAL_YEAR){
			super.salePrice+= super.salePrice+500000;
		}

		super.salePrice+= basePrice;

		if(type==VehicleType.USED){
			super.salePrice+= super.salePrice-(super.salePrice*(10/100));
		}
		if(discount==1){
			super.salePrice+= super.salePrice-(basePrice*(extraD/100));
		}
	}

	/**
	 * Method used to show the information of a Gasoline Automobile
	 * @return Gasoline Automobile
	 */
	public String toString(){

        return "Base Price: " + super.basePrice + "\n" +
        "Brand: " + super.brand + "\n" +
		"Model: " + super.model + "\n" +
		"Cylinder Capacity: " + super.cylinderCapacity + "\n" +
		"Mileage: " + super.mileage + "\n" +
		"Badge: " + super.badge + "\n" +
		"Type of Vehicle: " + super.type + "\n" +
		"SOAT: " + "\n" + super.soat +
		"Mechanicle revision: " + "\n" + super.revision +
		"Property Card: " + "\n" + super.propertyCard +
		"Number of Doors: " + super.numDoor + "\n" +
		"Is it Polarized: " + super.polarized + "\n" +
		"Type of Automobile: " + super.type1 + "\n" +
		"Tank Capacity: " + getTankCapacity() + "\n" +
		"Type of gas: " + getTypeGasoline() + "\n" +
		"Gasoline Consume: " + consumeGasoline() + "\n" +
		"Sell Price: " + super.salePrice + "\n";

    }
}