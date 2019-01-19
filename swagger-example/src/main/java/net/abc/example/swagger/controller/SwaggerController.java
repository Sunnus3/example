package net.abc.example.swagger.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.abc.example.swagger.model.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhangwei
 * @date: 19:55/2019-01-19
 */
@RestController
public class SwaggerController {

    @ApiOperation(value = "foo")
    @GetMapping(value = "/foo")
    public Model foo(
            @ApiParam(required = true, name = "name", defaultValue = "example") @RequestParam String name,
            @ApiParam(required = true, name = "age", defaultValue = "1") @RequestParam Integer age){
        return new Model(name, age);
    }
}
