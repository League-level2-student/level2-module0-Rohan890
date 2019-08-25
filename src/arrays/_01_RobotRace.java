package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Robot[] rob = new Robot[5];
	int x = 50;
	int y = 500;
	boolean finished = false;
	for (int i = 0; i < 5; i++) {
		rob[i] = new Robot();
		rob[i].setX(x);
		rob[i].setY(y);
		rob[i].setSpeed(100);
		x+=180;
	}

while(finished == false) {
	for (int i = 0; i < 5; i++) {
		Random rand = new Random(); 
		int value = rand.nextInt(50);
		rob[i].move(value);
		
		if(rob[i].getY()<=25) {
			finished = true;
			JOptionPane.showMessageDialog(null, "Robot " + i + " won!");
			break;
		}
		}

}

}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
