package model;

public class Motorcycle extends Vehicle{

    private double gasolineCapacity;
    private MotorcycleType type2;

    public Motorcycle(double basePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard, double gasolineCapacity, int type2){

		super(basePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard);
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

	public double consumeGasoline(){

		return (getGasolineCapacity() * (super.cylinderCapacity/75));

	}

	@Override
	public double sellPrice(int discount, double extraD){

		double str=0;
		if(soat.getYear()!=Control.ACTUAL_YEAR && revision.getYear()!=Control.ACTUAL_YEAR){
			str+= str+500000;
		}

		str+= basePrice + (basePrice*(4/100));

		if(type==VehicleType.USED){
			str+= str-(str*(2/100));
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
		"Gasoline Capacity: " + getGasolineCapacity() + "\n" +
		"Type of Motorcycle: " + getType2() + "\n" +
		"Gasoline Consume: " + consumeGasoline() + "\n" +
		"Sell Price: " + sellPrice(discount, extraD) + "\n";

    }
}