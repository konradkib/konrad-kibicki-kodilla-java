package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsSuite {

    @Test
    public void TestCalculateStatisticsMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentCount()).thenReturn(540);
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("Konrad"));

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(1.85,(calculateStatistics.getCountComments()/calculateStatistics.getCountPosts()),0.0001);

    }
}
