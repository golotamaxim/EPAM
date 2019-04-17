package com.javacore.bonya;

public class ConsolCanvas extends Canvas {


    private char [][] pixes;
    private int width;
    private int heigth;

    public ConsolCanvas(int width, int heigth) {
        this.heigth = heigth;
        this.width = width;
        init();
    }


    public void init() {
        pixes = new char[heigth][width];
        reset();
    }

    private void reset() {
        for (int i = 0; i < heigth; i++){
            for (int j = 0; j < width; j++) {
                pixes[i][j] = '.';
            }
        }
    }

    public void draw() {
        for (int i = 0; i < heigth; i++){
            System.out.print("\n");
            for (int j = 0; j < width; j++) {
                System.out.print(pixes[i][j] );
            }
        }

    }

    public void setSymbolAt(int x, int y, char symbol) {
        pixes[x][y] = symbol;
    }

    public void drawSquareAt(int x, int y, int size) {
        for (int i = x; i < x + size; i++) {
            setSymbolAt(i, y, '#');
        }
        for (int j = y; j < y + size; j++) {
            setSymbolAt(x, j, '#');
        }
        y = y + size-1;
        for (int i = x; i < x + size; i++) {
            setSymbolAt(i, y, '#');
        }
        y = y - size+1;
        x = x + size-1;
        for (int j = y; j < y + size; j++) {
            setSymbolAt(x, j, '#');
        }

        draw();

    }

    public void drawCircleAt(int x, int y, int radius) {



    }
}
