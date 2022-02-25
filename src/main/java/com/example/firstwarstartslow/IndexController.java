package com.example.firstwarstartslow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@RequestMapping("/")
@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);


    @GetMapping
    public String index(Model model) throws IOException {
        logger.info("start index");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        BeanTest beanTest1 = new BeanTest();
        beanTest1.name = "toto";
        BeanTest beanTest2 = new BeanTest();
        /* Launch bean copy to force the use of an external JAR */
        BeanUtils.copyProperties(beanTest1, beanTest2);
        stopWatch.stop();
        model.addAttribute("time", stopWatch.getTotalTimeSeconds());
        return "index";
    }

}
