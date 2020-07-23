public class Notebook {
    double weight;
    int price;
    int year;


    public Notebook(double weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price <= 600) {
            System.out.println("This notebook is very cheap.");
        }
        if (this.price > 600 && this.price <= 1000) {
            System.out.println("This price is good.");
        }
        if (this.price > 1000) {
            System.out.println("This notebook is quite expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight > 600 && this.weight<= 1600) {
            System.out.println("This device is light.");
        }
        if (this.weight > 1600) {
            System.out.println("This devise is not that heavy.");
        }
        if (this.weight >= 2000) {
            System.out.println("This device is very heavy.");
        }
        }
    public void checkYear() {
        if (this.year > 2010 && 1000 <= this.price && this.price < 2000) {
            System.out.println("This device is worth its price");
        } else {
            System.out.println("This device is not worth its price");
        }
    }

}