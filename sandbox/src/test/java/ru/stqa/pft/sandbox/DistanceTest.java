package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTest  {

    @Test(testName = "Проверка расчета расстояния между двумя точками")
    public void testDistance() {
        Point p = new Point(4, 9);
        Assert.assertEquals(p.distance(), 3.605551275463989);
    }

    @Test
    public void testDistance1() {

    }
}
