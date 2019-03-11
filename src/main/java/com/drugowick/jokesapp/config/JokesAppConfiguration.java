package com.drugowick.jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Configuration
public class JokesAppConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
