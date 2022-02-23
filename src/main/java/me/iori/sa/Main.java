package me.iori.sa;

import me.iori.sa.asciiPanel.AsciiPanel;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    var context = new ClassPathXmlApplicationContext("context.xml");
    var panel = context.getBean("panel", AsciiPanel.class);
    panel.setBackground(AsciiPanel.brightBlack);
  }
}
