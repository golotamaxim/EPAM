package com.javacore.profile;

import java.util.HashMap;

public enum  ProfileStore {
    INSTANCE;

    //private ProfileModel profileModel;
    private HashMap<Integer, ProfileModel> profiles;

    {
        profiles = new HashMap<>();
    }

    public void loadProfileData() {
        for (int i = 0; i < 10; i++) {
            ProfileModel profileModel = ProfileModel.randomModel();
            profiles.put(profileModel.getId(), profileModel);
        }
    }

    public void loadProfile(ProfileModel profileModel) {
        profiles.put(profileModel.getId(), profileModel);
    }

    public ProfileModel getProfileModel(int id) {
        return profiles.get(id);
    }

    public boolean hasProfile(int id) {
        return profiles.containsKey(id);
    }

}
