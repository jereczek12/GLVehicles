package vehicles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Vehicle {
    private final String manufacturer;
    private final double maxVelocity;
}
