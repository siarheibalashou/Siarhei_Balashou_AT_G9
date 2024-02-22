package project.bubbletask.materials;

public class Plastic extends Material {

    private static final double thermalConductivity = 1.0;
    private static final String color = "white";
    private static final double density = 0.4;

    public Plastic() {
        super(thermalConductivity, color, density);
    }
}
