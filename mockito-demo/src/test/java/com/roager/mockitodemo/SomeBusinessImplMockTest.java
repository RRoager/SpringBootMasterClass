package com.roager.mockitodemo;

import com.roager.mockitodemo.business.DataService;
import com.roager.mockitodemo.business.SomeBusinessImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    void findTheGreatestFromAllData_basicScenario() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25, 15, 5});
        assertEquals(25, businessImpl.findTheGreatestFromAllData(), 0);
    }

    @Test
    void findTheGreatestFromAllData_oneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {35});
        assertEquals(35, businessImpl.findTheGreatestFromAllData(), 0);
    }

    @Test
    void findTheGreatestFromAllData_emptyArray() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData(), 0);
    }
}