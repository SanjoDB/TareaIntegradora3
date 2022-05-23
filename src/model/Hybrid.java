package model;

public class Hybrid extends Automobile{

	/** 
	 * tankCapacity double, is use to store the capacity of the tank of the Hybrid automobile
	 */
    private double tankCapacity;

	/** 
	 * typeGasoline GasolineType, is use to store the type of gasoline the automobile uses
	 */
    private GasolineType typeGasoline;

	/** 
	 * tankCapacity double, is use to store the duration of the battery of the Hybrid automobile
	 */
    private double batteryDuration;

	/** 
	 * typeGasoline GasolineType, is use to store the type of charger the automobile uses
	 */
    private ChargerType typeCharger;

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
	 * @param batteryDuration
	 * @param typeCharger
	 */
    public Hybrid(double basePrice, double salePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard, int numDoor, boolean polarized, int type1, double tankCapacity, int typeGasoline, double batteryDuration, int typeCharger){

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

		this.batteryDuration=batteryDuration;

        switch(typeCharger){

			case 1:
				this.typeCharger = ChargerType.FAST;
			break;

			case 2:
				this.typeCharger = ChargerType.NORMAL;
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

	public double getBatteryDuration(){
		
		return batteryDuration;
		
	}

	public void setBatteryDuration(double batteryDuration){
		
		this.batteryDuration= batteryDuration;
		
	}

    public ChargerType getTypeCharger(){
		
		return typeCharger;
		
	}

	public void setTypeCharger(ChargerType typeCharger){
		
		this.typeCharger= typeCharger;
		
	}

	/**
	 * Method used to calculate the consume of gasoline of the Automobile
	 */
    public double consumeGasoline(){

		return (getTankCapacity() * (super.cylinderCapacity/180));

	}

	/**
	 * Method used to calculate the consume of battery of the Automobile
	 */
    public double consumeBattery(){
		double str=0;

		if(typeCharger==ChargerType.FAST){
			str= (getBatteryDuration()*(super.cylinderCapacity/200));
		} else if(typeCharger==ChargerType.NORMAL){
			str= ((getBatteryDuration()+7)*(super.cylinderCapacity/100));
		}

		return str;

	}

	/**
	 * Method used to calculate the sale price of the Hybrid Automobile
	 */
	@Override
	public void sellPrice(int discount, double extraD){

		if(soat.getYear()!=Control.ACTUAL_YEAR && revision.getYear()!=Control.ACTUAL_YEAR){
			super.salePrice+= super.salePrice+500000;
		}

		super.salePrice+= basePrice + (basePrice*(15/100));

		if(type==VehicleType.USED){
			super.salePrice+= super.salePrice-(super.salePrice*(10/100));
		}
		if(discount==1){
			super.salePrice+= super.salePrice-(basePrice*(extraD/100));
		}
	}

	/**
	 * Method used to show the information of a Hybrid Automobile
	 * @return Hybrid Automobile
	 */
    public String toString(){

        return "Hybrid Automobile: \n" +
		"Base Price: " + super.basePrice + "\n" +
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
        "Battery Duration: " + getBatteryDuration() + "\n" +
        "Type of Charger: " + getTypeCharger() + "\n" +
        "Battery Consume: " + consumeBattery() + "\n" +
		"Sell Price: " + super.salePrice + "\n";

    }
    
}