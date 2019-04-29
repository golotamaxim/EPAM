package com.javacore.command;


import com.javacore.db.DataBase;
import com.javacore.profile.ProfileController;

import java.util.HashMap;
import java.util.Map;


public enum  CommandRegistry {
    INSTANCE;
    static Map<String, ACommand> commands;

    static {
        commands = new HashMap<>();
        commands.put("name", new CommandName("name"));
        commands.put("version", new CommandVersion("version"));
        commands.put("author", new CommandAuthor("author"));
        commands.put("creator", new CommandAuthor("creator"));
        commands.put("criminals", new ProfileController());
        commands.put("crime", new ProfileController());
        commands.put("query", new ProfileController());
        commands.put("db", new DataBase());
        commands.put("database", new DataBase());
    }

    public ACommand getCommand(String name) {
        return commands.get(name);
    }

    public boolean hasCommand(String name) {
        return commands.containsKey(name);
    }
}
