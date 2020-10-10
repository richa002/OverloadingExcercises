package com.richa.learning;

public class Team {
    private String teamName;
    private String teamCountry;
    private String teamCoach;
    private int temaSize;
    public Team(){}
    public Team(String teamName){
        this.teamName=teamName;
    }
        public Team(String teamName, String teamCountry){
        this(teamName);
        this.teamCountry=teamCountry;
        }
    }

