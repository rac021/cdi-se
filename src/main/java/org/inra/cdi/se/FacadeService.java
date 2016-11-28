
package org.inra.cdi.se;

/**
 *
 * @author ryahiaoui
 */

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class FacadeService {

    @Inject
    private Business bisiness ;


    public void process() {

        String result = bisiness.process()   ;
        System.out.println(" -> " + result ) ;
    }
}
