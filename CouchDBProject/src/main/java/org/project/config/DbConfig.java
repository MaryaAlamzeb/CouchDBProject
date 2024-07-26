package org.project.config;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.net.MalformedURLException;

@Configuration
public class DbConfig {

    @Bean
    public CouchDbConnector couchDbConnector() throws MalformedURLException {
        HttpClient httpClient = new StdHttpClient.Builder()
                .url("http://127.0.0.1:5984")
                .username("admin")
                .password("1234")
                .build();
        CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
        CouchDbConnector connector = dbInstance.createConnector("testdb", true);
        System.out.println("CouchDbConnector bean created: " + connector);
        return connector;
    }
}
