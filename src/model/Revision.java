package model;

import java.util.ArrayList;
import java.lang.Math;

public class Revision extends Document{

    /** 
	 * gasLevel double, is use to store the level of the gases of the Revision document
	 */
    private double gasLevel;

    /** 
	 * Constructor used for obj document
	 * @param price
	 * @param year
     * @param code
     * @param gasLevel
	 */
    public Revision(double price, int year, String code, double gasLevel){

        super(price, year, code);
        this.gasLevel=gasLevel;

        createMatrix();
        obteinCode(newMatrix);

    }

    public double getGasLevel(){
		
		return gasLevel;
		
	}

	public void setGasLevel(double gasLevel){
		
		this.gasLevel= gasLevel;
		
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

        for(int j=0; j<(newMatrix[0].length-1); j++){
            super.code+= String.valueOf(newMatrix[0][j]);
        }
        int k=1;
        for(int j=newMatrix[0].length-2; j>0; j--){
            super.code+= String.valueOf(newMatrix[k][j]);
            if(k<newMatrix.length-1){
                k++;
            }
        }
        for(int j=0; j<newMatrix[0].length; j++){
            super.code+= String.valueOf(newMatrix[newMatrix.length-1][j]);
        }
	}

    /**
	 * Method used to show the information of a revision Document
	 * @return revision Document
	 */
    public String toString(){

        return "Document Price: " + super.price + "\n" +
        "Year: " + super.year + "\n" +
        "Code: " + super.code + "\n" +
        "Level of gases: " + getGasLevel() + "\n";

    }
}