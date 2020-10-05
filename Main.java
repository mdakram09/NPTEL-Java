class Cube {
    public double a;
    public Cube(double a) {
        this.a = a;
    }
    
    public void volume() {
        double result = a * a * a;
        System.out.println("The volume of Cube :- " + result);
    }
}

class Sphere {
    public double r;
    public Sphere(double r) {
        this.r = r;
    }
    
    public void volume() {
        double result = (4 * Math.PI *Math.pow(r, 3))/3;
        System.out.println("The volume of Sphere :- " + Math.round(result*100.0)/100.0);
    }
}

class Cylinder {
    public double r;
    public double h;
    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }
    
    public void volume() {
        double result = Math.PI * r * r *h;
        System.out.println("The volume of Cylinder :- " + Math.round(result*100.0)/100.0);
    }
}

public class Main
{
	public static void main(String[] args) {
		Cylinder c = new Cylinder(2, 5);
		c.volume();
		Sphere s = new Sphere(5);
		s.volume();
		Cube cu = new Cube(2);
		cu.volume();
	}
}