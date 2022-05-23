package ui;

import java.util.Scanner;

import model.Control;
import model.Document;
import model.Soat;
import model.Revision;

public class TareaIntegradora3{

    /**
	 * Asociation with the class Control
	 */
    private Control control;

    /**
	 * Asociation with the object Scanner
	 */
    private Scanner sc;

    /**
	 * Constructor of the class, do not recieve parameters.  
	 * Initialize the lector
	 * Initilize the values of the app
	 */
    public TareaIntegradora3() {
		sc= new Scanner(System.in);
		control = new Control();
	}

    /**
	 * Main method
	 */
    public static void main(String [] args) {
		
		System.out.println("Initialicing the app");
		
		TareaIntegradora3 obPpal= new TareaIntegradora3();
		
		int option=0;
		
		do{
			option= obPpal.showMenu();
			obPpal.executeOperation(option);
			
		}while (option!=0);
		
	}

    /**
	 * Method that shows the menu of the app, miss the validation of the typed value
	 * @return option int, the option type by the user
	 */
    public int showMenu() {
		int option=0;

		System.out.println(
				"Select one of the options\n" +
				"(1) Register a Vehicle\n" +
				"(2) Calculate the price of Sale\n"+
				"(3) Generate reports based on a certain criteria \n"+ //En esta parte es dar la opcion de filtrar con alguno de los tres parametros, Luego cada uno tiene su sub parametro, tipo de vehiculo: seria automobil y moto, tipo de combustible: seria gasolina y electrica y la ultima ya es obvio
                "(4) Show the documents of a vehicle\n"+
                "(5) Show the parking lot\n"+
                "(6) Generate reports of the parking lot\n"+
				"(0) End"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}

    /**
	 * Method incharge to call the methods that solve every requirement of the aplication 
	 * @param operation int, is the number type by the user 
	 */
    public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			registerVehicle();
			break;
		case 2:
			calculateSellPrice();
			break;
	
		case 3:
			showVehicle();
			break;
        
        case 4:
			showDocument();
			break;

        case 5:
			showParking();
			break;

        case 6:
			showParkingVehicles();
			break;

		default:
			System.out.println("Error, the option is not valid");
		
		}
	}

    /**
	 * Method incharge to add a vehicle to the array 
	 */
    public void registerVehicle(){

        double basePrice=0;
        double salePrice=0;
        String brand="";
        int model=0;
        double cylinderCapacity=0;
        double mileage=0;
        String badge="";
        int type=0;
        int typeRe=0;
        int yearR=0;
        double priceR=0;
        int yearS=0;
        double priceS=0;
        double soatMoney=0;
        double reviGas=0;
        int yearP=0;
        double priceP=0;
        String code="";
        Soat soat=null;
        Revision revision=null;
        Document propertyCard=null;
        int typeV=0;
        int numDoor=0;
        int inPolarized=0;
        boolean polarized=false;
        int type1=0;
        int typeA=0;
        double tankCapacity=0;
        int typeGasoline=0;
        double batteryDuration=0;
        int typeCharger=0;
        double gasolineCapacity=0;
        int type2=0;
        boolean flag=false;
        boolean flag2=false;
        boolean flag3=false;
        boolean flagf=false;

        System.out.println("Type the base price of the vehicle");
        basePrice=sc.nextDouble();
        sc.nextLine();

        System.out.println("Type the brand of the vehicle");
        brand= sc.nextLine();

        System.out.println("Type the model of the vehicle");
        model= sc.nextInt();
        sc.nextLine();

        System.out.println("Type the cylinder capacity of the vehicle");
        cylinderCapacity= sc.nextDouble();
        sc.nextLine();

        System.out.println("Type the mileage of the vehicle");
        mileage= sc.nextDouble();
        sc.nextLine();

        System.out.println("Type the badge of the vehicle");
        badge= sc.nextLine();

        System.out.println("Type one of the options referring the vehicle");
        System.out.println("Type \n 1 --> NEW \n 2 --> USED");
        flag=true;

        while(flag){

            type= Integer.parseInt(sc.nextLine());

            if(type==1){

                yearR=Control.ACTUAL_YEAR;
                priceR=0;

                System.out.println("Type the level of gas found on the mechanical Revision");
                reviGas= sc.nextDouble();
                sc.nextLine();

                revision = new Revision(priceR, yearR, code, reviGas);
                soat = new Soat(priceS, yearS, code, soatMoney);
                propertyCard = new Document(priceP, yearP, code);

                flag=false;

            } else if(type==2){
                
                System.out.println("Type the year of release of the SOAT");
                yearS= sc.nextInt();
                sc.nextLine();
            
                if(yearS<Control.ACTUAL_YEAR){
                    priceS=500000;
                }

                System.out.println("Type the amount of money the SOAT cover");
                soatMoney= sc.nextDouble();
                sc.nextLine();

                System.out.println("Does the car have a mechanical revision?");
                System.out.println("Type \n 1 --> YES \n 2 --> NO");
                flagf=true;

                while(flagf){

                    typeRe= Integer.parseInt(sc.nextLine());

                    if(typeRe==1){

                        System.out.println("Type the year of release of the mechanical revision");
                        yearR= sc.nextInt();
                        sc.nextLine();
            
                        if(yearR<Control.ACTUAL_YEAR){
                            priceR=500000;
                        }

                        System.out.println("Type the level of gas found on the mechanical Revision");
                        reviGas= sc.nextDouble();
                        sc.nextLine();

                        soat = new Soat(priceS, yearS, code, soatMoney);
                        revision = new Revision(priceR, yearR, code, reviGas);
                        propertyCard = new Document(priceP, yearP, code);

                        flagf=false;
                        flag=false;

                    } else if(typeRe==2){

                        soat = new Soat(priceS, yearS, code, soatMoney);
                        revision = new Revision(priceR, yearR, code, reviGas);
                        propertyCard = new Document(priceP, yearP, code);

                        flagf=false;
                        flag=false;

                    } else{

                        System.out.println("Please type one of the specified options");

                    }
                }

            }
            else{

				System.out.println("Please type one of the specified options");

			}
        }

        System.out.println("Write the type of the vehicle");
        System.out.println("Type \n 1 --> Automobile \n 2 --> Motorcycle");
        flag=true;

        while(flag){

            typeV= Integer.parseInt(sc.nextLine());

            if(typeV==1){
                System.out.println("Type the number of doors of the automobile");
                numDoor= sc.nextInt();
                sc.nextLine();

                System.out.println("Type if the automobile is polarized");
                System.out.println("Type \n 1 --> Yes \n 2 --> No");
                flag2=true;

                while(flag2){
                    
                    inPolarized= Integer.parseInt(sc.nextLine());

                    if(inPolarized==1){
                        polarized=true;
                        flag2=false;
                    } else if(inPolarized==2){
                        polarized=false;
                        flag2=false;
                    }
                    else{
				        System.out.println("Please type one of the specified options");
			        }
                }

                System.out.println("Write the type of the automobile");
                System.out.println("Type \n 1 --> SEDAN \n 2 --> VAN");
                flag2=true;

                while(flag2){
                    
                    type1= Integer.parseInt(sc.nextLine());

                    if(type1==1 || type1==2){
                        flag2=false;
                    }
                    else{
				        System.out.println("Please type one of the specified options");
			        }
                }

                System.out.println("Write the type of fuel the automobile use");
                System.out.println("Type \n 1 --> GASOLINE \n 2 --> ELECTRIC \n 3 --> HYBRID");
                flag2=true;

                while(flag2){
                    
                    typeA= Integer.parseInt(sc.nextLine());

                    if(typeA==1){
                        System.out.println("Type the capacity of the tank of the automobile");
                        tankCapacity= sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Write the type of gas the automobile use");
                        System.out.println("Type \n 1 --> EXTRA \n 2 --> ORDINARY \n 3 --> DIESEL");
                        flag3=true;

                        while(flag3){

                            typeGasoline= Integer.parseInt(sc.nextLine());

                            if(typeGasoline==1 || typeGasoline==2 || typeGasoline==3){

                                System.out.println(control.addGasoline(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1, tankCapacity, typeGasoline));

                                flag3=false;
                                flag2=false;
                                flag=false;

                            }
                            else{

                                System.out.println("Please type one of the specified options");

                            }
                        }

                    } else if(typeA==2){
                        System.out.println("Type the duration of the battery of the automobile");
                        batteryDuration= sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Write the type of charger the automobile have");
                        System.out.println("Type \n 1 --> FAST \n 2 --> NORMAL");
                        flag3=true;

                        while(flag3){

                            typeCharger= Integer.parseInt(sc.nextLine());

                            if(typeCharger==1 || typeCharger==2){

                                System.out.println(control.addElectric(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1, batteryDuration, typeCharger));
                                
                                flag3=false;
                                flag2=false;
                                flag=false;

                            }
                            else{

                                System.out.println("Please type one of the specified options");

                            }
                        }

                    } else if(typeA==3){
                        System.out.println("Type the capacity of the tank of the automobile");
                        tankCapacity= sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Write the type of gas the automobile use");
                        System.out.println("Type \n 1 --> EXTRA \n 2 --> ORDINARY \n 3 --> DIESEL");
                        flag3=true;

                        while(flag3){

                            typeGasoline= Integer.parseInt(sc.nextLine());

                            if(typeGasoline==1 || typeGasoline==2 || typeGasoline==3){

                                flag3=false;

                            }
                            else{

                                System.out.println("Please type one of the specified options");

                            }
                        }

                        System.out.println("Type the duration of the battery of the automobile");
                        batteryDuration= sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Write the type of charger the automobile have");
                        System.out.println("Type \n 1 --> FAST \n 2 --> NORMAL");
                        flag3=true;

                        while(flag3){

                            typeCharger= Integer.parseInt(sc.nextLine());

                            if(typeCharger==1 || typeCharger==2){

                                System.out.println(control.addHybrid(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1, tankCapacity, typeGasoline, batteryDuration, typeCharger));
                                
                                flag3=false;
                                flag2=false;
                                flag=false;

                            }
                            else{

                                System.out.println("Please type one of the specified options");

                            }
                        }
                    }
                    else{
				        System.out.println("Please type one of the specified options");
			        }
                }

            } else if(typeV==2){
                System.out.println("Type the capacity of gasoline of the tank of the motrocycle");
                gasolineCapacity= sc.nextDouble();
                sc.nextLine();

                System.out.println("Write the type of the motorcycle");
                System.out.println("Type \n 1 --> STANDARD \n 2 --> SPORTS \n 3 --> SCOOTER \n 4 --> CROSS");
                flag2=true;

                while(flag2){

                    type2= Integer.parseInt(sc.nextLine());

                    if(type2==1 || type2==2 || type2==3 || type2==4){

                        control.addMotorcycle(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, gasolineCapacity, type2);

                        flag2=false;
                        flag=false;

                    }
                    else{

                        System.out.println("Please type one of the specified options");

                    }
                }
            }
            else{

				System.out.println("Please type one of the specified options");
                    
			}
        }
    }

    /**
	 * Method incharge to calculate the sale price of an specific vehicle 
	 */
    public void calculateSellPrice(){

        String badge="";
        int discount=0;
        double extraD=0;
        boolean flag=false;

        if(control.hasVehicle()){

            System.out.println("Type the badge of the vehicle you want to calculate the price of sale");
            badge= sc.nextLine();

            if(control.findBadge(badge)){

                System.out.println("Do you want to apply an extra discount for the vehicle?");
                System.out.println("Type \n 1 --> Yes \n 2 --> No");
                flag=true;

                while(flag){

                    discount= Integer.parseInt(sc.nextLine());

                    if(discount==1){
                        System.out.println("Type the amount of the extra discount you want to apply");
                        extraD= sc.nextDouble();
                        sc.nextLine();

                        control.calculateSalePrice(badge, discount, extraD);
                        flag=false;

                    } else if(discount==2){

                        control.calculateSalePrice(badge, discount, extraD);
                        flag=false;

                    }
                    else{

                        System.out.println("Please type one of the specified options");

                    }
                }

            }
            else{

                System.out.println("This badge has not been registered");

            }
        } else{

            System.out.println("There are not vehicles registered");

        }
    }

    /**
	 * Method incharge to show a list of vehicles given a certain criteria 
	 */
    public void showVehicle(){

        int typeR=0;
        int typeV=0;
        int typeA=0;
        int typeF=0;
        int type=0;
        boolean flag=false;
        boolean flag2=false;
        boolean flag3=false;

        if(control.hasVehicle()){

            System.out.println("Select one way to filter the reports");
            System.out.println("Type \n 1 --> TYPE OF VEHICLE \n 2 --> TYPE OF FUEL \n 3 --> USED/NEW VEHICLES");
            flag=true;

            while(flag){

                typeR= Integer.parseInt(sc.nextLine());

                if(typeR==1){
                    System.out.println("Select the type of vehicle you want to see the reports of");
                    System.out.println("Type \n 1 --> AUTOMOBILE \n 2 --> MOTORCYCLE");
                    flag2=true;

                    while(flag2){

                        typeV= Integer.parseInt(sc.nextLine());

                        if(typeV==1){
                            System.out.println("Select the type of automobile you want to see the reports of");
                            System.out.println("Type \n 1 --> GASOLINE \n 2 --> ELECTRIC \n 3 --> HYBRID");
                            flag3=true;

                            while(flag3){

                                typeA= Integer.parseInt(sc.nextLine());

                                if(typeA==1 || typeA==2 || typeA==3){

                                    System.out.println(control.showAutomobiles(typeA));
                                    flag3=false;
                                    flag2=false;
                                    flag=false;

                                }
                                else{

                                    System.out.println("Please type one of the specified options");

                                }
                            }
                        } else if(typeV==2){

                            System.out.println(control.showMotorcycles());
                            flag2=false;
                            flag=false;

                        }
                        else{

                            System.out.println("Please type one of the specified options");

                        }
                    }
                } else if(typeR==2){
                    System.out.println("Select the type of fuel you want to see the reports of");
                    System.out.println("Type \n 1 --> GASOLINE \n 2 --> ELECTRICITY");
                    flag2=true;

                    while(flag2){

                        typeF= Integer.parseInt(sc.nextLine());

                        if(typeF==1){

                            System.out.println(control.showGasoline());
                            flag2=false;
                            flag=false;

                        } else if(typeF==2){

                            System.out.println(control.showElectric());
                            flag2=false;
                            flag=false;

                        }
                        else{

                            System.out.println("Please type one of the specified options");

                        }
                    }
                } else if(typeR==3){
                    System.out.println("Select the type of Vehicle you want to see the reports of");
                    System.out.println("Type \n 1 --> NEW \n 2 --> USED");
                    flag2=true;

                    while(flag2){

                        type= Integer.parseInt(sc.nextLine());

                        if(type==1){

                            System.out.println(control.showNew());
                            flag2=false;
                            flag=false;

                        } else if(type==2){

                            System.out.println(control.showUsed());
                            flag2=false;
                            flag=false;

                        }
                        else{

                            System.out.println("Please type one of the specified options");

                        }
                    }
                }
                else{

                    System.out.println("Please type one of the specified options");

                }
            }
        } else{

            System.out.println("There are not vehicles registered");

        }
    }

    /**
	 * Method incharge to show the list of documents of an specific vehicle
	 */
    public void showDocument(){

        String badge="";
        boolean flag=true;

        if(control.hasVehicle()){
            while(flag){
            
                System.out.println("Type the vehicle's badge you want to show the documents of");
                badge= sc.nextLine();

                if(control.findBadge(badge)){

                    System.out.println(control.showDocs(badge));

                    flag=false;

                }
                else{

                    System.out.println("This badge has not been registered");

                }
            }
        } else{

            System.out.println("There are not vehicles registered");

        }
    }

    /**
	 * Method incharge to show the map of the parking lot
	 */
    public void showParking(){

        if(control.hasVehiclePark()){

            System.out.println("1 --> OCCUPIED \n0 --> EMPTY");

            System.out.println(control.showParkingLot());

        } else {

            System.out.println("There are not vehicles registered in the parking lot");

        }

    }

    /**
	 * Method incharge to show a list of vehicles or a percentage given a certain criteria 
	 */
    public void showParkingVehicles(){

        boolean flag=true;
        int type=0;
        int year1=0;
        int year2=0;

        if(control.hasVehiclePark()){

            System.out.println("Select one way to filter the reports");
            System.out.println("Type \n 1 --> LIST OF VEHICLES IN CERTAIN RANGE OF YEARS \n 2 --> DATA ON THE OLDEST AND NEWEST VEHICLE/S \n 3 --> OCCUPANCY RATE");
            flag=true;

            while(flag){

                type= Integer.parseInt(sc.nextLine());

                if(type==1){

                    System.out.println("Type the first year of the range");
                    year1= sc.nextInt();
                    sc.nextLine();

                    System.out.println("Type the second year of the range");
                    year2= sc.nextInt();
                    sc.nextLine();

                    System.out.println(control.showVehicleYear(year1, year2));
                    flag=false;

                } else if(type==2){

                    System.out.println("Newest Vehicle/s:");
                    System.out.println(control.showVehicleNew());

                    System.out.println("Oldest vehicle/s:");
                    System.out.println(control.showVehicleOld());
                    flag=false;

                } else if(type==3){

                    System.out.println("Parking occupancy rate:");
                    System.out.println(control.showParkingPercentage() + "%");
                    flag=false;

                } else{

                    System.out.println("Please type one of the specified options");

                }
            }

        } else{

            System.out.println("There are not vehicles registered in the parking lot");

        }
    }
}