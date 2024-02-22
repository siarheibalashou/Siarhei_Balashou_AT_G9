package project.bubbletask.materials;

public class Metal extends Material {


    private static final double thermalConductivity = 12.0;
    private static final String color = "metallic";
    private static final double density = 8.3;

    public Metal() {
        super(thermalConductivity, color, density);
    }
}
