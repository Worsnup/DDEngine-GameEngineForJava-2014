// something something... update with a description.
// ----------
// Copyright (c) <2014> <Dalton Worsnup; Dalton Woodard>
// See LICENSE.md for details.

package gameEngine;

import gameEngine.*;

public class GameManager
{
   private static boolean isRunning = false;

   private static StdRes res;
   private static String gameTitle;
   private static GraphicsHandler graphicsHandler;
   private static int updatesPerSecond;
   private static GameHandler gameHandler;


   /**
    * [main description]
    * @param args [description]
    */
   public static void main(String[] args)
   {
      res = StdRes.R640X480;
      gameTitle = "Game Title";
      graphicsHandler = new GraphicsHandler(res, gameTitle);

      updatesPerSecond = 30;
      gameHandler = new GameHandler(updatesPerSecond, graphicsHandler);

      run();
   }

   static void run()
   {
      isRunning = true;

      Thread graphics = new Thread(graphicsHandler, "Graphics Handler");
      Thread game = new Thread(gameHandler, "Game Handler");

      graphics.start();
      game.start();
   }

   public static boolean isRunning()
      {  return isRunning; }
}