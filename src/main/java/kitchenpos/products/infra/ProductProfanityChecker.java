package kitchenpos.products.infra;

import java.net.URI;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import kitchenpos.common.external.infra.PurgomalumClient;

@Component
public class ProductProfanityChecker implements PurgomalumClient {

	private final RestTemplate restTemplate;

	public ProductProfanityChecker(final RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	@Override
	public boolean containsProfanity(final String text) {
		final URI url = UriComponentsBuilder.fromUriString("https://www.purgomalum.com/service/containsprofanity")
			.queryParam("text", text)
			.build()
			.toUri();
		return Boolean.parseBoolean(restTemplate.getForObject(url, String.class));
	}
}
