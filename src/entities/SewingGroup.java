package entities;

import entities.enums.Estados;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SewingGroup {

    private String hostName;
    private Integer seamstressNumber;
    private Estados state;
    private String city;
    private LocalDateTime startDateRelationship;
    private LocalDateTime finishDateRelationship;
    
    private List<Model> sewnModels = new ArrayList<>();
    private List<Model> modelsInSewing = new ArrayList<>();


    public SewingGroup() {
    }

    public SewingGroup(String hostName, Integer seamstressNumber, Estados state, String city, LocalDateTime startDateRelationship, List<Model> sewnModels) {
        this.hostName = hostName;
        this.seamstressNumber = seamstressNumber;
        this.state = state;
        this.city = city;
        this.startDateRelationship = startDateRelationship;
        this.sewnModels = sewnModels;
    }


    public String gethostName() {
        return hostName;
    }

    public void sethostName(String hostName) {
        this.hostName = hostName;
    }

    public Estados getState() {
        return state;
    }

    public void setState(Estados state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDateTime getStartDateRelationship() {
        return startDateRelationship;
    }

    public void setStartDateRelationship(LocalDateTime startDateRelationship) {
        this.startDateRelationship = startDateRelationship;
    }

    public LocalDateTime getFinishDateRelationship() {
        return finishDateRelationship;
    }

    public void setFinishDateRelationship(LocalDateTime finishDateRelationship) {
        this.finishDateRelationship = finishDateRelationship;
    }

    public Integer getSeamstressNumber() {
        return seamstressNumber;
    }

    public void setSeamstressNumber(Integer seamstressNumber) {
        this.seamstressNumber = seamstressNumber;
    }

    public List<Model> getsewnModels() {
        return sewnModels;
    }

    public List<Model> getModelsInSewing() {
        return modelsInSewing;
    }

    public Integer RelationshipDuration() {
        int relationshipTime = (int) Duration.between(this.startDateRelationship, this.finishDateRelationship).toDays();
        return relationshipTime;
    }

}

