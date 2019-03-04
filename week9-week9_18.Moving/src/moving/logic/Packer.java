package moving.logic;

import java.util.*;
import moving.domain.*;

public class Packer {

    private int boxesVolume;
    private List<Box> boxes = new ArrayList<Box>();

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    // METHOD. 
    public List<Box> packThings(List<Thing> things) {
        Box box = new Box(this.boxesVolume);

        for (Thing thing : things) {
            if (box.addThing(thing)) {
            } else {
                this.boxes.add(box);
                box = new Box(this.boxesVolume);
                box.addThing(thing);
            }
        }
        this.boxes.add(box);
        return this.boxes;
    }

}
