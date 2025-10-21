package com.springapp;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.junit.jupiter.api.Test;

class VersionCheckTest {

	 @Test
	    void testWebsiteVersion() throws IOException, InterruptedException {
	        String url = "http://localhost:8090"; 
	        HttpClient client = HttpClient.newHttpClient();
	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(URI.create(url))
	                .build();

	        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

	 
	        String expectedVersion = "Version: v2.5.";
	        assertTrue(response.body().contains(expectedVersion),
	                   "Website does not contain " + expectedVersion);
	    }
}
