package model;

import java.util.ArrayList;

import java.util.Collections;

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
	 * Matrix of vechicles representing the parking lot
	 */
    private Vehicle[][] pvehicles= new Vehicle[10][5];;

    /** 
	 * Constructor of the class, receive no parameters
	 */
    public Control(){

        vehicles = new ArrayList<Vehicle>();

    }

    /**
	 * Method used to verify if there is any vehicle in the array
	 * @return flag boolean, true if there is any else false
	 */
    public boolean hasVehicle(){

        boolean flag=false;

        for(int i=0; i<vehicles.size() && !flag; i++){
            if(vehicles.get(i)!=null){
                flag=true;
            }
        }

        return flag;
    }

    /**
	 * Method used to verify if there is any vehicle in the parking lot
	 * @return flag boolean, true if there is any else false
	 */
    public boolean hasVehiclePark(){

        boolean flag=false;

        for(int i=0; i<vehicles.size() && !flag; i++){
            if(vehicles.get(i)!=null && vehicles.get(i).getModel()<2015){
                flag=true;
            }
        }

        return flag;
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
        Vehicle aux=new Gasoline(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1, tankCapacity, typeGasoline);
        if(parking(model, aux)){

            vehicles.add(aux);
            out="The gas automobile was added";

        } else{

            out="The parking is full so the automobile cant be added";

        }

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
        Vehicle aux=new Electric(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1, batteryDuration, typeCharger);
        if(parking(model, aux)){

            vehicles.add(aux);
            out="The electric automobile was added";

        } else{

            out="The parking is full";

        }

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
        Vehicle aux=new Hybrid(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1, tankCapacity, typeGasoline, batteryDuration, typeCharger);
        if(parking(model, aux)){

            vehicles.add(aux);
            out="The Hybrid automobile was added";

        } else{

            out="The parking is full";

        }

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
	 * Method used to verify if there is any vehicle with that badge
     * @param badge String, badge of the vehicle searched
	 * @return flag boolean, true if there is a vehicle with that badge else false
	 */
    public boolean findBadge(String badge){

        boolean flag=false;

		for(int i=0; i<vehicles.size() && !flag; i++){
            if(badge.equals(vehicles.get(i).getBadge())){
                flag=true;
            }
        }

        return flag;
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
                        out+= vehicles.get(i).toString() + "\n";
                    }
                } else if(typeA==2){
                    if(vehicles.get(i) instanceof Electric){
                        out+= vehicles.get(i).toString() + "\n";
                    }
                } else if(typeA==3){
                    if(vehicles.get(i) instanceof Hybrid){
                        out+= vehicles.get(i).toString() + "\n";
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
                    out+= vehicles.get(i).toString() + "\n";
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
                    out+= vehicles.get(i).toString() + "\n";
                }
                if(vehicles.get(i) instanceof Gasoline){
                    out+= vehicles.get(i).toString() + "\n";
                }
                if(vehicles.get(i) instanceof Hybrid){
                    out+= vehicles.get(i).toString() + "\n";
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
                    out+= vehicles.get(i).toString() + "\n";
                }
                if(vehicles.get(i) instanceof Hybrid){
                    out+= vehicles.get(i).toString() + "\n";
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
                    out+= vehicles.get(i).toString() + "\n";
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
                    out+= vehicles.get(i).toString() + "\n";
                }
            }
        }

        return out;
    }

    /**
	 * Method used to show the list of Documents of an specific vehicle
     * @param badge String, identifier of the vehicle needed
	 * @return out String, list of the documents
	 */
    public String showDocs(String badge){

        String out="";

		for(int i=0; i<vehicles.size(); i++){
            if(badge.equals(vehicles.get(i).getBadge())){
                out = "Soat: \n" + vehicles.get(i).getSoat() + "\n" +
                "Revision: \n" + vehicles.get(i).getRevision() + "\n" +
                "Porperty Card: \n" + vehicles.get(i).getPropertyCard() + "\n";
            }
        }

        return out;
	}

    /**
	 * Method used to add a vehicle to the parking lot
     * @param model int, model of the vehicle
     * @param aux Vehicle, vehicle added to the parking lot
	 * @return out boolean, true if it was added else false
	 */
    public boolean parking(int model, Vehicle aux){

        boolean out=false;

            if(model==2014){
                out= roundHelper(0,aux);
            } else if(model==2013){
                out= roundHelper(1,aux);
            } else if(model==2012){
                out= roundHelper(2,aux);
            } else if(model==2011){
                out= roundHelper(3,aux);
            } else if(model<2011){
                out= roundHelper(4,aux);
            } else if(model>2014){
                out= true;
            }
        

        return out;
    }

    /**
	 * Method used to verify if there is space to add a vehicle to the parking lot
	 * @return flag boolean, true if there is space else false
	 */
    public boolean roundHelper(int col, Vehicle vehicle){
        
        boolean flag=false;
   
            for(int m=0; m<pvehicles.length && !flag;m++){
                if(pvehicles[m][col]==null){
                    pvehicles[m][col]= vehicle;
                    flag=true;
                }
            }
        

        return flag;
    }

    /**
	 * Method used to show the map of the parking lot
	 * @return out String, map of the parking lot
	 */
    public String showParkingLot(){

        int rows= pvehicles.length;
        int columns= pvehicles[0].length;
	
		String out="";
		String separator = "+---+ ";
		String line = "" + String.join("", Collections.nCopies(columns, separator));
		
		
		String numbers ="";
		int count =0;
		for(int i=0 ;i<rows ; i++) {
			numbers ="";
			for(int j=0 ;j<columns ; j++) {
				count++;
				Vehicle actual = pvehicles[i][j];
				
				if (pvehicles[i][j]==null) {
					
					numbers += "  0  " + " ";
					
				}else {

					numbers += "  1  " + " ";

				}
			}
			out+= line + "\n";
			out+= numbers + "\n";
			
			
		}
		out+= line + "\n";
		return out;
    }

    /**
	 * Method used to show a list of vehicles in a specific range of time
     * @param year1 int, first year of the range
     * @param year2 int, second year of the range
	 * @return out String, list of vehicles
	 */
    public String showVehicleYear(int year1, int year2){

        String out="";

        for(int i=0;i<pvehicles.length;i++){
            for(int j=0;j<pvehicles[0].length;j++){
                if(pvehicles[i][j]!=null){
                    if(year1>year2){
                        if(pvehicles[i][j].getModel()<=year1 && pvehicles[i][j].getModel()>=year2){
                            out+= pvehicles[i][j] + "\n";
                        }
                    } else if(year2>year1){
                        if(pvehicles[i][j].getModel()>=year1 && pvehicles[i][j].getModel()<=year2){
                            out+= pvehicles[i][j] + "\n";
                        }
                    }   
                }
            }
        }

        return out;
    }

    /**
	 * Method used to show the oldest vehicle/s
	 * @return out String, list of vehicle/s
	 */
    public String showVehicleOld(){

        String out="";
        int year=10000;

        for(int i=0;i<pvehicles.length;i++){
            for(int j=0;j<pvehicles[0].length;j++){
                if(pvehicles[i][j]!=null){
                    if(pvehicles[i][j].getModel()==year){
                        out+= pvehicles[i][j].toString() + "\n";
                    } else if(pvehicles[i][j].getModel()<year){
                        year=pvehicles[i][j].getModel();
                        out= pvehicles[i][j].toString() + "\n";
                    }
                }
            }
        }

        return out;
    }

    /**
	 * Method used to show the newest vehicle/s
	 * @return out String, list of vehicle/s
	 */
    public String showVehicleNew(){

        String out="";
        int year=0;

        for(int i=0;i<pvehicles.length;i++){
            for(int j=0;j<pvehicles[0].length;j++){
                if(pvehicles[i][j]!=null){
                    if(pvehicles[i][j].getModel()==year){
                        out+= pvehicles[i][j].toString() + "\n";
                    } else if(pvehicles[i][j].getModel()>year){
                        year=pvehicles[i][j].getModel();
                        out= pvehicles[i][j].toString() + "\n";
                    }
                }
            }
        }

        return out;
    }

    /**
	 * Method used to show the occupancy rate of the parking lot
	 * @return percentage double, occupancy rate
	 */
    public double showParkingPercentage(){

        double counter=0;

        for(int i=0;i<pvehicles.length;i++){
            for(int j=0;j<pvehicles[0].length;j++){
                if(pvehicles[i][j]!=null){
                    counter++;
                }
            }
        }

        double percentage=(counter/50)*100;

        return percentage;
    }
}