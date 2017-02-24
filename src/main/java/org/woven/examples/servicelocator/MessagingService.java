package org.woven.examples.servicelocator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessagingService extends Service {
    
    private static final Logger LOG = LoggerFactory.getLogger(MessagingService.class);
    
    @Override
    public void execute() {
        LOG.info("execute messaging service");
    }

    @Override
    public String getServiceName() {
        return this.serviceName;
    }
}
