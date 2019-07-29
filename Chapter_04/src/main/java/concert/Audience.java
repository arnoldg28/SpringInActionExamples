package concert;


import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by ArnoldG3 on 12/29/2017.
 *
 * Annotation was first introduced in this class.
 * page 142 instructed that annotation be removed in this class
 *
 */
public class Audience {

    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    public void takeSeats(){
        System.out.println("Taking seats");
    }

    public void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }

    public void demandRefund(){
        System.out.println("Demanding a Refund");
    }

    public void watchPerformance(ProceedingJoinPoint jp){
        try{

            System.out.println("Silencing cell phones");

            System.out.println("Taking Seats");

            jp.proceed();

            System.out.println("CLAP CLAP CLAP");

        } catch (Throwable e){
            System.out.println("Demanding a Refund");
        }
    }

}
