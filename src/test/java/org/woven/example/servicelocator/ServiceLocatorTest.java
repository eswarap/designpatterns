package org.woven.example.servicelocator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.woven.examples.servicelocator.Service;
import org.woven.examples.servicelocator.ServiceLocator;
import org.woven.examples.servicelocator.ServiceType;

@RunWith(JUnit4.class)
public class ServiceLocatorTest {
    
    @Test
    public void testServiceLocator() {
        ServiceLocator serviceLocator = new ServiceLocator();
        
        Service dbService = serviceLocator.getService(ServiceType.DatabaseService);
        dbService.execute();
        Assert.assertEquals(dbService.getServiceType(), ServiceType.DatabaseService);
        Service msgService = serviceLocator.getService(ServiceType.MessagingService);
        msgService.execute();
        Assert.assertEquals(msgService.getServiceType(), ServiceType.MessagingService);
    }
}
