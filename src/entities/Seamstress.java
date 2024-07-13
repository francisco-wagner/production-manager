package entities;

import entities.enums.Estados;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Seamstress {

    private String name;
    private Estados state;
    private String city;
    private Instant startDateRelationship;
    private Instant finishDateRelationship;
    
    private List<Model> models = new ArrayList<>();
}
