package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTestsDown {

    @Test
    public void testDistance(){
        Point p1 = new Point(3,4);
        Point p2 = new Point(5,7);
        Assert.assertEquals(p1.distance(p2), 3.60);

    }
}
