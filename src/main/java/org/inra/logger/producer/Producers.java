
package org.inra.logger.producer ;

import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author ryahiaoui
 */
public class Producers {
    
    
    @Produces  
    public Logger produceLogger( InjectionPoint injectionPoint ) {  
     
        return Logger.getLogger ( injectionPoint.getMember()
                                                .getDeclaringClass()
                                                .getName() )       ;  
    } 
}
