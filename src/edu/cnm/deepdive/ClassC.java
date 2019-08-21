package edu.cnm.deepdive;

public class ClassC {



  private static double staticData = getTrickyData();

  private double instanceData = getTrickyData();

  private int inheritedData;

  public ClassC(){
    System.out.println("I think this is the constructor");
  }

  {
    System.out.println("ClassC::Instance");
  }

  public void doSomething(){
    System.out.println("ClassC::doSomething");
  }

  protected int getInheritedData() {
    return inheritedData;
  }

  protected void setInheritedData(int inheritedData) {
    this.inheritedData = inheritedData;
  }

  private static double getTrickyData(){
    System.out.println("ClassC::getTrickyData");
    return -1.0;
  }

  public static void doSomethingElse(){
    System.out.println("ClassC doSomethingElse");
  }


  public static double getStaticData() {
    return staticData;
  }

  public static void setStaticData(double staticData) {
    ClassC.staticData = staticData;
  }

  public double getInstanceData() {
    return instanceData;
  }

  public void setInstanceData(double instanceData) {
    this.instanceData = instanceData;
  }


}
