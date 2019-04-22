package com.javacore.command;

import java.io.IOException;

public interface ACommand {
    default void execute () {
        System.out.println("This command are not implemented.");
    }
}
