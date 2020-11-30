package com.neusoft.webservice.Service.Impl;

import com.neusoft.hit.rhin.HisService;
import com.neusoft.hit.rhin.HisServiceSoap;
import com.neusoft.webservice.Service.HitService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.net.MalformedURLException;
import java.net.URL;

@WebService(serviceName="HitService",//对外发布的服务名
        targetNamespace="http://www.neusoft.com/hit/rhin",//指定你想要的名称空间，通常使用使用包名反转
        endpointInterface="com.neusoft.webservice.Service.HitService")//服务接口全路径, 指定做SEI（Service EndPoint Interface）服务端点接口
@Component
public class HitServiceImpl implements HitService {

    @Override
    public String resourceMethod(String xmlData) {

        System.out.println("入参"+xmlData);
        String strUrl = "http://192.168.80.153:8080/Ws/HisService.asmx?WSDL";
        URL url = null;
        try {
            url = new URL(strUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HisService service = new HisService(url);
        HisServiceSoap client = service.getHisServiceSoap();
        String outpulxml= client.resourceMethod(xmlData);
        System.out.println("出参"+outpulxml);
        return outpulxml;
    }
}
