/**
 Author: Hicham B.I.
 Date: 27/09/14
 Time: 00:37
 */

package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    String getHelloJsp(ModelMap model) {
        model.addAttribute("message", "hello cruel world");
        return "hello";
    }
}
