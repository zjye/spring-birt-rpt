package org.zjye.report.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooReportController {

    @RequestMapping(value = "foo", method = RequestMethod.GET)
    public void generate() throws Exception {

    }
}
