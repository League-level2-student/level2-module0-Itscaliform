package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Robot[] rob= new Robot[7];
	rob[2] = new Robot();
	rob[3] = new Robot();
	rob[4] = new Robot();
	rob[5] = new Robot();
	rob[6] = new Robot();


	//3. use a for loop to initialize the robots.
for(int i=0; i>rob.length; i++) {
	rob[i].show();
	rob[i].penDown();
	rob[i].setSpeed(10);
	
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
rob[2].moveTo(100, 560);
rob[3].moveTo(300, 560);
rob[4].moveTo(500, 560);
rob[5].moveTo(700, 560);
rob[6].moveTo(850, 560);
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random randy= new Random(50);

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

boolean Finished= false;

while(!Finished) {
	for(int i=0; i< rob.length; i++) {
	rob[2].move(randy.nextInt(50));
	rob[3].move(randy.nextInt(50));
	rob[4].move(randy.nextInt(50));
	rob[5].move(randy.nextInt(50));
	rob[6].move(randy.nextInt(50));
	}
	if(rob[2].getY()<=0|| rob[3].getY()<=0||rob[4].getY()<=0||rob[5].getY()<=0||rob[6].getY()<=0) {
		Finished=true;
	}
		
	
}
		
		

	
	

	//7. declare that robot the winner and throw it a party!
JOptionPane.showMessageDialog(null, "Number 3 won");
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
