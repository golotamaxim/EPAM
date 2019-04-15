package com.javacore.bonya.db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Table {

    protected String name;

    protected List<String> columns;

    protected List<Record> records;

    {
        records = new ArrayList<Record>();
    }


    public Table(String name, List<String> columns) {
        this.name = name;
        this.columns = columns;
    }

    public void insert (Record record) {
        records.add(record);
    }

    public List<String> selectField(String fieldName) {
        int index = columns.indexOf(fieldName);
        Iterator it = records.iterator();
        List<String> result = new ArrayList<>();
        while (it.hasNext()) {
            Record r = (Record) it.next();
            result.add(r.values.get(index));
        }


        return result;
    }

    //"SELECT ID, firstName, lastName;
    public void select (String query){} // accomplish for 2 second; by Thread; show loading indicator;

    //------------------
    //ID: firstName  lastName
    //1    Vladimir   Trump


}
