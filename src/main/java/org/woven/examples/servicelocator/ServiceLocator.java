package org.woven.examples.servicelocator;

public class ServiceLocator {
    
    private Cache cache = new Cache();

    public Service getService(ServiceType serviceType) {
        Service service = cache.getService(serviceType);
        
        if (service == null ) {
            InitialContext context = new InitialContext();
            Service localService = (Service)context.lookup(serviceType);
            cache.addService(localService);
            service = localService;
        }
        
        return service;
    }
}
