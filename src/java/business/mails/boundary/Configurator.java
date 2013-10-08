package business.mails.boundary;

import javax.enterprise.inject.Produces;


/**
 *
 * @author luc
 */
public class Configurator {
    
    
    @Produces
    public String getString(){
        return "aaaa";
    }
}
