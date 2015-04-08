package com.inertia.solutions.claims.mvc.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.json.RooJson;

@RooJavaBean
@RooToString
@RooMongoEntity
@RooJson
public class ClaimItem {

    /**
     */
    private String id;

    /**
     */
    private String claimItemName;

    /**
     */
    private String ClaimItemDesc;

    /**
     */
    private Double claimItemAmount;
}
