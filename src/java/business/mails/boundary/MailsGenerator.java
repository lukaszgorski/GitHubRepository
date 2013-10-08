package business.mails.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author luc
 */
@Stateless
public class MailsGenerator {

    
    @Inject
    private String mail;
    
    public String mailes(){
        return mail;
    }
}
