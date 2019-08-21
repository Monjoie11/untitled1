package edu.cnm.deepdive;

import static java.lang.String.format;

public class ClassB extends ClassA {

  private static String stringData;

  static {
    System.out.println("ClassB::static");
  }

  private static String getStringData(){
    System.out.println("ClassB::getStringDtat");
    return "some stuff";
  }

  public static void main(String[] args){
    System.out.println("ClassB::main");
   ClassC c1 = new ClassC();
   ClassC c2 = new ClassD();
   ClassD d1 = new ClassD();
   ClassD d2;
   c1 = d1;
   d2 = (ClassD) c2;
   d1.setInstanceData(Double.MAX_VALUE);
   System.out.println(c1.getInstanceData());
  }

}
