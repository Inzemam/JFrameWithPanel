import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;



import java.awt.Rectangle;



public class JFrameWithPanel {  

    public static void main(String[] args) {  
         
        JFrame frame = new JFrame("Frame With Panel");
      //  public Rectangle[][] Block = new Rectangle[10][10];
        
        
       Container contentPane = frame.getContentPane();  
   
       
        contentPane.setBackground(Color.CYAN); // ��JFrameʵ����������Ϊ����ɫ  
        
        JPanel panel = new JPanel(); // ����һ��JPanel��ʵ��  
        
        panel.setBackground(Color.yellow); // ��JPanel��ʵ����������Ϊ��ɫ  
       
      JButton button = new JButton("Press me");  
       
      panel.add(button); // ��JButtonʵ����ӵ�JPanel��  
        
   
  
 
    contentPane.add(new apaint());
    contentPane.add(panel, BorderLayout.EAST); // ��JPanelʵ����ӵ�JFrame���ϲ�  

        frame.setSize(300, 200);  
        frame.setVisible(true);
        
    }
  
}


class apaint extends JComponent {
	 Rectangle block =  new Rectangle(10, 10, 10, 10);

	   public void paint(Graphics g)
	    {
//	    g.setColor(Color.gray);
	    g.drawRect(10, 10, 40, 40);
//	    g.fillRect(10, 10, 10, 10);
//	    for(int y =0;y <20;y++){
//			for(int x=0;x<20;x++){
//				Block[y][x].draw(g);
//			}
//		}
	   // block.draw(g);
	    }
	}