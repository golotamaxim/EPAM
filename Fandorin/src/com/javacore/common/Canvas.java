package com.javacore.common;

import com.javacore.profile.ProfileModel;

public abstract class Canvas {

    static int width;
    static int height;



    public abstract void draw();
    public abstract void drawRect(int x, int y, int upSide, int leftSide); // x, y are coordinates of left up corner, size is one side;
    public abstract void drawCircle(int x, int y, int radius); //x,y are coordinates of center;
    public abstract void drawText(String text);


}
