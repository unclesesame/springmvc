package com.abner.springmvc.service;
import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class ConnectionUtil {
	
	private static final String URL_1 = "http://192.168.8.111:16666/sensor"; 
	
	public static String postData(String data) {
		String response = null;
		CloseableHttpClient httpclient = null;
		CloseableHttpResponse httpresponse = null;
		try {
				httpclient = HttpClients.createDefault();
				HttpPost httppost = new HttpPost(URL_1);
				StringEntity stringEntity = new StringEntity(data,
						ContentType.create("text/json", "UTF-8"));
				httppost.setEntity(stringEntity);
				httpresponse = httpclient.execute(httppost);
				response = EntityUtils.toString(httpresponse.getEntity());
				System.out.println("response: " + response);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if (httpclient != null) {
				try {
					httpclient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (httpresponse != null) {
				try {
					httpresponse.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return response;
	}
}
