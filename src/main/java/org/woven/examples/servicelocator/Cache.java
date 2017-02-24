package org.woven.examples.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    
    private List<Service> serviceList;
    
    public Cache() {
       serviceList = new ArrayList<>();
    }

    public Service getService(String serviceName) {
        for(Service s:serviceList) {
            if (serviceName.equalsIgnoreCase(s.getServiceName())) {
                return s;
            }
        }    
        return null;
    }
    
    public void addService(Service service) {
        this.serviceList.add(service);
    }
}


