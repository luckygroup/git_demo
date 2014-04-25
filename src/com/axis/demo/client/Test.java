package com.axis.demo.client;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

import sun.net.www.http.HttpClient;

public class Test {

	/**
	 * @param args
	 * @throws ServiceException 
	 */
	public static void main(String[] args) throws Exception {
		ArrayList list = new ArrayList();
		list.add(2, "ss");
	}
	
	public static void connection() throws Exception{
		for (int i = 0; i < 1000; i++) {
			URL url = new URL("http://127.0.0.1:8080/AppAction.do");
			URLConnection conn = url.openConnection();
			conn.connect();
			HttpURLConnection httpconn = (HttpURLConnection) conn;
			int httpStatusCode = httpconn.getResponseCode();
			if (httpStatusCode != HttpURLConnection.HTTP_OK) {
				return;
			}
			
		}
	}
	public static void runWebServices() throws Exception{
		Service service = new Service();
		Call call = (Call) service.createCall();
		call.setTargetEndpointAddress("http://127.0.0.1:8080/AxisDemo/services/User");
		call.setOperationName("sysHello");
		call.invoke(new Object[]{});
	}

}
