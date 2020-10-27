package com.koilla.patterns.singleton;

import com.kodilla.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        //When
        Logger.getInstance().log("log1");
        Logger.getInstance().log("log2");
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("log2", lastLog);
    }
}
