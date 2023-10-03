package com.ufund.api.ufundapi.model;

import java.util.logging.Logger;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Represents a Need entity
 * 
 * @author Swengy
 */
public class Need {
    private static final Logger LOG = Logger.getLogger(Need.class.getName());

    // Package private for tests
    static final String STRING_FORMAT = "Hero [id=%d, name=%s]";

    @JsonProperty("id") private int id;
    @JsonProperty("type") private String type;
    @JsonProperty("cost") private String cost;

    /**
     * Create a need with the given id and name
     * @param id The id of the hero
     * @param name The name of the hero
     * 
     * {@literal @}JsonProperty is used in serialization and deserialization
     * of the JSON object to the Java object in mapping the fields.  If a field
     * is not provided in the JSON object, the Java field gets the default Java
     * value, i.e. 0 for intse
     */
    public Need(@JsonProperty("id") int id, @JsonProperty("type") String type, @JsonProperty("cost") String cost ) {
        this.id = id;
        this.type = type;
        this.cost = cost;
    }

    /**
     * Retrieves the id of the hero
     * @return The id of the hero
     */
    public int getId() {return id;}

    /**
     * Sets the name of the hero - necessary for JSON object to Java object deserialization
     * @param name The name of the hero
     */
    public void setType(String type) {this.type = type;}

    /**
     * Retrieves the name of the hero
     * @return The name of the hero
     */
    public String getType() {return type;}

    /**
     * Sets the cost of the hero - necessary for JSON object to Java object deserialization
     * @param cost The cost of the toy
     */
    public void setCost(String cost) {this.cost = cost;}

    /**
     * Retrieves the cost of the toy
     * @return The cost of the toy
     */
    public String getCost() {return cost;}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return String.format(STRING_FORMAT,id,type,cost);
    }
}