class Cube{
	double a;
	Cube(double a){
		this.a = a;
	}

	double volume(){
		return a*a*a;
	}
}

class Sphere{
	double r;
	Sphere(double r){
		this.r = r;
	}
	double volume(){
		return (4 * 3.14 * r * r * r)/3;
	}
}

class Cylinder{
	double r, h;
	Cylinder(double r, double h){
		this.r = r;
		this.h = h;
	}
	double volume(){
		return (3.14 * r * r * h);
	}
}


class Volume{
	public static void main(String args[]){
		Cube c = new Cube(3.0);
		Sphere s = new Sphere(4.0);
		Cylinder cy = new Cylinder(3.0, 5.0);
		System.out.println("Volume of cube: " + c.volume());
		System.out.println("Volume of sphere: " + s.volume());
		System.out.println("Volume of cylinder: " + cy.volume());
	}
}