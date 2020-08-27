
package com.neusoft.hit.rhin;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HisServiceSoap", targetNamespace = "http://www.neusoft.com/hit/rhin")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HisServiceSoap {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "HelloWorld", action = "http://www.neusoft.com/hit/rhin/HelloWorld")
    @WebResult(name = "HelloWorldResult", targetNamespace = "http://www.neusoft.com/hit/rhin")
    @RequestWrapper(localName = "HelloWorld", targetNamespace = "http://www.neusoft.com/hit/rhin", className = "com.neusoft.hit.rhin.HelloWorld")
    @ResponseWrapper(localName = "HelloWorldResponse", targetNamespace = "http://www.neusoft.com/hit/rhin", className = "com.neusoft.hit.rhin.HelloWorldResponse")
    public String helloWorld();

    /**
     * 
     * @param xmlData
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "resourceMethodResult", targetNamespace = "http://www.neusoft.com/hit/rhin")
    @RequestWrapper(localName = "resourceMethod", targetNamespace = "http://www.neusoft.com/hit/rhin", className = "com.neusoft.hit.rhin.ResourceMethod")
    @ResponseWrapper(localName = "resourceMethodResponse", targetNamespace = "http://www.neusoft.com/hit/rhin", className = "com.neusoft.hit.rhin.ResourceMethodResponse")
    public String resourceMethod(
            @WebParam(name = "xmlData", targetNamespace = "http://www.neusoft.com/hit/rhin")
                    String xmlData);

}
