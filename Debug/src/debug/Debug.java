/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debug;

import debugoff.Debugoff;
import static java.lang.System.out;
 /**
 *
 * @author alice
 */
public class Debug {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       out.println(Debug.debug());
       Debugoff.debug();
    }
    
     public static String debug(){
        String pippo;
        pippo="Errore";
        return pippo;
        }
    
}

