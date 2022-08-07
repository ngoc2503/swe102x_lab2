package com.swe102x.myinterface;

import com.swe102x.myclass.Circle;
import com.swe102x.myclass.CompoundShape;
import com.swe102x.myclass.Dot;
import com.swe102x.myclass.Rectangle;

public interface Visitor {

	String visitDot(Dot dot);

	String visitorCircle(Circle circle);

	String visitorRectangle(Rectangle rectangle);

	String visitorCompoundGraphic(CompoundShape compoundShape);

}
