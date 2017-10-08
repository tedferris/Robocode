package ics3u1;


import robocode.*;
import java.awt.Color;


public class Ferris_Ted_V12 extends Robot {

	boolean peek; // Don't turn if there's a robot there
	double moveAmount; // Defines how far to move


	public void run() {
		
		setBodyColor(Color.black);					// Defines colours of the robot
		setGunColor(Color.black);
		setRadarColor(Color.black);
		setBulletColor(Color.black);
		setScanColor(Color.black);
		
		
			getX();									
			getY();									// This still has a decent 															
													// margin for error, but is
			if(getX() < 1000 && getY() < 1000) {	// Far superior to Walls w/o this
				turnLeft(getHeading() + 90);
				ahead(1000);
			}
			if(getX() < 1000 && getY() > 1000) {
				turnLeft(getHeading());
				ahead(1000);
			}
			if(getX() > 1000 && getY() < 1000) {
				turnLeft(getHeading() + 180);
				ahead(1000);
		}
			if(getX() > 1000 && getY() > 1000) {
				turnLeft(getHeading());
				ahead(1000);
		}
		

		moveAmount = Math.max(getBattleFieldWidth(), getBattleFieldHeight());			  // Defines
																			 			  // moveamount as the Width or Height
		while(true) {																	  			 // of the battlefield
		
			if(getEnergy() > 70)
				{
						getHeading();
						turnLeft(getHeading());
						ahead(500);
						turnRight(45);
						ahead(500);
						turnRight(45);
						ahead(500);
						turnRight(45);
						ahead(500);
						turnRight(45);
						ahead(500);
						turnRight(45);
						ahead(500);
						turnRight(45);
						ahead(500);
						turnRight(45);
						ahead(500);
						turnRight(45);
		}
			else {
				
			

	
		peek = false;
	
		turnLeft(getHeading() % -90); // Moves towards a wall, defined as the nearest by the above code
		ahead(moveAmount);			  // Move ahead the length of the battlefield side
									
		peek = true;				  // If peek is true, then...
	

		turnRight(90);				  // Turn Right
		
	
			peek = true;			//'Peeks' before turning to make sure that there isn't a robot
				ahead(moveAmount);	// Moves up the wall
	
			peek = false;
				turnRight(90); // Turns right when it hits a wall
		}
	}
}
	public void onHitRobot(HitRobotEvent e) {
		
	
	doNothing();
	}
	

	public void onScannedRobot(ScannedRobotEvent e) {
		
		getEnergy();										// Gets energy
		e.getDistance();									// Gets distance to robot that was scanned
			if(getEnergy() > 75 && e.getDistance() < 100) { // If the robot is under 100 pixels and I have										             
				fire(3);									// more than 75 energy, then I fire with 3 power 
				}
			else if(getEnergy() < 75 && e.getDistance() < 75) {
				fire(1);
			}
			else {
				doNothing();
			
			e.getVelocity();
				if(e.getVelocity() == 0) {
					fire(2);
				}
				else {
					doNothing();
				}
		}
}
	public void onHitWall(HitWallEvent e) {
		
		scan();
	}
}
