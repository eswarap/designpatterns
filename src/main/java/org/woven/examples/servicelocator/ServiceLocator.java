package org.woven.examples.servicelocator;

public class ServiceLocator {
    
    private Cache cache = new Cache();

    public Service getService(ServiceType serviceType) {
        Service service = cache.getService(serviceType);
        
        if (service == null ) {
            InitialContext context = new InitialContext();
            Service s = (Service)context.lookup(serviceType);
            cache.addService(s);
            service = s;
        }
        
        return service;
    }
}
