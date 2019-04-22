package com.javacore.command;

import com.javacore.Application;


public class CommandAuthor implements ACommand {
    private String name;

    CommandAuthor(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Author's name is " + Application.AUTHOR);
    }
}
