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


public class FetchKarel extends SuperKarel
{
    public void run()
    {
        path()
        takeBall();
        turnAround()
        path()
        putBall();
        turnAround()
        
    }
    public void path()
    {
        move();
        turnLeft();
        for(int i = 0; i<4;i++)
        {
            move();
        }
        turnRight();
        move();
    }
    public void turnAround()
    {
        turnRight();
        turnRight();
    }
    
    
}
