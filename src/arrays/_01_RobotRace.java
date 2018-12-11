package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Robot[] rob= new Robot[6];


	//3. use a for loop to initialize the robots.
for(int i=0; i>rob.length; i++) {
	rob[i].penDown();
	rob[i].setSpeed(15);
	
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
rob[2].moveTo(10, 10);
rob[3].moveTo(20, 10);
rob[4].moveTo(30, 10);
rob[5].moveTo(40, 10);
rob[6].moveTo(50, 10);
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random randy= new Random();

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	
	for(int i=0; i>rob.length; i++) {
		
		rob[i].move(randy.nextInt(50));
		
	}
	
	

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
