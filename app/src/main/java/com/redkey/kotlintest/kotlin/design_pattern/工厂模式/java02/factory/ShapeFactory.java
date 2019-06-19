package com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java02.factory;

import com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java02.impl.Shape;
import com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java02.modle.Circle;
import com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java02.modle.Rectangle;
import com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java02.modle.Square;

public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
