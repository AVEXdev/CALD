package com.avexdev.cald;

import android.app.Application;

import com.avexdev.cald.models.User;

public class UserClient extends Application {

    private User user = null;

    public User getUser() { return user; }

    public void setUser(User user) {
        this.user = user;
    }
}
