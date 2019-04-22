package com.javacore.common;

import com.javacore.profile.ProfileModel;

public abstract class Canvas {

    static int width;
    static int height;



    public abstract void draw();
    public abstract void drawRect();
    public abstract void drawCircle();
    public abstract void drawText(String text);


}
