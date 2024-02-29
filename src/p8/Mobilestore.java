package p8;
public class Mobilestore
{
	String make;
    String model;
    String category;
    double price; 
    double discount;
    double netPrice;

    Mobilestore()
    {
        this.make="Samsung";
        this.model="Galaxy S21";
        this.category="Smartphone"; 
        this.price = 80099.99; 
        this.discount = 0.15;
    }

    Mobilestore(String make, String model, String category, double price, double discount)
    {
        this.make = make;
        this.model = model;
        this.category = category;
        this.price = price;
        this.discount = discount;
    }

    Mobilestore(Mobilestore obj, Mobilestore obj1, Mobilestore obj2)
    {
        this.make = obj.make;
        this.model = obj1.model;
        this.category = obj2.category;
        this.price = obj.price;
        this.discount = obj2.discount;
    }

    boolean getDetails()
    {
        System.out.println("*");
        System.out.println("company name: "+make);
        System.out.println("model: "+model);
        System.out.println("category: "+category);
        System.out.println("price: "+price);
        System.out.println("discount: "+discount);
        System.out.println("net price: "+calculateNetPrice()); 
        System.out.println("*");
        return true;
    }

    double calculateNetPrice()
    {
        netPrice = price - (price* discount); 
        return netPrice;
    }
}

class mobile
{
    public static void main(String args[])
    {
        Mobilestore mobile1 = new Mobilestore();
        mobile1.getDetails();

        Mobilestore iphone = new Mobilestore("Apple", "iPhone 12", "Smartphone", 99999.99, 0.1);
        iphone.getDetails();

        Mobilestore Samsung = new Mobilestore("Samsung", "Galaxy S21", "Smartphone", 88899.99, 0.15);
        Samsung.getDetails();

        Mobilestore Google = new Mobilestore("Google", "Pixel 5", "Smartphone", 69999.99, 0.2);
        Google.getDetails();

        Mobilestore mobile2 = new Mobilestore(iphone,Samsung,Google); 
        mobile2.getDetails();
    }


}


