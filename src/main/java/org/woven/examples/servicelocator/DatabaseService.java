package org.woven.examples.servicelocator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatabaseService extends Service {

    private static final Logger LOG = LoggerFactory.getLogger(DatabaseService.class);

    /**
     * Class constructor that takes ServiceType as argument
     * 
     * @param serviceType
     */
    public DatabaseService(ServiceType paramServiceType) {
        this.serviceType = paramServiceType;
    }
    
    /**
     * 
     */
    @Override
    public void execute() {
        LOG.info("execute database service");
    }
    
    @Override
    public ServiceType getServiceType() {
        return this.serviceType;
    }

}
