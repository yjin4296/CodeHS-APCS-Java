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


/* Write a program to lay a row of tennis balls
 * across first street. Make sure to test your
 * program on multiple worlds. */
public class TennisBallRowKarel extends SuperKarel
{
    public void run()
    {
        while(frontIsClear())
        {
            putBall();
            move();
        }
        putBall();
        // your code here 
    }
}
