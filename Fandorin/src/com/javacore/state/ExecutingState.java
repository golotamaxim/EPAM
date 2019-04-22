package com.javacore.state;

import com.javacore.Application;
import com.javacore.command.ACommand;
import com.javacore.command.CommandRegistry;


public class ExecutingState implements AppState {
    @Override
    public void enter(String query) {
        System.out.println("App is busy. Please ask again later.");



    }
    void execute(String query){
        ACommand command = CommandRegistry.INSTANCE.getCommand(query);
        command.execute();
        Application.state = new IdleState();
    }
}
