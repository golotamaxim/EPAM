package com.javacore.common;

import com.javacore.profile.ProfileModel;

import static java.lang.Math.pow;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;

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

    public void setSymbolAt(int x, int y, char symbol) {
        pixels[x][y] = symbol;
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
    public void drawRect(int x, int y, int upSide, int leftSide) {

    }

    @Override
    public void drawCircle(int x, int y, int radius) {
        int a = y;
        int b = x;
        for (int i = x-radius; i < x+radius; i++) {
            int j = (int) ((round(sqrt(pow(radius, 2) - pow((i - b), 2))))+a);
            setSymbolAt(i, j, '#');
            setSymbolAt(i, 2*b - j, '#');

        }
        for (int j = y-radius; j < y+radius; j++) {
            int i = (int) ((round(sqrt(pow(radius, 2) - pow((j - a), 2))))+b);
            setSymbolAt(i, j, '#');
            setSymbolAt(2*a - i, j, '#');

        }
        draw();


    }

    @Override
    public void drawText(String text) {
        char[] charText = text.toCharArray();
        int hasNext = 0;
        int i = 0;
        int j = 0;
        while (hasNext < charText.length) {
            pixels[i][j] = charText[hasNext];
            hasNext++;
            i++;
            if (i == width) {
                i = 0;
                j++;
            }

        }
        draw();



    }
}
