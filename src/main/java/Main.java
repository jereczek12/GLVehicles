import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


@Slf4j
public class Main {
    private List<Vehicle> vehicleList;

    public static void main(String[] args) {

    }

    private void run(){
        Scanner sc= new Scanner(System.in);
        createVehicles();
        while (true){
            log.info("Wybierz opcje:" +
                    "1) Car" +
                    "2) Ship" +
                    "3) Plane" +
                    "4) Bicycle" +
                    "5) Wszystkie" +
                    "0) Exit");
            int choice= sc.nextInt();

            switch (choice){
                case 1: {
                    double topVelocity;
                    for (Vehicle vehicle : vehicleList) {
                        if(vehicle.getType().equals("Car")){

                        }
                    }
                }
                case 0:{
                    sc.close();
                    break;
                }
                default:{
                    log.info("niepoprawny wybor");
                    String line = sc.nextLine();
                }
            }
        }
    }

    private  void createVehicles() {
        Car bmw = new Car("BMW", 220.0);
        Car vw = new Car("VW", 230.0);
        List<Car> carList=

        Ship baglietto = new Ship("Baglietto", 105.0);
        Ship rodriquez = new Ship("Rodriquez", 120.0);


        Plane b747 = new Plane("Boeing", 945.0);
        Plane a380 = new Plane("Airbus", 1089.0);


        Bicycle elektryczny = new Bicycle("Kross", 25.0);
        Bicycle szosowy = new Bicycle("Triban", 52.87);

        vehicleList= Arrays.asList(a380, b747, bmw, vw, baglietto, rodriquez, elektryczny, szosowy);

    }
}
