package com.javacore.profile;

import com.javacore.common.BaseView;
import com.javacore.common.Canvas;
import com.javacore.common.ConsoleCanvas;

public class ProfileView extends BaseView {

    private ProfileModel profileModel;
    private Canvas canvas;

    {
        canvas = new ConsoleCanvas(40, 60);
    }

    public ProfileModel getProfileModel() {
        return profileModel;
    }

    void setProfileModel(ProfileModel profileModel) {
        this.profileModel = profileModel;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    void drawWithCanvas() {
        canvas.drawCircle();
        canvas.drawRect();
        String modelDescription = profileModel.toString();
        canvas.drawText(modelDescription);

    }

}
