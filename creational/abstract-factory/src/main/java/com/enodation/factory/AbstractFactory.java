package com.enodation.factory;

import com.enodation.dto.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType) ;
}
