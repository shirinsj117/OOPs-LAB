class Product {
    int pcode;
    int price;
    String pname;
 
    Product(int var1, String var2, int var3) {
       this.pcode = var1;
       this.pname = var2;
       this.price = var3;
    }
 
    void display() {
       System.out.println("Code: " + this.pcode);
       System.out.println("Name: " + this.pname);
       System.out.println("Price: " + this.price);
    }
 
    public static void main(String[] var0) {
       Product var1 = new Product(101, "Laptop", 59000);
       Product var2 = new Product(102, "Smartphone", 16000);
       Product var3 = new Product(103, "Tablet", 30000);
       Product var4 = var1.price < var2.price ? (var1.price < var3.price ? var1 : var3) : (var2.price < var3.price ? var2 : var3);
       System.out.println("produc with the lowest price:");
       var4.display();
    }
 }