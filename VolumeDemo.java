// Class to demonstrate constructor overloading
class Volume {
    double volume;

    // Constructor with one argument (Cube)
    Volume(double side) {
        volume = side * side * side;
        System.out.println("Volume of Cube: " + volume);
    }

    // Constructor with two arguments (Cylinder)
    Volume(double radius, int height) {
        volume = 3.1416 * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);
    }

    // Constructor with three arguments (Cuboid)
    Volume(double length, double breadth, double height) {
        volume = length * breadth * height;
        System.out.println("Volume of Cuboid: " + volume);
    }
}

// Main class
public class VolumeDemo {
    public static void main(String[] args) {
        System.out.println("✨ Volume Calculation Using Constructor Overloading ✨\n");

        Volume cube = new Volume(5);                 // One argument
        Volume cylinder = new Volume(3.5, 10);       // Two arguments
        Volume cuboid = new Volume(4.2, 3.1, 6.5);   // Three arguments
    }
}
