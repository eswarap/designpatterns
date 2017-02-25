package org.woven.examples.servicelocator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InitialContext {
    
    private static final Logger LOG = LoggerFactory.getLogger(InitialContext.class);
    
    /**
     * Returns an Object of Service based on argument ServiceType 
     * 
     * @param ServiceType
     * @return Object
     */
    public Object lookup(ServiceType paramServiceType){
       
      Service service = null; 
   
      if(paramServiceType.equals(ServiceType.DatabaseService)){
         LOG.info("Looking up and creating a new DatabaseService object");
         service = new DatabaseService(ServiceType.DatabaseService);
      }
      else if (paramServiceType.equals(ServiceType.MessagingService)){
         LOG.info("Looking up and creating a new MessagingService object");
         service = new MessagingService(ServiceType.MessagingService);
      }
      return service;		
   }
}
