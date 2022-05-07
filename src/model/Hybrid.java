package model;

public class Hybrid extends Automobile{

	//colocar los de ambas
	private double tankCapacity;
	private GasolineType typeGasoline;
	private double batteryDuration;
	private ChargerType typeCharger;

    public Hybrid(double basePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard, int numDoor, boolean polarized, int type1, double tankCapacity, int typeGasoline, double batteryDuration, int typeCharger){

        super(basePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1);

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

    public double consumeGasoline(){

		return (getTankCapacity() * (super.cylinderCapacity/180));

	}

    public double consumeBattery(){
		double str=0;

		if(typeCharger==ChargerType.FAST){
			str= (getBatteryDuration()*(super.cylinderCapacity/200));
		} else if(typeCharger==ChargerType.NORMAL){
			str= ((getBatteryDuration()+7)*(super.cylinderCapacity/100));
		}

		return str;

	}

	@Override
	public double sellPrice(int discount, double extraD){

		double str=0;

		if(soat.getYear()!=Control.ACTUAL_YEAR && revision.getYear()!=Control.ACTUAL_YEAR){
			str+= str+500000;
		}

		str+= basePrice + (basePrice*(15/100));

		if(type==VehicleType.USED){
			str+= str-(str*(10/100));
		}
		if(discount==1){
			str+= str-(basePrice*(extraD/100));
		}

		return str;
	}

    public String toString(int discount, double extraD){

        return "Base Price: " + super.basePrice + "\n" +
        "Brand: " + super.brand + "\n" +
		"Model: " + super.model + "\n" +
		"Cylinder Capacity: " + super.cylinderCapacity + "\n" +
		"Mileage: " + super.mileage + "\n" +
		"Badge: " + super.badge + "\n" +
		"Type of Vehicle: " + super.type + "\n" +
		"SOAT: " + super.soat + "\n" +
		"Mechanicle revision: " + super.revision + "\n" +
		"Property Card: " + super.propertyCard + "\n" +
		"Number of Doors: " + super.numDoor + "\n" +
		"Is it Polarized: " + super.polarized + "\n" +
		"Type of Automobile: " + super.type1 + "\n" +
		"Tank Capacity: " + getTankCapacity() + "\n" +
		"Type of gas: " + getTypeGasoline() + "\n" +
		"Gasoline Consume: " + consumeGasoline() + "\n" +
        "Battery Duration: " + getBatteryDuration() + "\n" +
        "Type of Charger: " + getTypeCharger() + "\n" +
        "Battery Consume: " + consumeBattery() + "\n" +
		"Sell Price: " + sellPrice(discount, extraD) + "\n";

    }
    
}