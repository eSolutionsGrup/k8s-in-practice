package ro.esolutions.k8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public Map<String, String> hello() throws UnknownHostException {
        return Map.of("hostname", InetAddress.getLocalHost().getHostName(), "app", "hello-world");
    }
}
