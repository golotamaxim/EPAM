package com.javacore.command;

import com.javacore.Application;

public class CommandName implements ACommand {

    private String name;

    CommandName(String name) {
        this.name = name;

    }

    @Override
    public void execute() {
        System.out.println("This application name is " + Application.APP_NAME);

    }
}
