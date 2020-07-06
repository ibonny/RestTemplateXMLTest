package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MyAppRunner implements CommandLineRunner {
    @Override
    public void run(String... strings) {
        RestTemplate rest = new RestTemplate();

        String ipaddr = rest.getForObject("http://icanhazip.com", String.class);

        ipaddr = ipaddr.replace("\n", "");

        GeoPlugin result = rest.getForObject("http://www.geoplugin.net/xml.gp?ip={ipaddr}", GeoPlugin.class, ipaddr);

        System.out.println(result.getRequest());
        System.out.println(result.getCity());

        System.exit(1);
    }
}
