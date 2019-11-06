package org.miser.openshift1;

import java.util.Map;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 */
@Path("/hello")
@Singleton
public class HelloController {

    @GET
    public String sayHello() {
        StringBuffer sb  = new StringBuffer();
        Map<String, String> env = System.getenv();
        for (String s: env.keySet()) { 
            sb.append(s + System.getenv(s));
        }
        return sb.toString();
    }
}
