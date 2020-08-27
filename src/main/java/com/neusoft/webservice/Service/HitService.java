package com.neusoft.webservice.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace="http://www.neusoft.com/hit/rhin")
public interface HitService {
    @WebMethod
    @WebResult(name="String",targetNamespace="http://www.neusoft.com/hit/rhin")
    String resourceMethod(@WebParam(name = "xmlData") String xmlData);
}
