
package Game;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class GameFrame extends JFrame 
{
    private GamePanel game;
    public GameFrame()
    {
        
        super("Space Intruders");
        
        
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        
        game = new GamePanel();
        game.setDoubleBuffered(true);
        
        this.getContentPane().add(game); 
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        
        game.start();  
    }
    
    public static void main(String[] args) 
    {
         java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameFrame().setVisible(true);
            }
        });
        
    }
}
