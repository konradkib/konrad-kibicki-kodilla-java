package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsSuite {

    @Test
    public void TestCalculateStatisticsMock_01() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postCount()).thenReturn(100);
        when(statisticsMock.commentCount()).thenReturn(5);

        when(statisticsMock.usersNames()).thenReturn(Arrays.asList());

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, calculateStatistics.getCountUsers());
        Assert.assertEquals(100, calculateStatistics.getCountPosts());
        Assert.assertEquals(5, calculateStatistics.getCountComments());
        Assert.assertEquals(0.05, calculateStatistics.getAvgCommentsPerPost(),0.001);
        Assert.assertEquals(Infinity, calculateStatistics.getAvgCommentsPerUser(),0.001);
        Assert.assertEquals(Infinity, calculateStatistics.getAvgPostsPerUser(),0.001);

    }

    @Test
    public void TestCalculateStatisticsMock_02() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(Stream
                .iterate(0, n -> n +1)
                .limit(100)
                .map(i->i.toString())
                .collect(Collectors.toList())
        );

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, calculateStatistics.getCountUsers());
        Assert.assertEquals(1000, calculateStatistics.getCountPosts());
        Assert.assertEquals(0, calculateStatistics.getCountComments());
        Assert.assertEquals(0, calculateStatistics.getAvgCommentsPerPost(),0.001);
        Assert.assertEquals(0, calculateStatistics.getAvgCommentsPerUser(),0.001);
        Assert.assertEquals(10, calculateStatistics.getAvgPostsPerUser(),0.001);

    }

    @Test
    public void TestCalculateStatisticsMock_03() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postCount()).thenReturn(15);
        when(statisticsMock.commentCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(Stream
                .iterate(0, n -> n +1)
                .limit(100)
                .map(i->i.toString())
                .collect(Collectors.toList())
        );

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, calculateStatistics.getCountUsers());
        Assert.assertEquals(15, calculateStatistics.getCountPosts());
        Assert.assertEquals(1000, calculateStatistics.getCountComments());
        Assert.assertEquals(66.66, calculateStatistics.getAvgCommentsPerPost(),0.01);
        Assert.assertEquals(10, calculateStatistics.getAvgCommentsPerUser(),0.001);
        Assert.assertEquals(0.15, calculateStatistics.getAvgPostsPerUser(),0.001);

    }

    }

