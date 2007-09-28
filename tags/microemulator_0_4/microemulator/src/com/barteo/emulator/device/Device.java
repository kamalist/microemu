/*
 *  MicroEmulator
 *  Copyright (C) 2002 Bartek Teodorczyk <barteo@it.pl>
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
 
package com.barteo.emulator.device;

import java.io.IOException;
import java.util.Vector;

import javax.microedition.lcdui.Image;

import com.barteo.emulator.EmulatorContext;


public interface Device 
{

  Image createImage(int width, int height);
  Image createImage(String name) throws IOException;
  Image createImage(Image source);
  Image createImage(byte[] imageData, int imageOffset, int imageLength);
  
  EmulatorContext getEmulatorContext(); 
  
  DeviceDisplay getDeviceDisplay();
  FontManager getFontManager();
  InputMethod getInputMethod();
  Vector getSoftButtons();
  
  int getGameAction(int keyCode);
  int getKeyCode(int gameAction);

  boolean hasPointerMotionEvents();
  boolean hasPointerEvents();
  boolean hasRepeatEvents();

}