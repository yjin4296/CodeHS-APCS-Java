/*---------------------------------------------------------*\
|                Created by Tannre Overly - 2018            |
|-----------------------------------------------------------|
|   WARNING -   WARNING -   WARNING -   WARNING -   WARNING |
|-----------------------------------------------------------|
|   It is highly recommended that you attempt to solve your |
| problems before using work provided here in order to      |
| actually learn from your mistakes. Try to use this only to|
| review or compare your own work.                          |
|_______________________Good_Luck___________________________|*/


public class TwoTowersKarel extends Karel
{

	public void run()
	{
		move();
		buildTower();
		returnToFloor();
		move();
		move();
		buildTower();
		move();
		turnLeft();
		turnAround();
	}
	public void buildTower()
	{
	    turnLeft();
	    putBall();
	    move();
	    putBall();
	    move();
	    putBall();
	    
	    
	}
	public void turnAround()
	{
	    turnLeft();
	    turnLeft();
	}
	public void returnToFloor()
	{
	    turnAround();
        move();
        move();
        turnLeft()
	}

}
