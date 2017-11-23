package hu.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("pubs")
public class PubController {


    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public List<String> pubs() {
        return Arrays.asList("pub1", "pub2");
    }

}
