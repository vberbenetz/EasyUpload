package easyupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@EnableAutoConfiguration
@RestController
public class EasyUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyUploadApplication.class, args);
    }

}
