package com.inertia.solutions.claims.mvc.web;
import com.inertia.solutions.claims.mvc.domain.Claim;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/claims")
@Controller
@RooWebScaffold(path = "claims", formBackingObject = Claim.class)
@RooWebJson(jsonObject = Claim.class)
public class ClaimController {
}
