// something something... update with a description.
// ----------
// Copyright (c) <2014> <Dalton Worsnup; Dalton Woodard>
// See LICENSE.md for details.

package gameEngine;

import gameEngine.*;

public enum StdRes
{
   R640X480 (648, 480),
   R800X600 (800, 600),
   R768X1024 (768, 102),
   R1024X600 (1024, 600),
   R1024X768 (1024, 768),
   R1093X614 (1093, 614),
   R1152X864 (1152, 864),
   R1280X720 (1280, 720),
   R1280X768 (1280, 768),
   R1280X800 (1280, 800),
   R1280X960 (1280, 960),
   R1280X1024 (1280, 1024),
   R1311X737 (1311, 737),
   R1360X768 (1360, 768),
   R1366X768 (1366, 768),
   R1400X1050 (1400, 1050),
   R1440X900 (1440, 900),
   R1600X900 (1600, 900),
   R1600X1200 (160, 1200),
   R1680X1050 (1680, 1050),
   R1920X1080 (1920, 1080),
   R1920X1200 (1920, 1200),
   R2048X1152 (2048, 1152),
   R2560X1440 (2560, 1440),
   R2560X1600 (2560, 1600);

   private final int width;
   private final int height;
   private final int pixels;
   private final double ratio;

   StdRes(int width, int height)
   {
      this.width = width;
      this.height = height;
      this.pixels = width * height;
      this.ratio = width / height;
   }

   public int getWidth()
   {
      return this.width;
   }
   public int getHeight()
   {
      return this.height;
   }
   public int getPixels()
   {
      return this.pixels;
   }
   public double getRatio()
   {
      return this.ratio;
   }  
}