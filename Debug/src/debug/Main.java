/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debug;

//import debugoff.Debugoff;
import static java.lang.System.out;

/**
 *
 * @author alice
 */
public abstract class Main {
         /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Debug d1= new Debug();
        out.println(d1.debug());
//        Debugoff d2= new Debugoff();
        debugoff.Debug d2= new debugoff.Debug();
        out.println(d2.debug());
//        out.println(Debug.debug());
//        out.println(Debug.debug());
    };

 
}
