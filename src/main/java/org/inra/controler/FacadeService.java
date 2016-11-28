
package org.inra.controler;

/**
 *
 * @author ryahiaoui
 */

import org.inra.business.Business;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.inra.notifier.NotificatorType;
import org.inra.notifier.Notificator;
import org.inra.notifier.NotificatorTransport;

@Singleton
public class FacadeService {

    @Inject
    private Business bisiness ;

    @Inject  
    private Logger logger; 
    
    @Inject
    @NotificatorTransport(NotificatorType.EMAIL) 
    private Notificator messageSender ;
    
    public void process()                    {
        
        System.out.println("                      " ) ;
        System.out.println( " =================== " ) ;
        System.out.println( " =================== " ) ;
        System.out.println("                      " ) ;
        
        logger.info (" --- Begin process " )          ;
        
        String result = bisiness.process()            ;
        System.out.println(" -> " + result )          ;
       
        messageSender.sendNotification()              ;
         
        logger.info ( " --- Close process " )         ;
        
        
        System.out.println("                      " ) ;
        System.out.println( " =================== " ) ;
        System.out.println( " =================== " ) ;
        System.out.println("                      " ) ;
    
    }
}
