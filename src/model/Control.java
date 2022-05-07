package model;

import java.util.ArrayList;

public class Control{

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
	 * @param basePrice String, name of the wetland registered
	 * @param brand String, type of the wetland (Public or Private) registered
	 * @param model String, url of the wetland registered
	 * @param cylinderCapacity double, area of the wetland registered
	 * @param mileage String, if the area is protected or not
	 * @param badge Zone, type of the zone and its ubication registered
     * @param type Zone, type of the zone and its ubication registered
     * @param soat Zone, type of the zone and its ubication registered
     * @param revision Zone, type of the zone and its ubication registered
     * @param propertyCard Zone, type of the zone and its ubication registered
     * @param numDoor Zone, type of the zone and its ubication registered
     * @param polarized Zone, type of the zone and its ubication registered
     * @param type1 Zone, type of the zone and its ubication registered
     * @param tankCapacity Zone, type of the zone and its ubication registered
     * @param typeGasoline Zone, type of the zone and its ubication registered
	 * @return out String, Gasoline automobile added
	 */
    public String addGasoline(double basePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard, int numDoor, boolean polarized, int type1, double tankCapacity, int typeGasoline){

        String out="";
        vehicles.add(new Gasoline(basePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1, tankCapacity, typeGasoline));
        out="The gas automobile was added";

        return out;
    }

    /**
	 * Method used to add a Electric automobile to the array
	 * @param basePrice String, name of the wetland registered
	 * @param brand String, type of the wetland (Public or Private) registered
	 * @param model String, url of the wetland registered
	 * @param cylinderCapacity double, area of the wetland registered
	 * @param mileage String, if the area is protected or not
	 * @param badge Zone, type of the zone and its ubication registered
     * @param type Zone, type of the zone and its ubication registered
     * @param soat Zone, type of the zone and its ubication registered
     * @param revision Zone, type of the zone and its ubication registered
     * @param propertyCard Zone, type of the zone and its ubication registered
     * @param numDoor Zone, type of the zone and its ubication registered
     * @param polarized Zone, type of the zone and its ubication registered
     * @param type1 Zone, type of the zone and its ubication registered
     * @param batteryDuration Zone, type of the zone and its ubication registered
     * @param typeCharger Zone, type of the zone and its ubication registered
	 * @return out String, Electric automobile added
	 */
    public String addElectric(double basePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard, int numDoor, boolean polarized, int type1, double batteryDuration, int typeCharger){

        String out="";
        vehicles.add(new Electric(basePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1, batteryDuration, typeCharger));
        out="The electric automobile was added";

        return out;
    }

    /**
	 * Method used to add a Hybrid automobile to the array
	 * @param basePrice String, name of the wetland registered
	 * @param brand String, type of the wetland (Public or Private) registered
	 * @param model String, url of the wetland registered
	 * @param cylinderCapacity double, area of the wetland registered
	 * @param mileage String, if the area is protected or not
	 * @param badge Zone, type of the zone and its ubication registered
     * @param type Zone, type of the zone and its ubication registered
     * @param soat Zone, type of the zone and its ubication registered
     * @param revision Zone, type of the zone and its ubication registered
     * @param propertyCard Zone, type of the zone and its ubication registered
     * @param numDoor Zone, type of the zone and its ubication registered
     * @param polarized Zone, type of the zone and its ubication registered
     * @param type1 Zone, type of the zone and its ubication registered
     * @param tankCapacity Zone, type of the zone and its ubication registered
     * @param typeGasoline Zone, type of the zone and its ubication registered
     * @param batteryDuration Zone, type of the zone and its ubication registered
     * @param typeCharger Zone, type of the zone and its ubication registered
	 * @return out String, Hybrid automobile added
	 */
    public String addHybrid(double basePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard, int numDoor, boolean polarized, int type1, double tankCapacity, int typeGasoline, double batteryDuration, int typeCharger){

        String out="";
        vehicles.add(new Hybrid(basePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1, tankCapacity, typeGasoline, batteryDuration, typeCharger));
        out="The Hybrid automobile was added";

        return out;
    }

    /**
	 * Method used to add a motorcycle to the array
	 * @param basePrice String, name of the wetland registered
	 * @param brand String, type of the wetland (Public or Private) registered
	 * @param model String, url of the wetland registered
	 * @param cylinderCapacity double, area of the wetland registered
	 * @param mileage String, if the area is protected or not
	 * @param badge Zone, type of the zone and its ubication registered
     * @param type Zone, type of the zone and its ubication registered
     * @param soat Zone, type of the zone and its ubication registered
     * @param revision Zone, type of the zone and its ubication registered
     * @param propertyCard Zone, type of the zone and its ubication registered
     * @param gasolineCapacity Zone, type of the zone and its ubication registered
     * @param type2 Zone, type of the zone and its ubication registered
	 * @return out String, motorcycle added
	 */
    public String addMotorcycle(double basePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard, double gasolineCapacity, int type2){

        String out="";
        vehicles.add(new Motorcycle(basePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, gasolineCapacity, type2));
        out="The motorcycle with id " + badge + "was added";

        return out;
    }

    /**
	 * Method used to calculate the final sale price of a vehicle
	 * @param badge String, badge of the vehicle searched
	 * @return str double, price calculated
	 */
    public double calculateSalePrice(String badge, int discount, double extraD){
       double str=0;

		for(int i=0; i<vehicles.size(); i++){
            if(badge.equals(vehicles.get(i).getBadge())){
                str=vehicles.get(i).sellPrice(discount, extraD);
            }
        }

        return str;
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
	 * @return out String, list of vehicles
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