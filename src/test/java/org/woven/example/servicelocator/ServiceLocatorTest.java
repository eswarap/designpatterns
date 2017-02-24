package org.woven.example.servicelocator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.woven.examples.servicelocator.Service;
import org.woven.examples.servicelocator.ServiceLocator;
import org.woven.examples.servicelocator.ServiceType;

@RunWith(JUnit4.class)
public class ServiceLocatorTest {
    
    private final static Logger LOG = LoggerFactory.getLogger(ServiceLocatorTest.class);
     
    @Test
    public void testServiceLocator() {
        ServiceLocator serviceLocator = new ServiceLocator();
        
        Service dbService = serviceLocator.getService(ServiceType.DatabaseService.name());
        LOG.info(dbService.getServiceName());
        Assert.assertEquals(dbService.getServiceName(), ServiceType.DatabaseService.name());
        Service msgService = serviceLocator.getService(ServiceType.DatabaseService.name());
        LOG.info(msgService.getServiceName());
        Assert.assertEquals(msgService.getServiceName(), ServiceType.MessagingService.name());
    }
}
