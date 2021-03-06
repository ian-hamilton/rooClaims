// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.inertia.solutions.claims.mvc.web;

import com.inertia.solutions.claims.mvc.domain.AppliedItem;
import com.inertia.solutions.claims.mvc.domain.ClaimType;
import com.inertia.solutions.claims.mvc.web.AppliedItemController;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect AppliedItemController_Roo_Controller {
    
    void AppliedItemController.populateEditForm(Model uiModel, AppliedItem appliedItem) {
        uiModel.addAttribute("appliedItem", appliedItem);
        uiModel.addAttribute("claimtypes", Arrays.asList(ClaimType.values()));
    }
    
    String AppliedItemController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
