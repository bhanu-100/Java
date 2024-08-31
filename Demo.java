class Mythread extends Thread{
  public void run(){
  for(int i=0;i<10;i++)
  System.out.println(i+"child thread");
  
  }
  }
  class Demo{
  public static void main(String a[]){
  
  Mythread t1=new Mythread();
  t1.start(); 
  
  for(int i=0;i<10;i++)
  
  System.out.println(i+"Main Thread");
  
  }
  }
  