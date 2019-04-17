package com.javacore.bonya;

import com.javacore.bonya.db.Table;

import com.javacore.bonya.db.Record;
import java.util.ArrayList;
import java.util.List;

public class Application {


    public static final String VERSION = "0.0.1";
    public static final String AUTHOR = "Golota Maksim";
    public static final String APP_NAME = "Bonya";


    public static void main(String[] args) {

        //ConsolCanvas cc = new ConsolCanvas(50,50);
        //cc.drawSquareAt(4,3,5);

        List<String> columns = new ArrayList<>();
        columns.add("ID");
        columns.add("firstName");
        columns.add("lastName");


        Table criminalTable = new Table("Criminals", columns);
        List<String> values = new ArrayList<>();
        values.add("1");
        values.add("Vladimir");
        values.add("Trump");
        //Record criminal = new Record(values);
        List<String> values2 = new ArrayList<>();
        values2.add("2");
        values2.add("Donald");
        values2.add("Timoshenko");
        criminalTable.insert(new Record(values));
        criminalTable.insert(new Record((values2)));

        List<String> result = criminalTable.selectField("firstName");
        for (String s : result) {

            System.out.println(s);
        }

    }
}
