public class Book extends Goods implements Taxable{
    private String author;

    public Book(String description, double price, String author){
        super(description, price);
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public double calculateTax(){
        return getPrice() * taxRate;
    }
    public void display(){
        System.out.println("Author: " + author);
        System.out.println("Harga Pajak: " + calculateTax());
    }
}
