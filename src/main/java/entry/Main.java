package entry;


import org.inra.controler.FacadeService;
import org.inra.controler.FacadeService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 *
 * @author ryahiaoui
 */
public class Main {

    public static void main(String[] args) {

        Weld weld               = new Weld()        ;
        WeldContainer container = weld.initialize() ;
        
        FacadeService application = container.instance()
                                             .select( FacadeService.class )
                                             .get() ;
        application.process() ;
        weld.shutdown()       ;

    }

}
