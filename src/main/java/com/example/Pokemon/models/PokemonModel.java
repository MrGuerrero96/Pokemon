package com.example.Pokemon.models;


public class PokemonModel {

    private Integer count;
    private String next;
    private String previous;
    private Pokemon[] results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public Pokemon[] getResults() {
        return results;
    }

    public void setResults(Pokemon[] results) {
        this.results = results;
    }
}
