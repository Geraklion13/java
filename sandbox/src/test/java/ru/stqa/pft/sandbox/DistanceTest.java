package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTest  {

    @Test(testName = "Проверка расчета расстояния между двумя точками")
    public void testDistance() {
        Point p1 = new Point(4, 9);
        Point p2 = new Point(5,3);
        Assert.assertEquals(p1.distance(p2), 6.082762530298219);
    }
}
