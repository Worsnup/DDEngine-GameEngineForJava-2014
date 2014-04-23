// something something... update with a description.
// ----------
// Copyright (c) <2014> <Dalton Worsnup; Dalton Woodard>
// See LICENSE.md for details.

package gameEngine;

import gameEngine.*;

import java.awt.Component;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent; 

public class InputHandler implements KeyListener
{
   private boolean[] keys = new boolean[256];

   public InputHandler(Component c)
   {
      c.addKeyListener(this);
   }

   public boolean isKeyDown(int key)
   {
      try
      {
         return keys[key];
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         return false;
      }
   }

   @Override
   public void keyPressed(KeyEvent event)
   {
      try
      {
         keys[event.getKeyCode()] = true;
      }
      catch(ArrayIndexOutOfBoundsException e)
         {}
   }

   @Override
   public void keyReleased(KeyEvent event)
   {
      try
      {
         keys[event.getKeyCode()] = false;
      }
      catch(ArrayIndexOutOfBoundsException e)
         {}
   }

   @Override
   public void keyTyped(KeyEvent event)
   {

   }
}