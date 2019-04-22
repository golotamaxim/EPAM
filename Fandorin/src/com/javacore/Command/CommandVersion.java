package com.javacore.command;

import com.javacore.Application;

public class CommandVersion implements ACommand {
    private String name;

    CommandVersion(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("This version is " + Application.VERSION);
    }
}
