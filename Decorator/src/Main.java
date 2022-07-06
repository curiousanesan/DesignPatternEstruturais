public class Main {

    public static void main (String [] args) {

        Beverage b = new Caramel(new Expresso());
        System.out.printf("Valor R$ " + b.cost());;
    }
}
