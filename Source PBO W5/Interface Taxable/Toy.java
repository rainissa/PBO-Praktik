public class Toy extends Goods implements Taxable {
    private int minimumAge;

    public Toy(String description, double price, int minimumAge){
        super(description, price);
        this.minimumAge = minimumAge;
    }
    public int getMinimumAge(){
        return minimumAge;
    }
    public void setMinimumAge(int minimumAge){
        this.minimumAge = minimumAge;
    }
    public double calculateTax(){
        return getPrice() * taxRate;
    }
    public void display(){
        System.out.println("Usia minimal: " + minimumAge);
        System.out.println("Harga Pajak: " + calculateTax());
    }
}
