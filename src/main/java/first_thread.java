package threads;
import java.util.logging.Level;
import java.util.logging.Logger;
        
        
public class first_thread extends  Thread{
    
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i + " the firs thread");
        }
        
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException x ) 
        {
            Logger.getLogger(first_thread.class.getName()).log(Level.SEVERE, null, x);
            
        }
        
        System.out.println("the first thread is finshed");
    }
    
}
