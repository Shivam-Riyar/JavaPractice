import java.util.*;
class Variables{
  int i;
  String s;
  Boolean b;

  public Variables(){
    System.out.println("VALUES INITIALIZED BY DEFAULT CONSTRUCTOR.");
    i = 0;
    s = null;
    b = false;
    printData();
  }
  public Variables(int a){
    System.out.println("VALUE OF INT VARIABLE INITIALIZED BY PARAMETERIZED CONSTRUCTOR.");
    i = a;
    printData(i);
  }
  public Variables(int a,String c){
    System.out.println("VALUE OF INT AND STRING VARIABLE INITIALIZED BY PARAMETERIZED CONSTRUCTOR.");
    i = a;
    s = c;
    printData(i,s);
  }
  public Variables(int a,String c,Boolean bool){
    i = a;
    s = c;
    b = bool;
    printData(i,s,b);
  }
  void printData(){
    System.out.println("INT VARIABLE = " +i+ "\nSTRING VARIABLE : " +s+ "\nBOOLEAN VARIABLE : " +b);
  }
  void printData(int i){
    System.out.println("INT VARIABLE = " +i+ "\nSTRING VARIABLE : NOT INITIALIZED\nBOOLEAN VARIABLE : NOT INITIALIZED");
  }
  void printData(int i,String s){
    System.out.println("INT VARIABLE = " +i+ "\nSTRING VARIABLE : " +s+ "\nBOOLEAN VARIABLE : NOT INITIALIZED");
  }
  void printData(int a,String s,Boolean b){
    System.out.println("INT VARIABLE = " +i+ "\nSTRING VARIABLE : " +s+ "\nBOOLEAN VARIABLE : " +b);
  }
}
class constmethodL5{
  public static void main(String[] args){
    int ai = 200;
    String as = "Hello World!";
    Boolean abool = true;
    Variables obj0 = new Variables();
    Variables obj1 = new Variables(ai);
    Variables obj2 = new Variables(ai,as);
    Variables obj3 = new Variables(ai,as,abool);

  }
}
