import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallPanel extends JPanel {

    private Ball ball = new Ball(250, 250, 30, 9, Color.CYAN);

    public BallPanel(){
       setBackground(Color.BLACK);
       setFocusable(true);
       addKeyListener(new KeyListener() {
           @Override
           public void keyTyped(KeyEvent e) {

           }

           @Override
           public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 38|| e.getKeyCode() == 87){
                    ball.moveUp();
                }

               if (e.getKeyCode() == 40|| e.getKeyCode() == 83){
                    ball.moveDown(BallPanel.this);
               }

               if (e.getKeyCode() == 39|| e.getKeyCode() == 68){
                   ball.moveRight(BallPanel.this);
               }

               if (e.getKeyCode() == 37 || e.getKeyCode() == 65){
                   ball.moveLeft(BallPanel.this);
               }
           }

           @Override
           public void keyReleased(KeyEvent e) {

           }
       });
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        ball.drawBall(g);

        repaint();
    }
}
