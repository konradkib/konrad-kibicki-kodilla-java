package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorSuite {

    @Test
    public void TestCalculateStatisticsMock() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentCount()).thenReturn(540);
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("Konrad"));

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.54, statisticsCalculator.getAvgCommentsPerPost(), 0.0001);
        Assert.assertEquals(0.54, statisticsCalculator.getAvgCommentsPerUser(), 0.0001);
        Assert.assertEquals(0.54, statisticsCalculator.getCountComments(), 0.0001);
        //....
        Assert.assertEquals(0.54, statisticsCalculator.getAvgCommentsPerPost(), 0.0001);
        Assert.assertEquals(0.54, statisticsCalculator.getAvgCommentsPerPost(), 0.0001);
        Assert.assertEquals(0.54, statisticsCalculator.getAvgCommentsPerPost(), 0.0001);

    }

    @Test
    public void TestCalculateStatisticsMockWhen() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postCount()).thenReturn(500000);
        when(statisticsMock.commentCount()).thenReturn(1);

        List<String> users = new LinkedList<>();
        for(int i = 0 ; i< 1000 ; i++){
            users.add(String.valueOf(i));
        }

        when(statisticsMock.usersNames()).thenReturn(users);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(2/3, 0.66666, 0.1);
        Assert.assertEquals(0.54, statisticsCalculator.getAvgCommentsPerUser());
        Assert.assertEquals(0.54, statisticsCalculator.getCountComments(), 0.0001);
        //....
        Assert.assertEquals(0.54, statisticsCalculator.getAvgCommentsPerPost(), 0.0001);
        Assert.assertEquals(0.54, statisticsCalculator.getAvgCommentsPerPost(), 0.0001);
        Assert.assertEquals(0.54, statisticsCalculator.getAvgCommentsPerPost(), 0.0001);

    }
}
