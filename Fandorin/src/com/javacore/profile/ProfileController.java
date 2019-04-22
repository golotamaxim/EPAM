package com.javacore.profile;

import com.javacore.command.ACommand;
import com.javacore.common.Canvas;
import com.javacore.Application;

import java.io.IOException;

public class ProfileController implements ACommand {

    private ProfileModel profileModel;
    //private ProfileStore profileStore;
    private ProfileView profileView;
    private Canvas canvas;

    // filling with random profiles, executing test-method;
    static {
        ProfileStore.INSTANCE.loadProfileData();
    }
    {
        profileView = new ProfileView();
    }

    @Override
    public void execute() {
        try {
            int requestedId = Integer.parseInt(Application.br.readLine());
            if (ProfileStore.INSTANCE.hasProfile(requestedId)) {
                profileView.setProfileModel(ProfileStore.INSTANCE.getProfileModel(requestedId));
                profileView.drawWithCanvas();


            } else {
                System.out.println("There is no crimes with this Id");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public ProfileModel getProfileModel() {
        return profileModel;
    }

    public void setProfileModel(ProfileModel profileModel) {
        this.profileModel = profileModel;
    }

    public ProfileView getProfileView() {
        return profileView;
    }

    public void setProfileView(ProfileView profileView) {
        this.profileView = profileView;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }
}
