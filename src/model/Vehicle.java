package model;

public abstract class Vehicle{

	//El soat no esta en los nuevos, mostrarlo como nulo en esos casos
	//En carros nuevos, el año es el actual y el precio es 0

	/** 
	 * basePrice double is use to store the name of the specie
	 */
    protected double basePrice;

	/** 
	 * brand String is use to store the name of the specie
	 */
    protected String brand;

	/** 
	 * model int is use to store the name of the specie
	 */
    protected int model;

	/** 
	 * cylinderCapacity double is use to store the name of the specie
	 */
    protected double cylinderCapacity;

	/** 
	 * mileage double is use to store the name of the specie
	 */
    protected double mileage;

	/** 
	 * badge String is use to store the name of the specie
	 */
    protected String badge;

	//Relationships
    protected VehicleType type;
	protected Document soat;
	protected Document revision;
	protected Document propertyCard;

	/** 
	 * Constructor used for obj Vehicle
	 * @param basePrice
	 * @param brand
	 * @param model
	 * @param cylinderCapacity
	 * @param mileage
	 * @param badge
	 * @param type
	 * @param soat
	 * @param revision
	 * @param propertyCard
	 */
    public Vehicle(double basePrice, String brand, int model, double cylinderCapacity, double mileage, String badge, int type, Document soat, Document revision, Document propertyCard){

        this.basePrice=basePrice;
        this.brand=brand;
        this.model=model;
        this.cylinderCapacity=cylinderCapacity;
        this.mileage=mileage;
        this.badge=badge;

        switch(type){

			case 1:
				this.type = VehicleType.NEW;
			break;

			case 2:
				this.type = VehicleType.USED;
			break;

		}

		this.soat=soat;
		this.revision=revision;
		this.propertyCard=propertyCard;

    }

    public double getBasePrice(){
		
		return basePrice;
		
	}

	public void setBasePrice(double basePrice){
		
		this.basePrice= basePrice;
		
	}

    public String getBrand(){
		
		return brand;
		
	}

	public void setBrand(String brand){
		
		this.brand= brand;
		
	}

    public int getModel(){
		
		return model;
		
	}

	public void setModel(int model){
		
		this.model= model;
		
	}

    public double getCylinderCapacity(){
		
		return cylinderCapacity;
		
	}

	public void setCylinderCapacity(double cylinderCapacity){
		
		this.cylinderCapacity= cylinderCapacity;
		
	}

    public double getMileage(){
		
		return mileage;
		
	}

	public void setMileage(double mileage){
		
		this.mileage= mileage;
		
	}

    public String getBadge(){
		
		return badge;
		
	}

	public void setBadge(String badge){
		
		this.badge= badge;
		
	}

    public VehicleType getType(){
		
		return type;
		
	}

	public void setType(VehicleType type){
		
		this.type= type;
		
	}

	public Document getSoat(){
		
		return soat;
		
	}

	public void setSoat(Document soat){
		
		this.soat= soat;
		
	}

	public Document getRevision(){
		
		return revision;
		
	}

	public void setRevision(Document revision){
		
		this.revision= revision;
		
	}

	public Document getPropertyCard(){
		
		return propertyCard;
		
	}

	public void setPropertyCard(Document propertyCard){
		
		this.propertyCard= propertyCard;
		
	}

	public abstract double sellPrice(int discount, double extraD);

}