package com.inertia.solutions.claims.mvc.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Enumerated;
import org.springframework.roo.addon.json.RooJson;

@RooJavaBean
@RooToString
@RooMongoEntity
@RooJson
public class AppliedItem {

    /**
     */
    private String id;

    /**
     */
    private String appliedItemName;

    /**
     */
    private String appliedItemDesc;

    /**
     */
    private Double appliedItemAmount;

    /**
     */
    @Enumerated
    private ClaimType claimType;
}
