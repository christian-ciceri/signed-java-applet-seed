package minimal;

import java.applet.Applet;
import java.awt.*; 
 
public class HelloWorld extends Applet {

  public void init() {}

  public void stop() {} 
 
  public void paint(Graphics g) {
      int i=0;
      DummyClass dummy = new DummyClass();
      System.out.println(i * i);
      g.drawString("Hello World",10,20);
  }

} 
