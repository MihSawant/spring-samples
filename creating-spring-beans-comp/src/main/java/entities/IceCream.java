package entities;

import org.springframework.stereotype.Component;

@Component
public class IceCream {
    private String flavour;
    private boolean availableInCone;

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void setAvailableInCone(boolean availableInCone) {
        this.availableInCone = availableInCone;
    }

    public String getFlavour() {
        return flavour;
    }

    public boolean isAvailableInCone() {
        return availableInCone;
    }
}
