package model;

public class Gasoline extends Automobile implements GasolineConsume{

    private double tankCapacity;
    private GasolineType typeGasoline;

    public Gasoline(double basePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard, int numDoor, boolean polarized, int type1, double tankCapacity, int typeGasoline){

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

	public double consumeGasoline(){

		return (getTankCapacity() * (super.cylinderCapacity/150));

	}

	@Override
	public double sellPrice(int discount, double extraD){

		double str=0;

		if(soat.getYear()!=Control.ACTUAL_YEAR && revision.getYear()!=Control.ACTUAL_YEAR){
			str+= str+500000;
		}

		str+= basePrice;

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
		"Sell Price: " + sellPrice(discount, extraD) + "\n";

    }
}