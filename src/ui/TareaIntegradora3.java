package ui;

import java.util.Scanner;

import model.Control;
import model.Document;

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
        int type;
        int yearR=0;
        double priceR=0;
        int yearS=0;
        double priceS=0;
        int yearP=0;
        double priceP=0;
        Document soat=null;
        Document revision=null;
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
        type= sc.nextInt();
        sc.nextLine();

        if(type==1){
            yearR=Control.ACTUAL_YEAR;
            priceR=0;

            revision = new Document(priceR, yearR);
            soat = new Document(priceS, yearS);
            propertyCard = new Document(priceP, yearP);
        } else if(type==2){
            System.out.println("Type the year of release of the SOAT");
            yearS= sc.nextInt();
            sc.nextLine();
            
            if(yearS<Control.ACTUAL_YEAR){
                priceS=500000;
            }

            soat = new Document(priceS, yearS);
            revision = new Document(priceR, yearR);
            propertyCard = new Document(priceP, yearP);
            //El precio es si esta vencido o no 'para darle 500000'
        }

        System.out.println("Write the type of the vehicle");
        System.out.println("Type \n 1 --> Automobile \n 2 --> Motorcycle");
        typeV= sc.nextInt();
        sc.nextLine();

        if(typeV==1){
            System.out.println("Type the number of doors of the automobile");
            numDoor= sc.nextInt();
            sc.nextLine();

            System.out.println("Type if the automobile is polarized");
            System.out.println("Type \n 1 --> Yes \n 2 --> No");
            inPolarized= sc.nextInt();
            sc.nextLine();
            if(inPolarized==1){
                polarized=true;
            } else if(inPolarized==2){
                polarized=false;
            }

            System.out.println("Write the type of the automobile");
            System.out.println("Type \n 1 --> SEDAN \n 2 --> VAN");
            type1=sc.nextInt();
            sc.nextLine();

            System.out.println("Write the type of fuel the automobile use");
            System.out.println("Type \n 1 --> GASOLINE \n 2 --> ELECTRIC \n 3 --> HYBRID");
            typeA= sc.nextInt();
            sc.nextLine();

            if(typeA==1){
                System.out.println("Type the capacity of the tank of the automobile");
                tankCapacity= sc.nextDouble();
                sc.nextLine();

                System.out.println("Write the type of gas the automobile use");
                System.out.println("Type \n 1 --> EXTRA \n 2 --> ORDINARY \n 3 --> DIESEL");
                typeGasoline= sc.nextInt();
                sc.nextLine();

                control.addGasoline(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1, tankCapacity, typeGasoline);

            } else if(typeA==2){
                System.out.println("Type the duration of the battery of the automobile");
                batteryDuration= sc.nextDouble();
                sc.nextLine();

                System.out.println("Write the type of charger the automobile have");
                System.out.println("Type \n 1 --> FAST \n 2 --> NORMAL");
                typeCharger= sc.nextInt();
                sc.nextLine();

                control.addElectric(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1, batteryDuration, typeCharger);

            } else if(typeA==3){
                System.out.println("Type the capacity of the tank of the automobile");
                tankCapacity= sc.nextDouble();
                sc.nextLine();

                System.out.println("Write the type of gas the automobile use");
                System.out.println("Type \n 1 --> EXTRA \n 2 --> ORDINARY \n 3 --> DIESEL");
                typeGasoline= sc.nextInt();
                sc.nextLine();

                System.out.println("Type the duration of the battery of the automobile");
                batteryDuration= sc.nextDouble();
                sc.nextLine();

                System.out.println("Write the type of charger the automobile have");
                System.out.println("Type \n 1 --> FAST \n 2 --> NORMAL");
                typeCharger= sc.nextInt();
                sc.nextLine();

                control.addHybrid(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, numDoor, polarized, type1, tankCapacity, typeGasoline, batteryDuration, typeCharger);

            }

        } else if(typeV==2){
            System.out.println("Type the capacity of gasoline of the tank of the motrocycle");
            gasolineCapacity= sc.nextDouble();
            sc.nextLine();

            System.out.println("Write the type of the motorcycle");
            System.out.println("Type \n 1 --> STANDARD \n 2 --> SPORTS \n 3 --> SCOOTER \n 4 --> CROSS");
            type2= sc.nextInt();
            sc.nextLine();

            control.addMotorcycle(basePrice, salePrice, brand, model, cylinderCapacity, mileage, badge, type, soat, revision, propertyCard, gasolineCapacity, type2);
        }
    }

    public void calculateSellPrice(){

        String badge="";
        int discount=0;
        double extraD=0;
        
        System.out.println("Type the badge of the vehicle you want to calculate the price of sale");
        badge= sc.nextLine();

        System.out.println("Do you want to apply an extra discount for the vehicle?");
        System.out.println("Type \n 1 --> Yes \n 2 --> No");
        discount= sc.nextInt();
        sc.nextLine();

        if(discount==1){
            System.out.println("Type the amount of the extra discount you want to apply");
            extraD= sc.nextDouble();
            sc.nextLine();
        }

        control.calculateSalePrice(badge, discount, extraD);
    }

    public void showVehicle(){

        int typeR=0;
        int typeV=0;
        int typeA=0;
        int typeF=0;
        int type=0;

        System.out.println("Select one way to filter the reports");
        System.out.println("Type \n 1 --> TYPE OF VEHICLE \n 2 --> TYPE OF FUEL \n 3 --> USED/NEW VEHICLES");
        typeR= sc.nextInt();
        sc.nextLine();

        if(typeR==1){
            System.out.println("Select the type of vehicle you want to see the reports of");
            System.out.println("Type \n 1 --> AUTOMOBILE \n 2 --> MOTORCYCLE");
            typeV= sc.nextInt();
            sc.nextLine();
            if(typeV==1){
                System.out.println("Select the type of automobile you want to see the reports of");
                System.out.println("Type \n 1 --> GASOLINE \n 2 --> ELECTRIC \n 3 --> HYBRID");
                typeA= sc.nextInt();
                sc.nextLine();
                System.out.println(control.showAutomobiles(typeA));
            } else if(typeV==2){
                System.out.println(control.showMotorcycles());
            }
        } else if(typeR==2){
            System.out.println("Select the type of fuel you want to see the reports of");
            System.out.println("Type \n 1 --> GASOLINE \n 2 --> ELECTRICITY");
            typeF= sc.nextInt();
            sc.nextLine();

            if(typeF==1){
                System.out.println(control.showGasoline());
            } else if(typeF==2){
                System.out.println(control.showElectric());
            }
        } else if(typeR==3){
            System.out.println("Select the type of Vehicle you want to see the reports of");
            System.out.println("Type \n 1 --> NEW \n 2 --> USED");
            type= sc.nextInt();
            sc.nextLine();

            if(type==1){
                System.out.println(control.showNew());
            } else if(type==2){
                System.out.println(control.showUsed());
            }
        }
    }
}