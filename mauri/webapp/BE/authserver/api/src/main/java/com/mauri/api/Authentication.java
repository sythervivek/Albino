package com.mauri.api;

import javax.ws.rs.container.ContainerRequestContext;

public interface Authentication {    
    public String authenticate(ContainerRequestContext reqctx);
    public String validatetoken(ContainerRequestContext reqctx);
    public void configure();
}