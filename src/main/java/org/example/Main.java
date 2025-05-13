package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;


public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        Bed bed = new Bed(2, 2, 1, 1, "normal");
        Lamp lamp = new Lamp(true, 2, LampType.NORMAL);
        Wardrobe wardrobe = new Wardrobe(120, 200, 70.5);
        Carpet carpet = new Carpet(200, 150, PaintColor.RED);

        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4,
                ceiling, bed, lamp, wardrobe, carpet);

        bedroom.getLamp().turnOn();
        bedroom.getBed().make();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();
        bedroom.getWall1().create();
    }
}