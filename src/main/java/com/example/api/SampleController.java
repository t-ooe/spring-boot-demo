package com.example.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nico on 2016/04/03.
 */
@RestController
public class SampleController {
    @RequestMapping(method= RequestMethod.GET)
    public Map<String, Object> get() {
        Map<String, Object> result = new HashMap<>();
        result.put("hello", "world");
        return result;
    }
}
