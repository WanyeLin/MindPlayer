package com.example.linwei.mindplayer;

public class Music {

    private String id ;
    private String url;
    private String name;

    public Music(String id,String url,String name){
        this.name=name;
        this.url = url;
        this.id = id;

    }

    public String getId(){
        return id;

    }
    public String getname(){
        return name;

    }

    public String getUrl(){
        return url;

    }


}
