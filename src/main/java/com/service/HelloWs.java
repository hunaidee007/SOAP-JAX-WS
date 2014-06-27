package com.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;



@WebService
@SOAPBinding(style = Style.RPC)
public class HelloWs {
 
  public Return sayHello(String name) {
    if (name == null) {
      return new Return("Hello!");
    }
 
    return new Return("Hello! "+name);
  }
}
