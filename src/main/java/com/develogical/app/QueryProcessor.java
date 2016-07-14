package com.develogical.app;

public class QueryProcessor {

    public String process(String query) {

        String str = query;
        int result;
        String[] aarray = str.split(" ");

        if (query.toLowerCase().contains("shakespeare")) {


            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("minus")) {

            result = Integer.parseInt(aarray[3]) - Integer.parseInt(aarray[5]) ;
            return String.valueOf(result);
        }

        if (query.toLowerCase().contains("plus")) {

            result = Integer.parseInt(aarray[3]) + Integer.parseInt(aarray[5]) ;
            return String.valueOf(result);
        }

        if (query.toLowerCase().contains("multiplied")) {

            result = Integer.parseInt(aarray[3]) * Integer.parseInt(aarray[5]) ;
            return String.valueOf(result);
        }
        return "";
    }
}

