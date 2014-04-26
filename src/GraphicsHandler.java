// something something... update with a description.
// ----------
// Copyright (c) <2014> <Dalton Worsnup; Dalton Woodard>
// See LICENSE.md for details.

package gameEngine;

import gameEngine.*;

import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.Insets;
import javax.swing.JFrame;

public class GraphicsHandler extends JFrame implements Runnable
{
   private int windowWidth;
   private int windowHeight;
   private Insets insets;
   private BufferedImage backBuffer;

   public GraphicsHandler(StdRes res, String gameTitle)
   {
      this.windowWidth = res.getWidth();
      this.windowHeight = res.getHeight();

      this.setTitle(gameTitle);
      this.setSize(windowWidth, windowHeight);
      this.setResizable(false);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setVisible(true);

      this.insets = getInsets();
      this.setSize(
         this.insets.left + this.windowWidth + this.insets.right,
         this.insets.top + this.windowHeight + this.insets.bottom
      );

      this.backBuffer = new BufferedImage(
         this.windowWidth,
         this.windowHeight,
         BufferedImage.TYPE_INT_RGB
      );
   }

   @Override
   public void run()
   {
      while(GameManager.isRunning())
         {  this.drawFinal(); }
      setVisible(false);
   }

   private void drawFinal()
   {
      Graphics g = this.getGraphics();
      Graphics bbg = this.backBuffer.getGraphics();
      this.draw(bbg);

      g.drawImage(
         this.backBuffer,
         this.insets.left,
         this.insets.top,
         this
      );
   }

   void draw(Graphics g)
      {}
}