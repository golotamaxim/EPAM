package com.javacore.state;

import com.javacore.Application;
import com.javacore.command.CommandRegistry;

public class IdleState implements AppState {
    String command;

    public IdleState() {
        System.out.println("Entering idle state");
    }

    @Override
    public void enter(String query) {
        if (CommandRegistry.INSTANCE.hasCommand(query)) {
            System.out.println("Command " + query + " reicived. Start to execute");
            Application.state = new ExecutingState();
            ((ExecutingState) Application.state).execute(query);
        } else {
            System.out.println("This command is not implemented yet"); //create new anonimous class of ACommand
        }

    }
}
