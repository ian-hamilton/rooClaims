// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.inertia.solutions.claims.mvc.domain;

import com.inertia.solutions.claims.mvc.domain.AppliedItem;
import java.math.BigInteger;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;

privileged aspect AppliedItem_Roo_Mongo_Entity {
    
    declare @type: AppliedItem: @Persistent;
    
    @Id
    private BigInteger AppliedItem.id_;
    
    public BigInteger AppliedItem.getId_() {
        return this.id_;
    }
    
    public void AppliedItem.setId_(BigInteger id) {
        this.id_ = id;
    }
    
}