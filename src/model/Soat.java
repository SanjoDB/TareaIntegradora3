package model;

import java.util.ArrayList;
import java.lang.Math;

public class Soat extends Document{

    /** 
	 * moneyCovering double, is use to store the amount of money recovered if any accident occur
	 */
    private double moneyCovering;

    /** 
	 * Constructor used for obj document
	 * @param price
	 * @param year
     * @param code
     * @param moneyCovering
	 */
    public Soat(double price, int year, String code, double moneyCovering){

        super(price, year, code);
        this.moneyCovering=moneyCovering;

        createMatrix();
        obteinCode(newMatrix);

    }

    public double getMoneyCovering(){
		
		return moneyCovering;
		
	}

	public void setMoneyCovering(double moneyCovering){
		
		this.moneyCovering= moneyCovering;
		
	}

    /**
	 * Method used to fill the matrix
	 */
    public void createMatrix(){

		for (int i=0; i< newMatrix.length; i++ ) {
			for (int j = 0; j < newMatrix[0].length; j++) {
				newMatrix[i][j] =  (int)(Math.random()*(100-1+1)+1);
			}
		}

    }

    /**
	 * Method used to obtein the code of the matrix
	 */
    public void obteinCode(int [][] newMatrix){

        for(int i=0; i<newMatrix.length; i++){
            super.code+= String.valueOf(newMatrix[i][0]);
        }
        for(int j=1; j<newMatrix[0].length; j++){
            super.code+= String.valueOf(newMatrix[newMatrix.length-1][j]);
        }
	}

    /**
	 * Method used to show the information of a Soat Document
	 * @return Soat Document
	 */
    public String toString(){

        return "Document Price: " + super.price + "\n" +
        "Year: " + super.year + "\n" +
        "Code: " + super.code + "\n" +
        "Money covering: " + getMoneyCovering() + "\n";

    }
}