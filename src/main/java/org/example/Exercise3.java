package org.example;

import java.net.SocketException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpResponse;

public class Exercise3 {

    private void startSending()
    {
        HttpResponse.ResponseInfo response = new HttpResponse.ResponseInfo() {
            @Override
            public int statusCode() {
                return 0;
            }

            @Override
            public HttpHeaders headers() {
                return null;
            }

            @Override
            public HttpClient.Version version() {
                return null;
            }
        };

        try
        {
            doSending();
        }
        catch(SocketException e)
        {
            // normal. someone stopped the request.
        }
        catch(Exception e)
        {
            try
            {
                response.wait(100l);
                response.notifyAll();
            }
            catch(Exception e1)
            {
                //Give me a break!
            }
        }
    }

    private void doSending() throws SocketException{
        // do nothing for now
    }

}
