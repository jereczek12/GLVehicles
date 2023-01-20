import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Car extends Vehicle {
    private final String type = "Car";
    public Car(String manufacturer,double maxVelocity){
        super(manufacturer, maxVelocity, "Car");
    }
}
