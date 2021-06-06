package com.spring.spring.assignment;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape  {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context = null;

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public Triangle() {
        System.out.println("Triangle initialised");
    }

    public void setPointC(Point pointC) {
        System.out.println("setted Triangle");
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    @Override
    public void draw(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }
    public void myInit() {
        System.out.println("Initialising init method called for triangle");
    }

    public void myDestroy() throws Exception {
        System.out.println("Initialising Destroy method called for triangle");

    }

    /*@Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialising init method called for triangle");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Initialising Destroy method called for triangle");

    }*/
}
