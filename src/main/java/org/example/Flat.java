package org.example;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.text.StyledEditorKit;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Flat {
    private String adress;
    private double dwellingSpace, totalFloorSpace;
    private Integer floor;
    private Boolean lift, concierge, securityZone, parkingSpace;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private HashMap<Citizen, List<Calendar>> previousOwners;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private HashMap<Citizen, List<Calendar>> registeredPersons;

    public Flat(){}
    public Flat(String adress, double dwellingSpace, double totalFloorSpace,
                Integer floor, Boolean lift, Boolean concierge, Boolean securityZone,
                Boolean parkingSpace, HashMap<Citizen, List<Calendar>> previousOwners,
                HashMap<Citizen, List<Calendar>> registeredPersons){
        this.adress = adress;
        this.dwellingSpace = dwellingSpace;
        this.totalFloorSpace = totalFloorSpace;
        this.floor = floor;
        this.lift = lift;
        this.concierge = concierge;
        this.securityZone = securityZone;
        this.parkingSpace = parkingSpace;
        this.previousOwners = previousOwners;
        this.registeredPersons = registeredPersons;
    }

    public String getAdress(){
        return adress;
    }
    public double getDwellingSpace(){
        return dwellingSpace;
    }
    public double getTotalFloorSpace(){
        return totalFloorSpace;
    }
    public Integer getFloor(){
        return floor;
    }
    public Boolean getLift(){
        return lift;
    }
    public Boolean getConcierge(){
        return concierge;
    }
    public Boolean getSecurityZone(){
        return securityZone;
    }
    public Boolean getParkingSpace() {
        return parkingSpace;
    }
    public HashMap getPreviousOwners(){
        return previousOwners;
    }
    public HashMap getRegisteredPersons(){
        return registeredPersons;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }
    public void setDwellingSpace(double dwellingSpace) {
        this.dwellingSpace = dwellingSpace;
    }
    public void setTotalFloorSpace(double totalFloorSpace) {
        this.totalFloorSpace = totalFloorSpace;
    }
    public void setFloor(Integer floor) {
        this.floor = floor;
    }
    public void setLift(Boolean lift) {
        this.lift = lift;
    }
    public void setConcierge(Boolean concierge) {
        this.concierge = concierge;
    }
    public void setParkingSpace(Boolean parkingSpace) {
        this.parkingSpace = parkingSpace;
    }
    public void setSecurityZone(Boolean securityZone) {
        this.securityZone = securityZone;
    }
    public void setPreviousOwners(HashMap<Citizen, List<Calendar>> previousOwners) {
        this.previousOwners = previousOwners;
    }
    public void setRegisteredPersons(HashMap<Citizen, List<Calendar>> registeredPersons) {
        this.registeredPersons = registeredPersons;
    }

    @Override
    public String toString(){
        return "Float{" +
                "adress='" + adress + '\'' +
                ", dwellingSpace='" + dwellingSpace + '\'' +
                ", totalFloorSpace='" + totalFloorSpace + '\'' +
                ", floor='" + floor + '\'' +
                ", lift='" + lift + '\'' +
                ", concierge='" + concierge + '\'' +
                ", securityZone='" + securityZone + '\'' +
                ", parkingSpace='" + parkingSpace + '\'' +
                ", previousOwners='" + previousOwners + '\'' +
                ", registeredPersons='" + registeredPersons + '\'' +
                '}';

    }
}