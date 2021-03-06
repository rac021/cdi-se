
package org.inra.producer ;

import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author ryahiaoui
 */
public class FactoryLoger {
    
    
    @Produces  
    public Logger produceLogger( InjectionPoint injectionPoint ) {  
     
        return Logger.getLogger ( injectionPoint.getMember()
                                                .getDeclaringClass()
                                                .getName() )       ;  
    } 
}
