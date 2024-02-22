package project.bubbletask.materials;

public class Glass extends Material {


    private static final String color = "transparent";
    private static final double thermalConductivity = 2.0;
    private static final double density = 1.2;

    public Glass() {
        super(thermalConductivity, color, density);
    }
}
