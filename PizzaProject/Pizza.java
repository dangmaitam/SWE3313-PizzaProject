public class Pizza {
    char size;
    char crust;
    int meat1;
    int meat2;
    int meat3;
    int topping1;
    int topping2;
    int topping3;
    int topping4;
    int topping5;
    int topping6;
    int quantity;

    public Pizza(char siz, char cru, int m1, int m2, int m3, int t1, int t2, int t3, int t4, int t5, int t6, int n) {
        size = siz;
        crust = cru;
        meat1 = m1;
        meat2 = m2;
        meat3 = m3;
        topping1 = t1;
        topping2 = t2;
        topping3 = t3;
        topping4 = t4;
        topping5 = t5;
        topping6 = t6;
        quantity = n;


    }
    public String toString() {
        return "size: " + size + ", " + "crust: " + crust + "\n" +
                "meat: " + meat1 + ", " + meat2 + ", " + meat3 + "\n" +
                "toppings: " + topping1 + ", " + topping2 + ", " + topping3 + ", " + topping4 + "," +
                    topping5 + ", " + topping6 + ", \n" +
                "quantity: " + quantity;
    }


}
