
package logicBusiness;

import data.Login;
import java.io.IOException;

/**
 *
 * @author JULIAN C
 * @author JUAN B
 */
public class AnthropometryManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Login login = new Login();
        login.leer();
        
        
        while(login.isEnter()== true) {
            login.validate();
        }
        
    }
    
}
