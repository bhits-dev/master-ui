package gov.samhsa.c2s.masterui;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class StaticContentController {
    @RequestMapping(value = "/configError", method = RequestMethod.GET)
    public String getConfigFailure() {
        return "configFailure.html";
    }
}
