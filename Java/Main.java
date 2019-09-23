/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        /*UberX uberX = new UberX("HVF753", new Account("Duvan", "12232449"), "chevrolet", "camaro");
        uberX.setPassenger(4);
        uberX.printDataCar(); */

        UberVan uberVan = new UberVan("MKJ653", new Account("Hector", "1075302"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

       /* Car car2 = new Car("VGTA 777", new Account("Esteban Quito", "5JSPMBCY458"));
        car2.passenger = 2;
        car2.printDataCar();
        
        //instancia objeto Payment
        Payment payment = new Payment(1100, "pago");
        payment.printMethodPay();
    
        Payment payment2 = new Payment(2200,"tarjeta");
        payment2.printMethodPay(); 
        */
    
    
    }
}