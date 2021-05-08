package threads;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        first_thread first = new first_thread();
        first.start();
        
        Second_Thread second = new Second_Thread();
        
        Thread thread = new Thread(second);
        thread.start();
        
        for(int i =100; i<200;i+=50)
        {
            System.out.println(i + "from the main thread");
        }
        System.out.println("The main thread is finshed");
        
    }
}
