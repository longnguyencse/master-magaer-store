package lln.org.vn.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class BaseController {

    @GetMapping("")
    public String getSample() {
        return "hello";
    }
}
