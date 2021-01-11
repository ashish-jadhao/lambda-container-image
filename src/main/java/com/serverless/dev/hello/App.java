package com.serverless.dev.hello;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class App implements RequestHandler<Object, String>
{

	@Override
	public String handleRequest(Object arg0, Context arg1) {
		// TODO Auto-generated method stub
		System.out.println("hello world!!");
		return "OK";
	}
    
}
