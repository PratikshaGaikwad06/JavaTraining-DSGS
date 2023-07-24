
public class WashingMachineTest {
	public static void main(String[] args) {
		
		WashingPowder washPowder = new WashingPowder(100,"Nirma", "Front Load", true, 10.0f);
		System.out.println("Wash Powder : "+washPowder); //toString is invoked
		
		Water water = new Water("Cold", 40, "20°C"); 
		System.out.println("Water : "+water);
//		Water water = new Water("Warm", 25, "30°C"); 
		
		Electricity electricity = new Electricity("AC", 220.0f, 8, 15, "Mahavitaran");
		System.out.println("Electricity : "+electricity);
		
		Cloth[] clothes = new Cloth[5];
		clothes[0] = new Cloth("Cotton", "Blue", 250.99f, "T-Shirt", false);
		clothes[1] = new Cloth("Polyester", "Red", 390.99f, "Dress", true);
		clothes[2] = new Cloth("Denim", "Black", 340.99f, "Jeans", false);
		clothes[3] = new Cloth("Silk", "Green", 190.99f, "Bath Towel", false);
		clothes[4] = new Cloth("Linen", "White", 290.99f, "Pants", true);
		
		int i=0; 
		for (Cloth cloth : clothes) {
			System.out.println("cloth" + ++i + " : "+   cloth);
        }
		
		System.out.println("================================================\n");
        
//		clothes[0].setMaterial("Cotton");
//		clothes[0].setColor("Blue");
//		clothes[0].setCost(250.99f);
//		clothes[0].setType("T-shirt");
//		clothes[0].setClean(false);
//		
//		clothes[1].setMaterial("Polyester");
//		clothes[1].setColor("Red");
//		clothes[1].setCost(390.99f);
//		clothes[1].setType("Dress");
//		clothes[1].setClean(true);
//		
//		clothes[2].setMaterial("Denim");
//		clothes[2].setColor("Black");
//		clothes[2].setCost(340.99f);
//		clothes[2].setType("Jeans");
//		clothes[2].setClean(false);
//		
//		clothes[3].setMaterial("Silk");
//		clothes[3].setColor("Gree");
//		clothes[3].setCost(190.99f);
//		clothes[3].setType("Bath Towel");
//		clothes[3].setClean(false);
//		
//		clothes[4].setMaterial("Lenin");
//		clothes[4].setColor("White");
//		clothes[4].setCost(290.99f);
//		clothes[4].setType("Pants");
//		clothes[4].setClean(false);
		
		

		WashingMachine washingMachine = new WashingMachine();
		Laundry laundry = washingMachine.wash(washPowder, water, electricity, clothes);
		System.out.println("Number of Clothes : " + laundry.getNumberOfCloths());
		System.out.println("Time Required to wash clothes : " + laundry.getTimeRequired() + " mins");
		System.out.println("Total Cost of Clothes : " + laundry.getTotalCost() + " Rs");
		System.out.println("Water Used for washing clothes : " + laundry.getWaterUsed() + " L");
		System.out.println("Electricity Used for washing clothes : " + laundry.getElectricityUsed() + " kWh");
		System.out.println("Cost of Washing Powder: " + laundry.getCostOfWashingPowder() + " Rs");
	}
}

class Machine {
	
}
class WashingMachine extends Machine { //isA
	
//	WashingTub washTub = new WashingTub(); //hasA

	
		Laundry wash(WashingPowder washPowder, Water water, Electricity electricity, Cloth clothes[]) {
			Laundry laundry = new Laundry();
			laundry.setNumberOfCloths(clothes.length);
			float timeRequired = 60.00f; // 60 mins - > prewash(10), mainwash(30), rinse(10), spin(10)
			laundry.setTimeRequired(timeRequired);
			 float totalCost = 0.0f;
		        for (Cloth cloth : clothes) {
		            totalCost += cloth.getCost();
		        }
			laundry.setTotalCost(totalCost);
			laundry.setWaterUsed((float)water.getQuantity());
			//Electricity Used (in kWh) = Power (in kilowatts) × Time (in hours)
			float electricityUsed = electricity.getUnitUsed() * (timeRequired / 60.0f);
			laundry.setElectricityUsed(electricityUsed);
//			laundry.setCostOfWashingPowder(washPowder.getQuantity() * washPowder.getPrice());
//			costOfWashingPowder * (waterUsed + electricityUsed)
			laundry.setCostOfWashingPowder(washPowder.getPrice() * ((float)water.getQuantity() + electricityUsed));
			
			
			
//			Laundry laundry = new Laundry(cloth.length, timeRequired, totalCost, waterUsed, electricityUsed, costOfWashingPowder);
			return laundry;
		}
}

