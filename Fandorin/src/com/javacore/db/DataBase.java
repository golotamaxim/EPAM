package com.javacore.db;

import com.javacore.Application;
import com.javacore.command.ACommand;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class DataBase implements ACommand {

    private Object tableLock = new Object();

    Map<String, Table> tables;

    @Override
    public void execute() {
        System.out.println("Which data are you interested?");
        try {
            String query = Application.br.readLine();
            Query.dbCommunication(query);


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public List<Record> select() {
        synchronized (tableLock) {
            System.out.println("Starting selection records");
            try {
                Thread.sleep(500);
                System.out.println("Selection is finished");
            } catch (InterruptedException ex) {
            }
        }
        return null;
    }

    public void update() {

        System.out.println("Starting updating database");
        synchronized (tableLock) {
            try {
                Thread.sleep(10000);
                System.out.println("Updating is finished");
            } catch (InterruptedException ex) {

            }
        }

    }

    public void delete() {

    }

    public void insert(Table table, Record record) {


    }

    public static List<String[]> readDataFromFile(String fieldName) {
        FileInputStream fis = null;
        List<String[]> result = new ArrayList<>();
        BufferedReader br;
        try {
            fis = new FileInputStream(fieldName);
            br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while((line = br.readLine()) != null) {
                //System.out.println("Source line: " + line);
                if (line.indexOf("#") == -1){
                    result.add(line.split(";"));
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (NullPointerException ex) {
                ex.printStackTrace();
            }
        }
        return result;

    }
}
