//package com.kodilla.testing.shape;
//
//import com.kodilla.testing.shape.*
//
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//public class ShapeCollectorTestSuite {
//    private static int counter = 1;
//
//    @Before
//    public void Before() {
//        System.out.println("Start testu nr " + counter);
//    }
//
//    @After
//    public void After() {
//        System.out.println("Koniec testu nr " + counter);
//        counter++;
//    }
//
//    @Test
//    public void testAddFigure() {
//        //given
//        ShapeCollector objShapeCollector = new ShapeCollector();
//        //when
//        Shape circle = new Circle(2.0);
//        boolean result = objShapeCollector.addFigure(circle);
//        //then
//        Assert.assertTrue(result);
//    }
//
//    @Test
//    public void testRemoveFigureExist() {
//        //given
//        ShapeCollector objShapeCollector = new ShapeCollector();
//        Shape circle = new Circle(2.0);
//        objShapeCollector.addFigure(circle);
//        //when
//        boolean result = objShapeCollector.removeFigure(circle);
//        //then
//        Assert.assertTrue(result);
//        Assert.assertEquals(0, objShapeCollector.shapesListSize());
//    }
//
//    @Test
//    public void testRemoveFigureObjectNotExist() {
//        //given
//        ShapeCollector objShapeCollector = new ShapeCollector();
//        Shape circle = new Circle(2.0);
//        Shape triangle = new Triangle(5.0, 5.0);
//        objShapeCollector.addFigure(circle);
//        //when
//        boolean result = objShapeCollector.removeFigure(triangle);
//        //then
//        Assert.assertFalse(result);
//    }
//
//    @Test
//    public void testGetFigureUnderIndex() {
//        //given
//        ShapeCollector objShapeCollector = new ShapeCollector();
//        Shape circle = new Circle(2.0);
//        objShapeCollector.addFigure(circle);
//        //when
//        Shape expectedFigure = objShapeCollector.getFigure(-1);
//        //then
//        Assert.assertEquals(null, expectedFigure);
//    }
//
//    @Test
//    public void testGetFigureAboveIndex() {
//        //given
//        ShapeCollector objShapeCollector = new ShapeCollector();
//        Shape circle = new Circle(2.0);
//        objShapeCollector.addFigure(circle);
//        //when
//        Shape expectedFigure = objShapeCollector.getFigure(123);
//        //then
//        Assert.assertEquals(null, expectedFigure);
//    }
//
//    @Test
//    public void testGetFigureIndex0() {
//        //given
//        ShapeCollector objShapeCollector = new ShapeCollector();
//        //when
//        Shape expectedFigure = objShapeCollector.getFigure(123);
//        //then
//        Assert.assertEquals(null, expectedFigure);
//    }
//    @Test
//    public void testShowFigures() {
//        //given
//        ShapeCollector objShapeCollector = new ShapeCollector();
//        Shape circle = new Circle(2.0);
//        objShapeCollector.addFigure(circle);
//        //when
//        //then
//        Assert.assertEquals(1, objShapeCollector.shapesListSize());
//        //   Assert.assertThat(objShapeCollector.showFigures(), CoreMatchers.hasItems("Circle 12.566370614359172"));
//    }
//}
