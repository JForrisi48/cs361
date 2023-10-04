/**
 * 
 */
package circle;

/**
 * @author Jason Forrisi
 */

// TODO Complete the code --Complete??--

public class Circle extends GraphicObject implements Cloneable{

	// No use of encapsulation
	public double centerX, centerY;
	public double radius;
	public int windowNumber;
	
	/**
	 * 
	 */
	public Circle() {
	}

	// overloaded method in Circle
	// overridden method from GraphicObject
	@Override
	void draw() {
		System.out.println("Drawing a Circle...");
	}

	// overloaded method in Circle
	// Not overridden as it does follow the signature in GraphicObject
	public void draw(int color) {
		System.out.println("Drawing a Circle in color...");
	}

	public double circumference() {
		return 2.0 * 3.141529 * radius;
	}

	public double area() {
		return 3.141529 * radius * radius;
	}

	public boolean overlaps(Circle other) {
		return ((centerX - other.centerX) * (centerX - other.centerX)
				+ (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
						* (radius + other.radius));
	}

	@Override
	void moveTo(int newX, int newY) {
	}

	// TODO To complete -- Complete -- 
	/**
	 * @return the Circle with this EXACT format Circle: centerX = ... centerY = ... radius = ...
	 */
	@Override
	public String toString() {
		return ("Circle: centerX = " + centerX + " centerY = " + centerY + " radius = " + radius);
	}

	// TODO To complete --Complete--
	// TODO Be sure that you understand the difference between equals and == --Is there a task here?--
	/**
	 * @return true if this and obj have the same values for
	 * centerX, centerY and radius
	 */
	public boolean equals(Circle obj) {
		return (centerX == obj.centerX && centerY == obj.centerY && radius == obj.radius);
	}

	// TODO To complete --Complete--
	/**
	 * @return an exact copy of the Circle that is a new instance 
	 */
	 @Override
	 protected Object clone() throws CloneNotSupportedException {
		 Circle newCircle = (Circle) super.clone();
		 newCircle = new Circle();
		 newCircle.centerX = this.centerX;
		 newCircle.centerY = this.centerY;
		 newCircle.radius = this.radius;
		 return newCircle;
	 }

}
