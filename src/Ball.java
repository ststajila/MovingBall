import javax.swing.*;
import java.awt.*;
public class Ball {
    private int x, y, size, speed;
    private Color color;

    public Ball(int x, int y, int size, int speed, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        this.speed = speed;
    }

    public void drawBall(Graphics g){
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }

    public void moveUp(){
       if (y > 0) {
           y -= speed;
       }
    }

    public void moveDown(JPanel panel){
        if(y < panel.getHeight() - size) {
            y += speed;
        }
    }

    public void moveRight(JPanel panel){
        if (x < panel.getWidth() - size) {
            x += speed;
        }
        else{
            x = 0;
        }
    }

    public void moveLeft(JPanel panel){
       if (x > 0) {
           x -= speed;
       }
       else{
           x = panel.getWidth() - size;
       }

    }

}
