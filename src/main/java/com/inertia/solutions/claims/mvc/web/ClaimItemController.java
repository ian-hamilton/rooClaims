package com.inertia.solutions.claims.mvc.web;
import com.inertia.solutions.claims.mvc.domain.ClaimItem;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/claimitems")
@Controller
@RooWebScaffold(path = "claimitems", formBackingObject = ClaimItem.class)
@RooWebJson(jsonObject = ClaimItem.class)
public class ClaimItemController {
}
