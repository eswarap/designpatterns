package org.woven.examples.servicelocator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InitialContext {
    
    private static final Logger LOG = LoggerFactory.getLogger(InitialContext.class);
    
    public Object lookup(String jndiName){
   
      if(jndiName.equalsIgnoreCase(ServiceType.DatabaseService.name())){
         LOG.info("Looking up and creating a new DatabaseService object");
         return new DatabaseService();
      }
      else if (jndiName.equalsIgnoreCase(ServiceType.MessagingService.name())){
          LOG.info("Looking up and creating a new MessagingService object");
         return new MessagingService();
      }
      return null;		
   }
}
