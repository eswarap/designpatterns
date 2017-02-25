package org.woven.examples.servicelocator;

public abstract class Service {
    
    protected ServiceType serviceType;
    
    public abstract void execute();
    
    public abstract ServiceType getServiceType();
}
