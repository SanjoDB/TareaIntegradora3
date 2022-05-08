package model;

import java.util.ArrayList;

public class Control{

    /** 
	 * ACTUAL_YEAR int, is used to represent the current year
	 */
    public static final int ACTUAL_YEAR=2022;

    /** 
	 * Vehicle array is use to store all the vehicles of the programm
	 */
    private ArrayList<Vehicle> vehicles;

    /** 
	 * Constructor of the class, receive no parameters
	 */
    public Control(){

        vehicles = new ArrayList<Vehicle>();

        //Las mtos y carros son vehiculos, crar una clase vehiculos desde donde se heredan motos y carros
    }

    /**
	 * Method used to add a Gasoline automobile to the array
	 * @param basePrice double, the basic price of the automobile fuel by gas
     * @param salePrice double, the sale price of the automobile fuel by gas
	 * @param brand String, the brand of the gas automobile
	 * @param model int, the year of released of this type of gas automobile
	 * @param cylinderCapacity double, the capacity of the cylinders of the gas automobile
	 * @param mileage double, the kilometers the gas automobile has path
	 * @param badge String, the unique identifier of the gas automobile
     * @param type int, it states if it is new or used
     * @param soat Document, the Soat documentation of the gas automobile
     * @param revision Document, the mechanical revision documentation of the gas automobile
     * @param propertyCard Document, the documentation that states the owner of the gas automobile
     * @param numDoor int, the number of doors of the gas automobile
     * @param polarized boolean, it states if the windows are polarized or not
     * @param type1 int, the type of automobile it is
     * @param tankCapacity double, the capacity the tank of gasoline the automobile has
     * @param typeGasoline int, type of gasoline the automobile uses
	 * @return out String, Gasoline automobile added
	 */
    public String addGasoline(double basePrice, double salePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard, int numDoor, boolean polarized, int type1, double tankCapacity, int typeGasoline){

        String out="";
        vehicles.add(new Gasoline(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1, tankCapacity, typeGasoline));
        out="The gas automobile was added";

        return out;
    }

    /**
	 * Method used to add a Electric automobile to the array
	 * @param basePrice double, the basic price of the automobile fuel by Electricity
     * @param salePrice double, the sale price of the automobile fuel by Electricity
	 * @param brand  String, the brand of the Electricity automobile
	 * @param model int, the year of released of this type of Electricity automobile
	 * @param cylinderCapacity double, the capacity of the cylinders of the Electricity automobile
	 * @param mileage double, the kilometers the Electricity automobile has path
	 * @param badge String, the unique identifier of the Electricity automobile
     * @param type int, it states if it is new or used
     * @param soat Document, the Soat documentation of the Electricity automobile
     * @param revision Document, the mechanical revision documentation of the Electricity automobile
     * @param propertyCard Document, the documentation that states the owner of the Electricity automobile
     * @param numDoor int, the number of doors of the Electricity automobile
     * @param polarized boolean, it states if the windows are polarized or not
     * @param type1 int, the type of automobile it is
     * @param batteryDuration double, the duration of the battery of the automobile
     * @param typeCharger int, type of the charger of the automobile
	 * @return out String, Electric automobile added
	 */
    public String addElectric(double basePrice, double salePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard, int numDoor, boolean polarized, int type1, double batteryDuration, int typeCharger){

        String out="";
        vehicles.add(new Electric(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1, batteryDuration, typeCharger));
        out="The electric automobile was added";

        return out;
    }

    /**
	 * Method used to add a Hybrid automobile to the array
	 * @param basePrice double, the basic price of the automobile
     * @param salePrice double, the sale price of the automobile
	 * @param brand  String, the brand of the automobile
	 * @param model int, the year of released of this type of automobile
	 * @param cylinderCapacity double, the capacity of the cylinders of the automobile
	 * @param mileage double, the kilometers the automobile has path
	 * @param badge String, the unique identifier of the automobile
     * @param type int, it states if it is new or used
     * @param soat Document, the Soat documentation of the automobile
     * @param revision Document, the mechanical revision documentation of the automobile
     * @param propertyCard Document, the documentation that states the owner of the automobile
     * @param numDoor int, the number of doors of the automobile
     * @param polarized boolean, it states if the windows are polarized or not
     * @param type1 int, the type of automobile it is
     * @param tankCapacity double, the capacity the tank of gasoline the automobile has
     * @param typeGasoline int, type of gasoline the automobile uses
     * @param batteryDuration double, the duration of the battery of the automobile
     * @param typeCharger int, type of the charger of the automobile
	 * @return out String, Hybrid automobile added
	 */
    public String addHybrid(double basePrice, double salePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard, int numDoor, boolean polarized, int type1, double tankCapacity, int typeGasoline, double batteryDuration, int typeCharger){

        String out="";
        vehicles.add(new Hybrid(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1, tankCapacity, typeGasoline, batteryDuration, typeCharger));
        out="The Hybrid automobile was added";

        return out;
    }

