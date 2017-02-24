package org.woven.examples.servicelocator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessagingService extends Service {
    
    private static final Logger LOG = LoggerFactory.getLogger(MessagingService.class);
    
     public MessagingService(ServiceType _serviceType) {
        this.serviceType = _serviceType;
    }
    
    @Override
    public void execute() {
        LOG.info("execute messaging service");
    }

    @Override
    public ServiceType getServiceType() {
        return this.serviceType;
    }
}