class Laundry {
	private int numberOfCloths; //cloth.length
	private float timeRequired;
	private float totalCost ;// cloth.length * price per cloth
	private float waterUsed;
	private float electricityUsed;
	private float costOfWashingPowder; //
	
	public Laundry() {
		
	}
	public Laundry(int numberOfCloths, float timeRequired, float totalCost, float waterUsed, float electricityUsed,
			float costOfWashingPowder) {
		super();
		this.numberOfCloths = numberOfCloths;
		this.timeRequired = timeRequired;
		this.totalCost = totalCost;
		this.waterUsed = waterUsed;
		this.electricityUsed = electricityUsed;
		this.costOfWashingPowder = costOfWashingPowder;
	}

	@Override
	public String toString() {
		return "Laundry [numberOfCloths=" + numberOfCloths + ", timeRequired=" + timeRequired + ", totalCost="
				+ totalCost + ", waterUsed=" + waterUsed + ", electricityUsed=" + electricityUsed
				+ ", costOfWashingPowder=" + costOfWashingPowder + "]";
	}

	public int getNumberOfCloths() {
		return numberOfCloths;
	}

	public void setNumberOfCloths(int numberOfCloths) {
		this.numberOfCloths = numberOfCloths;
	}

	public float getTimeRequired() {
		return timeRequired;
	}

	public void setTimeRequired(float timeRequired) {
		this.timeRequired = timeRequired;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public float getWaterUsed() {
		return waterUsed;
	}

	public void setWaterUsed(float waterUsed) {
		this.waterUsed = waterUsed;
	}

	public float getElectricityUsed() {
		return electricityUsed;
	}

	public void setElectricityUsed(float electricityUsed) {
		this.electricityUsed = electricityUsed;
	}

	public float getCostOfWashingPowder() {
		return costOfWashingPowder;
	}

	public void setCostOfWashingPowder(float costOfWashingPowder) {
		this.costOfWashingPowder = costOfWashingPowder;
	}
	
}

//class Tub {
//	
//}

class WashingTub{
	private int capacity;
	private String type; //
	public WashingTub(int capacity, String type) {
		super();
		this.capacity = capacity;
		this.type = type;
	}
	@Override
	public String toString() {
		return "WashingTub [capacity=" + capacity + ", type=" + type + "]";
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}

//class Powder {
//	
//}

class WashingPowder{ // isA

	private int quantity; // in grams
	private String brand;
	private String type;
	private boolean scented;
	private float price; // in rupees
	
	public WashingPowder(int quantity, String brand, String type, boolean scented, float price) {
		super();
		this.quantity = quantity;
		this.brand = brand;
		this.type = type;
		this.scented = scented;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return "WashingPowder [quantity=" + quantity + ", brand=" + brand + ", type=" + type + ", scented=" + scented
				+ ", price=" + price + "]";
	}
	/*public String toString() {
		String str = (scented) ? "Scented" :"Not Scented";
		return str+ " "+brand+" Washing Powder of "+type+ " type quantity used "+quantity+ " grams ";
	}*/

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isScented() {
		return scented;
	}

	public void setScented(boolean scented) {
		this.scented = scented;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

class Water {
	private String type;
	private int quantity; // in liters
	private String temperature; // in deg Celsius
	
	public Water(String type, int quantity, String temperature) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "Water [type=" + type + ", quantity=" + quantity + "L, temperature=" + temperature + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

}

class Electricity {
	private String type; //ac dc
	private float voltage; // volts
	private int costPerUnit;
	private int unitUsed; // kWh
	private String supplier;
	
	public Electricity(String type, float voltage, int costPerUnit, int unitUsed, String supplier) {
		super();
		this.type = type;
		this.voltage = voltage;
		this.costPerUnit = costPerUnit;
		this.unitUsed = unitUsed;
		this.supplier = supplier;
	}
	@Override
	public String toString() {
		return "Electricity [type=" + type + ", voltage=" + voltage + "V, costPerUnit=" + costPerUnit + ", unitUsed="
				+ unitUsed + "units, supplier=" + supplier + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getVoltage() {
		return voltage;
	}
	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}
	public int getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public int getUnitUsed() {
		return unitUsed;
	}
	public void setUnitUsed(int unitUsed) {
		this.unitUsed = unitUsed;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	
	
}

class Cloth {
	private String material; //
	private String color;
	private float cost;
	private String type;
	private boolean clean; //
	
	public Cloth(String material, String color, float cost, String type, boolean clean) {
		super();
		this.material = material;
		this.color = color;
		this.cost = cost;
		this.type = type;
		this.clean = clean;
	}
	@Override
	public String toString() {
		return "Cloth [material=" + material + ", color=" + color + ", cost=" + cost + ", type=" + type + ", clean="
				+ clean + "]";
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isClean() {
		return clean;
	}
	public void setClean(boolean clean) {
		this.clean = clean;
	}
	

	
}


