package org.example;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.text.StyledEditorKit;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Citizen {
    private String name, surname, patronymic;

    public Citizen() {}
    @JsonCreator
    public Citizen(
            @JsonProperty("surname") String surname,
            @JsonProperty("name") String name,
            @JsonProperty("patronymic") String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }
    @Override
    public String toString() {
        return "Citizen{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
               '}';
        //return "Citizen:'" + name + '\'' +surname + '\'' + patronymic;
    }
}
