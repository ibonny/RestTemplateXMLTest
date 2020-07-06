package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MyAppRunner implements CommandLineRunner {
    @Override
    public void run(String... strings) {
        RestTemplate rest = new RestTemplate();

        GeoPlugin result = rest.getForObject("http://www.geoplugin.net/xml.gp?ip=173.67.200.71", GeoPlugin.class);

        System.out.println(result.getCity());

        System.exit(1);
    }
}
