
package org.inra.producer;

/**
 *
 * @author ryahiaoui

*/

import java.io.Serializable ;
import javax.enterprise.inject.Produces ;
import org.inra.notifier.NotificatorType;
import org.inra.notifier.NotificatorEmail;
import org.inra.notifier.NotificatorSms;
import org.inra.notifier.Notificator;
import org.inra.notifier.NotificatorTransport;


public class FactoryNotifier implements Serializable {

  @Produces
  @NotificatorTransport(NotificatorType.EMAIL)
  public Notificator emailNotifier() {
    return new NotificatorEmail() ;
  }
  
  @Produces
  @NotificatorTransport(NotificatorType.SMS)
  public Notificator smsNotifier(){
    return new NotificatorSms() ;
  }
  
}