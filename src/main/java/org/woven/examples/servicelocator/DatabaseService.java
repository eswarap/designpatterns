package org.woven.examples.servicelocator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatabaseService extends Service {

    private static final Logger LOG = LoggerFactory.getLogger(DatabaseService.class);

    @Override
    public void execute() {
        LOG.info("execute database service");
    }
    
     @Override
    public String getServiceName() {
        return this.serviceName;
    }

}
