package com.roager.mockitodemo.list;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListTest {

    @Test
    public void simpleTest() {
        List listMock = mock(List.class);

        when(listMock.size()).thenReturn(3);

        assertEquals(3, listMock.size(), 0);
    }

    @Test
    public void multipleReturns() {
        List listMock = mock(List.class);

        when(listMock.size()).thenReturn(1).thenReturn(2);

        assertEquals(1, listMock.size(), 0);
        assertEquals(2, listMock.size(), 0);
    }

    @Test
    public void specificParameters() {
        List listMock = mock(List.class);

        when(listMock.get(0)).thenReturn("SomeString");

        assertEquals("SomeString", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    public void genericParameters() {
        List listMock = mock(List.class);

        when(listMock.get(Mockito.anyInt())).thenReturn("SomeOtherString");

        assertEquals("SomeOtherString", listMock.get(0));
        assertEquals("SomeOtherString", listMock.get(1));
    }
}
