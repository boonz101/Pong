import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Timer;
import javax.swing.JPanel;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class PongPanel extends JPanel implements ActionListener, KeyListener {
	
	public static final Color BACKGROUND_COLOR = Color.BLACK;
	public static final int TIMER_DELAY = 5;
	
	public PongPanel()
	{
		setBackground(BACKGROUND_COLOR);
		Timer timer = new Timer(TIMER_DELAY, this);
		timer.start();
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.fillRect(20, 20, 100, 100);
	}
	
	@Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(ActionEvent event)
	{
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

}
