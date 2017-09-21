package Robot1_Ferris;
import robocode.*;



public class Robot1_Ferris extends Robot
{


	public void run() {
			getHeading();
			turnLeft(getHeading());
		while(true) {
			ahead(250);
			turnGunRight(360);
			back(250);
			turnGunRight(360);
		}
			
		}


	public void onScannedRobot(ScannedRobotEvent e) {
		fire(2);
		fire(2);
		fire(2);
		fire(2);
		fire(2);
		turnLeft(180);
		ahead(250);
}


	public void onHitByBullet(HitByBulletEvent e) {

		turnLeft(90);
		ahead(250);
	}
	

	public void onHitWall(HitWallEvent e) {

		back(20);
		turnLeft(180);
		ahead(200);
	}
}