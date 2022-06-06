package guru.springframework.spring5jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServiceImpl implements JokesService {
	
	private final ChuckNorrisQuotes chuckNorrisQuote;

	public JokesServiceImpl() {
		this.chuckNorrisQuote = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuote.getRandomQuote();
	}

}
