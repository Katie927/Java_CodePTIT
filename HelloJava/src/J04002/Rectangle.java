package J04002;

public class Rectangle {
	private double width;
	private double height;
	private String color;
	
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	public Rectangle(double width, double height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public String getColor() {
		return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
	}
	
	public double findArea() {
        return width * height;
    }

    public double findPerimeter() {
        return 2 * (width + height);
    }
    
    public String toString() {
        return String.format("%d %d %s", (int) findPerimeter(), (int) findArea(), getColor());
    }
}
