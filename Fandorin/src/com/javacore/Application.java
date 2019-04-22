package com.javacore;

import com.javacore.common.Canvas;
import com.javacore.common.ConsoleCanvas;
import com.javacore.db.DataBase;
import com.javacore.db.Record;
import com.javacore.db.Table;
import com.javacore.profile.ProfileController;
import com.javacore.profile.ProfileView;
import com.javacore.state.AppState;
import com.javacore.state.IdleState;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static final String APP_NAME = "Virtual Criminalist Erast Fandorin";
    public static final String AUTHOR = "Golota Maksim";
    public static final String VERSION = "0.0.1";
    public static AppState state = new IdleState();
    public static ProfileController profilecontroller;
    public static BufferedReader br;

    public static AppState getState() {
        return state;
    }

    public static void setState(AppState state) {
        Application.state = state;
    }

    public static void main(String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));

        List<String[]> records = DataBase.readDataFromFile("C:\\Users\\Голота\\Documents\\CrimeFamily Data.txt");
        Table criminals = new Table("Criminals", Arrays.asList(new String[]{"id", "firstName", "lastName", "nickname", "crimeFamilyId", "dateOfBirth", "deceased", "dateOfDeath", "numberOfCrimes"}));
        for (String[] s : records) {
            Record rec = new Record(criminals);
            rec.setValues(s);
            criminals.insert(rec);
        }

        System.out.println();
        ProfileView pv = new ProfileView();
        pv.getCanvas().drawText("12");




        //Scanner scanner = new Scanner(System.in);
        //profilecontroller = new ProfileController();


        while (true) {
            String query = null;
            try {
                query = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (query.isEmpty()||query.equals("exit")) {
                System.out.println("Sincirely yours " + APP_NAME);
                break;
            } else {
                state.enter(query);

            }
            //setState(new ExecutingState());
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
