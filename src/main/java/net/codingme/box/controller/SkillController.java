package net.codingme.box.controller;

import net.codingme.box.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2019/3/20 11:33
 */
@RestController
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping(value = "/sell/skill")
    public String skill(String product) {
        return skillService.skillProduct(product);
    }

    @GetMapping(value = "/sell/skill-redis")
    public String skillRedis(String product) {
        return skillService.skillProductByRedis(product);
    }

    @GetMapping(value = "/sell/skill/query")
    public String querySkillProductInfo(String product) {
        return skillService.querySkillProductInfo(product);
    }

}
