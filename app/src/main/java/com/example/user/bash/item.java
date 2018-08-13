package com.example.user.bash;

public class item {


    int background;
    String itemTitle;
    int profilephoto;
    int nbFollowers;

    public item() {
    }

    public item(int background, String profileName, int profilephoto, int nbFollowers) {
        this.background = background;
        this.itemTitle = profileName;
        this.profilephoto = profilephoto;
        this.nbFollowers = nbFollowers;
    }

    public int getBackground() {
        return background;
    }

    public String getProfileName() {
        return itemTitle;
    }

    public int getProfilephoto() {
        return profilephoto;
    }

    public int getNbFollowers() {
        return nbFollowers;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public void setProfileName(String profileName) {
        this.itemTitle = profileName;
    }

    public void setProfilephoto(int profilephoto) {
        this.profilephoto = profilephoto;
    }

    public void setNbFollowers(int nbFollowers) {
        this.nbFollowers = nbFollowers;
    }
}
