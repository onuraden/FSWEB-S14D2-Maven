package org.example.model;

public class Bed {
    private int pillows;
    private int height;
    private int sheets;
    private int quilts;
    private String style;

    public Bed(int pillows, int height, int sheets, int quilts, String style) {
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
        this.style = style;
    }

    public void make() {
        System.out.println("The bed is being made.");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }
}
