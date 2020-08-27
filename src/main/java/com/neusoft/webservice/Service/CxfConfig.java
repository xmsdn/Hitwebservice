package com.neusoft.webservice.Service;

import com.neusoft.webservice.Service.Impl.HitServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {
    @SuppressWarnings("all")
    @Bean(name = "CXFServlet")
    public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/neusoft/webservice/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus()
    {
        return  new SpringBus();
    }

    @Bean
    public HitService hisService()
    {
        return  new HitServiceImpl();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint=new EndpointImpl(springBus(), hisService());//绑定要发布的服务
        endpoint.publish("/ws"); //显示要发布的名称
        return endpoint;
    }
}
