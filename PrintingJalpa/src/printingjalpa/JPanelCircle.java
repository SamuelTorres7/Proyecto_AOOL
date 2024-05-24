/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printingjalpa;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author samue
 */
public class JPanelCircle extends JPanel {
    private boolean selected;
    public JPanelCircle(){
        selected=false;
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        int width = this.getWidth();
        int height = this.getHeight();
        int radius = Math.min(width,height)/2;
        g2.fillOval(0, 0, width, height);
    }
    // Cambia el estado del pseudoboton del panel //
    public void setSelected(boolean selection){
        selected = selection;
    }
    public boolean isSelected(){
        return selected;
    }
}
