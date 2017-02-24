package org.woven.examples.servicelocator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatabaseService extends Service {

    private static final Logger LOG = LoggerFactory.getLogger(DatabaseService.class);

    public DatabaseService(ServiceType _serviceType) {
        this.serviceType = _serviceType;
    }
    
    @Override
    public void execute() {
        LOG.info("execute database service");
    }
    
    @Override
    public ServiceType getServiceType() {
        return this.serviceType;
    }

}
