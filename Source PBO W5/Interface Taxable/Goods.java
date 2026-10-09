public class Goods {
    private String description;
    private double price;

    public Goods(String description, double price){
        this.description = description;
        this.price = price;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void display(){
        System.out.println("Deskripsi: " + description);
        System.out.println("Harga: " + price);
    }
}
