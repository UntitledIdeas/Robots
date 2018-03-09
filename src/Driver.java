import kareltherobot.*;

public class Driver implements Directions{
	static Robot robbie;
	static Robot bobbie;
	static Robot lobbie;
	static Robot door;
	static Robot filler;
	static Robot eraser;
	public static void main(String[] args) {

		robbie = new Robot(1,5,East,infinity);
		bobbie = new Robot(1,1,East,infinity);
		lobbie = new Robot(1,1,East,infinity);
		door = new Robot(1,4,North,infinity);
		World.setVisible(true);
		World.setDelay(50);


		String qwert = "We Shall Build A house!!!!!!!!!!!!!!!!!!!!!!!!!!";
		System.out.print(qwert);
		lobbie.turnLeft();
		lobbie.move();
		lobbie.move();
		lobbie.move();
		lobbie.move();

		bobbie.move();
		bobbie.move();
		bobbie.move();
		bobbie.move();



		int x= 0;

		while(x<3) {
			robbie.putBeeper();
			robbie.move();
			robbie.putBeeper();
			robbie.move();
			robbie.putBeeper();
			robbie.move();
			robbie.putBeeper();
			robbie.move();
			robbie.turnLeft();
			x++;
		}
		bobbie.turnLeft();
		bobbie.turnLeft();
		int y= 0;
		while(y<3) {

			bobbie.putBeeper();
			bobbie.move();
			bobbie.putBeeper();
			bobbie.move();
			bobbie.putBeeper();
			bobbie.move();
			bobbie.putBeeper();
			bobbie.move();
			turnRight();
			y++;
		}
		int z= 0;

		while(z<4) {

			turnUp();
			lobbie.move();
			lobbie.turnLeft();
			lobbie.move();
			lobbie.putBeeper();
			z++;
		}

		int h= 0;
		turnUp();
		while(h<4) {


			lobbie.move();
			turnUp();
			lobbie.move();
			lobbie.putBeeper();
			lobbie.turnLeft();
			h++;
		}

		int s= 0;
		while(s<3) {

			door.move();
			door.putBeeper();
			door.move();
			door.putBeeper();
			turnAwesome();
			s++;
		}
		door.move();
		turnAwesome();
		door.move();
		door.move();
		door.move();
		door.move();
		turnAwesome();
		turnAwesome();
		/*for(int x=0; x<4;x++) {
			for(int y=0; y<4;y++) {
				bobbie.putBeeper();
				bobbie.move();

			}
			bobbie.turnLeft();
		}*/


	}
	public static void turnRight() {
		bobbie.turnLeft();
		bobbie.turnLeft();
		bobbie.turnLeft();
	}
	public static void turnUp() {
		lobbie.turnLeft();
		lobbie.turnLeft();
		lobbie.turnLeft();
	}
	public static void turnAwesome() {
		door.turnLeft();
		door.turnLeft();
		door.turnLeft();
	}
}
