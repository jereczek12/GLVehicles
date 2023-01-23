package vehicles;

import lombok.Getter;

@Getter
public class Car extends Vehicle {
    public Car(String manufacturer,double maxVelocity){
        super(manufacturer, maxVelocity);
    }
}
