package vehicles;

import lombok.extern.slf4j.Slf4j;

import java.util.*;


@Slf4j
public class Main {
    private List<Vehicle> vehicleList;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run(){
        Scanner sc= new Scanner(System.in);
        createVehicles();

        while (true){
            log.info("""
                    Wybierz opcje:
                    1) Car
                    2) Ship
                    3) Plane
                    4) Bicycle
                    5) All
                    0) Exit""");
            String choice= sc.nextLine();

            switch (choice){
                case "1": {
                    getFastestVehicle(vehicleList, "Car");
                    break;
                }
                case "2": {
                    getFastestVehicle(vehicleList, "Ship");
                    break;
                }
                case "3": {
                    getFastestVehicle(vehicleList, "Plane");
                    break;
                }
                case "4": {
                    getFastestVehicle(vehicleList, "Bicycle");
                    break;
                }
                case "5":{
                    Vehicle fastestVehicle = vehicleList.stream()
                            .max(Comparator.comparing(Vehicle::getMaxVelocity))
                            .get();
                    log.info("Fastest vehicle is: " + fastestVehicle.getManufacturer() + " with max speed: " + fastestVehicle.getMaxVelocity());
                    break;
                }
                case "0":{
                    sc.close();
                    return;
                }

                default:{
                    log.info("niepoprawny wybor");
                    break;
                }
            }
            }

    }

    private void getFastestVehicle(List<Vehicle> list, String type) {
        int listSize= list.size();
        int fastestVehicleIndex=0;
        double topSpeed=0;
        for (int i = 0; i< listSize; i++) {
            Vehicle currentVehicle=vehicleList.get(i);
            String vehicleType=currentVehicle.getClass().getSimpleName();
            if(vehicleType.equals(type)){
                double maxVelocity=currentVehicle.getMaxVelocity();
                if (maxVelocity> topSpeed){
                topSpeed = currentVehicle.getMaxVelocity();
                    fastestVehicleIndex =i;
                }
            }
        }
        log.info(vehicleList.get(fastestVehicleIndex).getClass().toString() +" with highest speed is: " +
                vehicleList.get(fastestVehicleIndex).getManufacturer()+
                " with speed: " + topSpeed);
    }

    private  void createVehicles() {
        Car bmw = new Car("BMW", 220.0);
        Car vw = new Car("VW", 230.0);

        Ship baglietto = new Ship("Baglietto", 105.0);
        Ship rodriquez = new Ship("Rodriquez", 120.0);


        Plane b747 = new Plane("Boeing", 945.0);
        Plane a380 = new Plane("Airbus", 1089.0);


        Bicycle elektryczny = new Bicycle("Kross", 25.0);
        Bicycle szosowy = new Bicycle("Triban", 52.87);

        vehicleList= Arrays.asList(a380, b747, bmw, vw, baglietto, rodriquez, elektryczny, szosowy);

    }
}
