package hellp.typeconverter.controller;

import hellp.typeconverter.type.IpPort;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request, HttpServletResponse response) {
        String data = request.getParameter("data");
        Integer intValue = Integer.valueOf(data);
        System.out.println("intValue = " + intValue);

        return "ok";
    }

    @GetMapping("/hello-v2")
    public String helloV2(@RequestParam("data") Integer intValue) {
        System.out.println("intValue = " + intValue);

        return "ok";
    }

    @GetMapping("/ip-port")
    public String ipPort(@RequestParam IpPort ipPort) {
        System.out.println("ip = " + ipPort.getIp());
        System.out.println("port = " + ipPort.getPort());

        return "ok";
    }

}
