package model;

import java.util.ArrayList;
import java.lang.Math;

public class Document{

	/**
	 * Constant int size of the matrix
	 */
	protected static final int size= (5);

    /** 
	 * price double, is use to store the price of the document
	 */
    protected double price;

    /** 
	 * year int, is use to store the year of the released of the document
	 */
    protected int year;

	/** 
	 * code String, is use to store the numbers by which the document will be identify
	 */
	protected String code;

	/**
	 * Matrix of int representing the place where the code is extracted
	 */
	protected int [][] newMatrix = new int[size][size];

    /** 
	 * Constructor used for obj document
	 * @param price
	 * @param year
	 * @param code
	 */
    public Document(double price, int year, String code){

        this.price=price;
        this.year=year;
		this.code=code;

		createMatrix();
		obteinCode(newMatrix);

    }

    public double getPrice(){
		
		return price;
		
	}

	public void setPrice(double price){
		
		this.price= price;
		
	}

    public int getYear(){
		
		return year;
		
	}

	public void setYear(int year){
		
		this.year= year;
		
	}

	public String getCode(){
		
		return code;
		
	}

	public void setCode(String code){
		
		this.code= code;
		
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
		for (int i= (newMatrix.length-1); i > 0; i-- ) {
			for (int j = (newMatrix[0].length-1); j > 0; j--) {
				if((i+j)%2==0){
					code += String.valueOf(newMatrix[i][j]);
				}
			}
		}
	}

    /**
	 * Method used to show the information of a Document
	 * @return Document
	 */
	public String toString(){

        return "Document Price: " + getPrice() + "\n" +
        "Year: " + getYear() + "\n" +
		"Code: " + getCode() + "\n";

    }
}