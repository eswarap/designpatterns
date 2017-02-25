package org.woven.examples.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    
    /**
     * Holds the list of registered service
     * 
     */
    private List<Service> serviceList;
    
    /**
     * Class constructor that initialze serviceList
     * 
     */
    public Cache() {
       serviceList = new ArrayList<>();
    }

    /*
     * Returns an Service object that is registered in Cache.
     * The serviceType argument must specify the service type 
     * eg.DatabaseService,MessagingService
     * 
     * The method looks through the registered services and
     * matches based on the serviceType argument
     * 
     * @param ServiceType
     * @return Service
     */
    public Service getService(final ServiceType serviceType) {
        for(Service s:serviceList) {
            if (serviceType.equals(s.getServiceType())) {
                return s;
            }
        }    
        return null;
    }
    
    /**
     * The method simply add newly registered service to cache
     * 
     * @param Service
     */
    public void addService(Service service) {
        this.serviceList.add(service);
    }
}


