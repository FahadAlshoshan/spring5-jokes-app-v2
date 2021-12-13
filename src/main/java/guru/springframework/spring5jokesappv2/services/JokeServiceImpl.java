package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class JokeServiceImpl implements JokeService {

  @Override
  public String sayJoke() {
    return new ChuckNorrisQuotes().getRandomQuote();
  }
}
