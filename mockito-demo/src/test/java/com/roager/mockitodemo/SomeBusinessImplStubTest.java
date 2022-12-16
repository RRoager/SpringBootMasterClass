package com.roager.mockitodemo;

import com.roager.mockitodemo.business.DataService;
import com.roager.mockitodemo.business.SomeBusinessImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessImplStubTest {

    @Test
    void findTheGreatestFromAllData_basicScenario() {
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(25, result, 0);
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {25, 15, 5};
    }
}
