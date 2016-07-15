package com.develogical.app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }


    @Test
    public void minus() throws Exception {
        assertThat(queryProcessor.process("74b50d00: what is 9 minus 11"), is("-2"));
    }

    @Test
    public void plus() throws Exception {
        assertThat(queryProcessor.process("1adae200: what is 9 plus 2"), is("11"));
    }

    @Test
    public void multiply() throws Exception {
        assertThat(queryProcessor.process("1adae200: what is 9 multiplied 2"), is("18"));
    }
    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }
}
