package com.javacore.bonya.commans;

import static com.javacore.bonya.Application.VERSION;

public class CommandVersion extends ACommand {

    public CommandVersion(String name) {
        super(name);

    }

    @Override
    public void execute() {
        System.out.println("My version is : " + VERSION);
    }
}
