public class sr_manager //main class 
{ static sr1 r1 = new sr1(); 
  static sr2 r2 = new sr2();

  public static void main(String args[]) 
  {  
   //create and start 6 threads for 6 concurrent processes
  }
} 
 
class sr1 //monitor class for shared resource r1
{ private static int avail1 = 3; 

  //synchronized method cannot be interrupted; 
  //only one thread can access at a time; 
  public synchronized void acquire(int id) 
  { 
       
  } 
         
  //synchronized method cannot be interrupted; 
  //only one thread can access at a time; 
  public synchronized void release(int id) 
  { 
    
  } 
}//class sr1 
 
class sr2 //monitor class for shared resource r2
{ private static int avail2 = 2; 

  //synchronized method cannot be interrupted; 
  //only one thread can access at a time; 
  public synchronized void acquire(int id) 
  { 
    
  } 
         
  //synchronized method cannot be interrupted; 
  //only one thread can access at a time; 
  public synchronized void release(int id) 
  { 
   
  } 
}//class sr2 
 
class process extends Thread //thread class
{ static sr1 r1; 
  static sr2 r2;
  private int id; 

  public process(int k, sr1 r1, sr2 r2) //constructor 
  { this.r1 = r1;
    this.r2 = r2;
    //. . . . . . 
  } 
 
  public void run() 
  { 
    //acquire r1 and r2; 
    //display "process_i is working";
    //release r1 and r2;
  } 
}//class process 
