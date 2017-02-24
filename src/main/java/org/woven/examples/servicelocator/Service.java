package org.woven.examples.servicelocator;

public abstract class Service {
    protected String serviceName;
    public abstract void execute();
    public abstract String getServiceName();
}
