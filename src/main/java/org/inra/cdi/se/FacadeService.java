
package org.inra.cdi.se;

/**
 *
 * @author ryahiaoui
 */

import java.util.logging.Logger;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class FacadeService {

    @Inject
    private Business bisiness ;

    @Inject  
    private Logger logger; 
    
    public void process() {
        logger.info(" Begin process ")       ;
        
        String result = bisiness.process()   ;
        System.out.println(" -> " + result ) ;
        
        logger.info(" Close process ")       ;
    
    }
}
