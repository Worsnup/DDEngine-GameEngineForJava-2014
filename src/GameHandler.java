// something something... update this with a description
// ----------
// Copyright (c) <2014> <Dalton Worsnup; Dalton Woodard>
// See LICENSE.md for details.

package gameEngine;

import gameEngine.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

public class GameHandler implements Runnable
{
   private int updatesPerSecond;
   private InputHandler inputHandler;

   public GameHandler(int updatesPerSecond, GraphicsHandler graphicsHandler)
   {
      this.updatesPerSecond = updatesPerSecond;
      this.inputHandler = new InputHandler(graphicsHandler);
   }

   @Override
   public void run()
   {
      long time;

      while(GameManager.isRunning())
      {
         time = System.currentTimeMillis();

         this.update();

         time = (1000 / this.updatesPerSecond) - (System.currentTimeMillis() - time);

         if(time > 0)
         {
            try
            {
               Thread.sleep(time);
            }
            catch(Exception e)
               {}
         }
      }
   }

   void update()
      {}
}