public class Wall {
    double width;
    double height;
    public Wall(double width, double height) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 0; // Ensure width is not negative
        }
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 0; // Ensure height is not negative
        }
    }
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 0; // Ensure width is not negative
        }
    }
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 0; // Ensure height is not negative
        }
    }
    public double getArea(){
        return this.width*this.height;
    }
}
