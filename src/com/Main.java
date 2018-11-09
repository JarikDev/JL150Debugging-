package com;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Logger.getGlobal();

    public static void main(String[] args)throws Exception {

//        Random random=new Random(){
//            @Override
//            public double nextDouble() {
//                Double d = super.nextDouble();
//                System.out.println(d);
//                return d;
//            }
//        };
//        random.nextDouble() ;

        /*int i = 5;
        System.out.println(i);
        System.out.println();
        log.info("info message");
*/
/*        Car car = new Car();
        System.out.println(car.run(5, 2));*/
       method();
    }
    public static void secondMethod(){

    }



    private static void method() throws FileNotFoundException {
    //    PrintWriter writer=new PrintWriter(new File("ingest.log"));
    //    new Throwable().printStackTrace(writer);
    //   writer.flush();
    //    writer.close();
    //    try{throw new Exception("message");}catch(Exception e){e.printStackTrace();}
     //   Thread.dumpStack();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {

            }
        });
    }
}
