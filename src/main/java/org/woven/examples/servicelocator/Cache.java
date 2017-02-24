package org.woven.examples.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    
    private List<Service> serviceList;
    
    public Cache() {
       serviceList = new ArrayList<>();
    }

    public Service getService(ServiceType serviceType) {
        for(Service s:serviceList) {
            if (serviceType.equals(s.getServiceType())) {
                return s;
            }
        }    
        return null;
    }
    
    public void addService(Service service) {
        this.serviceList.add(service);
    }
}


