
public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double TotalValueInStock() {
		return price * quantity;
	}
	
	void AddProducts(int quantity) { 
		this.quantity += quantity;
		
	}
	
	void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", price)  + ", " + quantity + " units, Total: $ " + String.format("%.2f",TotalValueInStock());
	}
}
