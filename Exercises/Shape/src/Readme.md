// TODO: Create a Circle class that extends Shape
// The Circle class should have a private double radius attribute and a constructor to initialize it
// It should also implement the calculateArea() method 

// TODO: Create a Rectangle class that extends Shape
// The Rectangle class should have private double attributes for length and width, and a constructor to initialize them
// It should also implement the calculateArea() method 





In this exercise, we are using inheritance and abstract classes. The Shape class is an abstract class and it is extended by the Circle and Rectangle classes.

    super(name) is used to call the constructor of the superclass, Shape. This is required as the first statement in the constructors of Circle and Rectangle.

    Math.PI is a constant that represents the value of PI, approximately 3.14159. It is used to calculate the area of a circle.

    calculateArea() is an abstract method in Shape and it is implemented (overridden) in the Circle and Rectangle classes.

    The this keyword refers to the current object, and it's used to access the object's attributes.