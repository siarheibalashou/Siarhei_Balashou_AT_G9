package project.bubbletask.runners;

import project.bubbletask.boxing.Bottle;
import project.bubbletask.materials.Metal;

public class Factory {
    Bottle bottleOne = new Bottle(0.05, 12, new Metal());
    Bottle bottleTwo = new Bottle(0.1, 12, new Metal());
    Bottle bottleThree = new Bottle(0.2, 12, new Metal());

}
