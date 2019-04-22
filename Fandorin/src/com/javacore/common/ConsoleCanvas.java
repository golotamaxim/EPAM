package com.javacore.common;

import com.javacore.profile.ProfileModel;

public class ConsoleCanvas extends Canvas {

    private int width;
    private int height;
    private char[][] pixels;

    public ConsoleCanvas(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new char[width][height];
        reset();
    }

    //initiation of canvas
    private void reset() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                pixels[j][i] = '.';
            }
        }
        //draw();
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(pixels[j][i]);

            }
            System.out.print("\n");
        }
    }

    @Override
    public void drawRect() {

    }

    @Override
    public void drawCircle() {

    }

    @Override
    public void drawText(String text) {
        char[] charText = text.toCharArray();
        int hasNext = 0;



    }
}
