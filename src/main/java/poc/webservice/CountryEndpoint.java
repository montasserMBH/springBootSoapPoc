package poc.webservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import poc.domain.bouyguestelecom.gs_producing_web_service.*;

@Endpoint
public class CountryEndpoint {
	private static final String NAMESPACE_URI = "http://bouyguestelecom/gs-producing-web-service";
	Logger log = LoggerFactory.getLogger(this.getClass());
	
public CountryEndpoint() {
	// TODO Auto-generated constructor stub
}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
	@ResponsePayload
	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
		GetCountryResponse response = new GetCountryResponse();
		Country cnt = new Country();
		cnt.setName("FRANCE");
		cnt.setCapital("PARIS");
		cnt.setPopulation(Math.random() * (70000000 - 60000000 + 1) + 60000000);
		response.setCountry(cnt);
		
		log.info("Récupération message soap service");

		return response;
	}
}