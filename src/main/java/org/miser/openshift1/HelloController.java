package org.miser.openshift1;

import java.util.Map;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 */
@Path("/hello")
@Singleton
public class HelloController {

    @GET
    @Produces("text/plain")
    public String sayHello() {
        StringBuffer sb  = new StringBuffer();
        Map<String, String> env = System.getenv();
        for (String s: env.keySet()) { 
            sb.append(s + "=" + System.getenv(s) + "\n");
        }
        return sb.toString();
    }
}
