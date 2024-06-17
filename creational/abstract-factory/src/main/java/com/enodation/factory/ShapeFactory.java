package com.enodation.factory;

import com.enodation.dto.Rectangle;
import com.enodation.dto.Shape;
import com.enodation.dto.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
