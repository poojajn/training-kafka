package com.training.bridge;



public class Triangle extends Shape{
   public Triangle(IColor color) {
	   super(color);
   }
   @Override
   public void applyColor() {
	   System.out.println("Triangle is appliece with color "+getColor());
	   getColor().applyColor();
   }
}
