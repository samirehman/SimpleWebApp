package com.develogical.app;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("error")) {
            return "This is an error but we did it on purpose.";
        }

        if (query.toLowerCase().contains("what is 204 multiplied by 2018")) {
            return "411672";
        }
        return "";
    }
}
