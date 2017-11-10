package videogame;

public class Testador {

	public static void main(String[] args) {

		Wii wii = new Wii("Core 2 duo", 20, Midia.DVD);

		System.out.println(wii);

		Xbox xbox = new Xbox("celeron", 120, Midia.DVD, "Xbox 360");

		Kinect ximbinha = new Kinect("Kinect");

		xbox.setKinect(ximbinha);

		System.out.println(xbox);

	}

}
