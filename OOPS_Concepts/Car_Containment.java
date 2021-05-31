package OOPS_Concepts;

public class Car_Containment {

	private String color;
	private int maxSpeed;

	public static void main(String[] args)
	{
		// Creating an object of Car class
		Car_Containment nano = new Car_Containment();

		// Assigning car object color
		nano.setColor("RED");

		// Assigning car object speed
		nano.setMaxSpeed(329);

		// Calling carInfo() over object of Car class
		nano.carInfo();

		// Creating an object of Maserati class
		Maserati quattroporte = new Maserati();

		// Calling MaseratiStartDemo() over
		// object of Maserati class
		quattroporte.MaseratiStartDemo();
	}

	public void setMaxSpeed(int maxSpeed)
	{
		// This keyword refers to current object itself
		this.maxSpeed = maxSpeed;
	}

	public void setColor(String color)
	{
		// This keyword refers to current object
		this.color = color;
	}

	public void carInfo()
	{
		// Print the car information - color and speed
		System.out.println("Car Color= " + color
						+ " Max Speed= " + maxSpeed);
	}
}

class Maserati extends Car_Containment {

	public void MaseratiStartDemo()
	{
		Engine MaseratiEngine = new Engine();
		MaseratiEngine.start();
		MaseratiEngine.stop();
	}
}

//Class 3
class Engine {

	public void start()
	{
		System.out.println("Started:");
	}

	public void stop()
	{
		// Print statement when engine stops
		System.out.println("Stopped:");
	}
}
