package org.woven.examples.servicelocator;

public class ServiceLocator {
    
    private Cache cache = new Cache();

    public Service getService(String serviceName) {
        Service service = cache.getService(serviceName);
        
        if (service == null ) {
            InitialContext context = new InitialContext();
            Service s = (Service)context.lookup(serviceName);
            cache.addService(s);
            service = s;
        }
        
        return service;
    }
}