    /**
	 * Method used to add a motorcycle to the array
	 * @param basePrice double, the basic price of the motorcycle
     * @param salePrice double, the sale price of the motorcycle
	 * @param brand  String, the brand of the motorcycle
	 * @param model int, the year of released of this type of the motorcycle
	 * @param cylinderCapacity double, the capacity of the cylinders of the motorcycle
	 * @param mileage double, the kilometers the motorcycle has path
	 * @param badge String, the unique identifier of the motorcycle
     * @param type int, it states if it is new or used
     * @param soat Document, the Soat documentation of the motorcycle
     * @param revision Document, the mechanical revision documentation of the motorcycle
     * @param propertyCard Document, the documentation that states the owner of the motorcycle
     * @param gasolineCapacity double, the capacity the tank of gasoline the motorcycle has
     * @param type2 int, the type of motorcycle it is
	 * @return out String, motorcycle added
	 */
    public String addMotorcycle(double basePrice, double salePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard, double gasolineCapacity, int type2){

        String out="";
        vehicles.add(new Motorcycle(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, gasolineCapacity, type2));
        out="The motorcycle with id " + badge + "was added";

        return out;
    }

    /**
	 * Method used to calculate the final sale price of a vehicle
	 * @param badge String, badge of the vehicle searched
     * @param discount int, it states if the vehicle gets an extra discount or not
     * @param extraD double, the amount of the extra discount
	 */
    public void calculateSalePrice(String badge, int discount, double extraD){

		for(int i=0; i<vehicles.size(); i++){
            if(badge.equals(vehicles.get(i).getBadge())){
                vehicles.get(i).sellPrice(discount, extraD);
            }
        }
	}

    /**
	 * Method used to show the list of automobiles of a certain type
	 * @param typeA int, type of the automobile needed
	 * @return out String, list of vehicles
	 */
    public String showAutomobiles(int typeA){
        String out="";

        for(int i=0; i<vehicles.size(); i++){
            if(vehicles.get(i)!=null){
                if(typeA==1){
                    if(vehicles.get(i) instanceof Gasoline){
                        out+= vehicles.get(i).toString();
                    }
                } else if(typeA==2){
                    if(vehicles.get(i) instanceof Electric){
                        out+= vehicles.get(i).toString();
                    }
                } else if(typeA==3){
                    if(vehicles.get(i) instanceof Hybrid){
                        out+= vehicles.get(i).toString();
                    }
                }
            }
        }

        return out;
    }

    /**
	 * Method used to show the list of motorcycles
	 * @return out String, list of motorcycles
	 */
    public String showMotorcycles(){
        String out="";

        for(int i=0; i<vehicles.size(); i++){
            if(vehicles.get(i)!=null){
                if(vehicles.get(i) instanceof Motorcycle){
                    out+= vehicles.get(i).toString();
                }
            }
        }

        return out;
    }

    /**
	 * Method used to show the list of gasoline based vehicles
	 * @return out String, list of vehicles
	 */
    public String showGasoline(){
        String out="";

        for(int i=0; i<vehicles.size(); i++){
            if(vehicles.get(i)!=null){
                if(vehicles.get(i) instanceof Motorcycle){
                    out+= vehicles.get(i).toString();
                }
                if(vehicles.get(i) instanceof Gasoline){
                    out+= vehicles.get(i).toString();
                }
                if(vehicles.get(i) instanceof Hybrid){
                    out+= vehicles.get(i).toString();
                }
            }
        }

        return out;
    }

    /**
	 * Method used to show the list of electric based vehicles
	 * @return out String, list of vehicles
	 */
    public String showElectric(){
        String out="";

        for(int i=0; i<vehicles.size(); i++){
            if(vehicles.get(i)!=null){
                if(vehicles.get(i) instanceof Electric){
                    out+= vehicles.get(i).toString();
                }
                if(vehicles.get(i) instanceof Hybrid){
                    out+= vehicles.get(i).toString();
                }
            }
        }

        return out;
    }

    /**
	 * Method used to show the list of new vehicles
	 * @return out String, list of vehicles
	 */
    public String showNew(){
        String out="";

        for(int i=0; i<vehicles.size(); i++){
            if(vehicles.get(i)!=null){
                if(vehicles.get(i).getType().equals(VehicleType.NEW)){
                    out+= vehicles.get(i).toString();
                }
            }
        }

        return out;
    }

    /**
	 * Method used to show the list of used vehicles
	 * @return out String, list of vehicles
	 */
    public String showUsed(){
        String out="";

        for(int i=0; i<vehicles.size(); i++){
            if(vehicles.get(i)!=null){
                if(vehicles.get(i).getType().equals(VehicleType.USED)){
                    out+= vehicles.get(i).toString();
                }
            }
        }

        return out;
    }
}