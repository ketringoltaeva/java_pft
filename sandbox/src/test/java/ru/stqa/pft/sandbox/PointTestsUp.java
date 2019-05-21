package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTestsUp {

    @Test
    public void testDistance(){
        Point p1 = new Point(-2,8);
        Point p2 = new Point(5,0.2);
        Assert.assertEquals(p1.distance(p2), 10.480458005259122);

    }
}
