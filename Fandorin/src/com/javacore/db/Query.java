package com.javacore.db;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Query {


    private static String query1 = "";
    String table = "";


    public static void setQuery1(String query1) {
        Query.query1 = query1;
    }

    public static final String OP_GROUP = "(SELECT|DELETE)";
    public static final String FLD_GROUP = "([a-zA-Z, ]+)+";
    public static final String SPACE = "([\\s])";
    public static final String FROM_GROUP = "(FROM)";
    public static final String TBL_GROUP = "([a-zA-Z]+)";

    static Pattern pattern = Pattern.compile(OP_GROUP + SPACE + FLD_GROUP + SPACE + FROM_GROUP + SPACE + TBL_GROUP);


    public static void dbCommunication (String query1) {
        Matcher matcher = pattern.matcher(query1);
        if (matcher.find()) {
            System.out.println("Number of groups: " + matcher.groupCount());
        }
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }
}
