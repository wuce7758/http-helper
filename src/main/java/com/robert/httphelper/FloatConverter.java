package com.robert.httphelper;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;

public class FloatConverter extends AbstractConverter implements
		ResponseHandler<Float> {

	public Float handleResponse(HttpResponse response)
			throws ClientProtocolException, IOException {
		String str = resp2String(response);
		return new Float(str);
	}

}
