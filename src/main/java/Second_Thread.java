package threads;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Second_Thread implements Runnable{
    
    public void run(){
        for(int i = 0; i < 20; i++)
        {
            System.out.println(i + "the second thread");
            try{
                Thread.sleep(1500);
            }
            catch(InterruptedException x ){
                Logger.getLogger(Second_Thread.class.getName()).log(Level.SEVERE, null, x);

                
            }
        }
        
        System.out.println("The second thread is finshed");
    }
}
