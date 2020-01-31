package com.company;

public class Main {

    public static void main(String[] args) {
	  NumberBase nb = new NumberBase(); //binary
	  NumberBase nh = new NumberBase(); //hex
	  NumberBase no = new NumberBase(); //octal
	  NumberBase ch = new NumberBase(); //char
          /*
          new HexObserver(nb);
       new OctalObserver(nb);
       new BinaryObserver(nb);
         System.out.println("first state change : 15");
	     nb.setmState(15);
         System.out.println("first state change : 10");
         nb.setmState(10);
          */

          nb.addPropertyChangeListener(new BinaryObserver());
          nh.addPropertyChangeListener(new HexObserver());
          no.addPropertyChangeListener(new OctalObserver());
          ch.addPropertyChangeListener(new AsciiObserver());

          System.out.println("First state change: 97");
          nb.setValue(97);
          nh.setValue(97);
          no.setValue(97);
          ch.setValue(97);

          System.out.println("First state change: 110");
          nb.setValue(110);
          nh.setValue(110);
          no.setValue(110);
          ch.setValue(110);


          System.out.println("First state change: 122");
          nb.setValue(122);
          nh.setValue(122);
          no.setValue(122);
          ch.setValue(122);

    }
}
