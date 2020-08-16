package com.natal.helloworld.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;

@Local
public interface HelloWorldRemote {
 
    public String sayHello();
    
}
