package model;

public class Motorcycle extends Vehicle{

	/** 
	 * gasolineCapacity double, is use to store the capacity of gasoline of the Motorcycle
	 */
    private double gasolineCapacity;

	/** 
	 * typeGasoline GasolineType, is use to store the type of Motorcycle
	 */
    private MotorcycleType type2;

	/** 
	 * Constructor used for the Motorcycle
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
	 * @param gasolineCapacity
	 * @param type2
	 */
    public Motorcycle(double basePrice, double salePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard, double gasolineCapacity, int type2){

		super(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard);
        this.gasolineCapacity=gasolineCapacity;

        switch(type2){

			case 1:
				this.type2 = MotorcycleType.STANDARD;
			break;

			case 2:
				this.type2 = MotorcycleType.SPORTS;
			break;

            case 3:
				this.type2 = MotorcycleType.SCOOTER;
			break;

            case 4:
				this.type2 = MotorcycleType.CROSS;
			break;

		}

    }

    public double getGasolineCapacity(){
		
		return gasolineCapacity;
		
	}

	public void setGasolineCapacity(double gasolineCapacity){
		
		this.gasolineCapacity= gasolineCapacity;
		
	}

	public MotorcycleType getType2(){
		
		return type2;
		
	}

	public void setType2(MotorcycleType type2){
		
		this.type2= type2;
		
	}

	/**
	 * Method used to calculate the consume of gasoline of the Motorcycle
	 */
	public double consumeGasoline(){

		return (getGasolineCapacity() * (super.cylinderCapacity/75));

	}

	/**
	 * Method used to calculate the sale price of the Motorcycle
	 */
	@Override
	public void sellPrice(int discount, double extraD){

		if(soat.getYear()!=Control.ACTUAL_YEAR && revision.getYear()!=Control.ACTUAL_YEAR){
			super.salePrice+= super.salePrice+500000;
		}

		super.salePrice+= basePrice + (basePrice*(4/100));

		if(type==VehicleType.USED){
			super.salePrice+= super.salePrice-(super.salePrice*(2/100));
		}
		if(discount==1){
			super.salePrice+= super.salePrice-(basePrice*(extraD/100));
		}
	}

	/**
	 * Method used to show the information of a Motorcycle
	 * @return Motorcycle
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
		"Gasoline Capacity: " + getGasolineCapacity() + "\n" +
		"Type of Motorcycle: " + getType2() + "\n" +
		"Gasoline Consume: " + consumeGasoline() + "\n" +
		"Sell Price: " + super.salePrice + "\n";

    }
}