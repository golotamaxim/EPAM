package com.javacore.bonya.commans;

import static com.javacore.bonya.Application.AUTHOR;

public class CommandAuthor extends ACommand {

    public CommandAuthor(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("My author is " + AUTHOR);
    }
}
