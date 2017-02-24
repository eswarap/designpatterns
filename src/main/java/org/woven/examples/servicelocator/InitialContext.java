package org.woven.examples.servicelocator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InitialContext {
    
    private static final Logger LOG = LoggerFactory.getLogger(InitialContext.class);
    
    public Object lookup(ServiceType serviceType){
   
      if(serviceType.equals(ServiceType.DatabaseService)){
         LOG.info("Looking up and creating a new DatabaseService object");
         return new DatabaseService(ServiceType.DatabaseService);
      }
      else if (serviceType.equals(ServiceType.MessagingService)){
          LOG.info("Looking up and creating a new MessagingService object");
         return new MessagingService(ServiceType.MessagingService);
      }
      return null;		
   }
}
