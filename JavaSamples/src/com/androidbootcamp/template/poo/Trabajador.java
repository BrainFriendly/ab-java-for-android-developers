package com.androidbootcamp.template.poo;

/**
 * Created by eduardomedina on 29/01/18.
 */
public class Trabajador extends Persona{

    private String id;
    private String tutorName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }
}
