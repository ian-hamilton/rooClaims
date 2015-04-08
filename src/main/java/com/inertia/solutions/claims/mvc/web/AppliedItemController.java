package com.inertia.solutions.claims.mvc.web;
import com.inertia.solutions.claims.mvc.domain.AppliedItem;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/applieditems")
@Controller
@RooWebScaffold(path = "applieditems", formBackingObject = AppliedItem.class)
@RooWebJson(jsonObject = AppliedItem.class)
public class AppliedItemController {
}
