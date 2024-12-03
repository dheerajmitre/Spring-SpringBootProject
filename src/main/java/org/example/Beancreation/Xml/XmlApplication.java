package org.example.Beancreation.Xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication

@ImportResource("Spring/spring.config.xml")

public class XmlApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(XmlApplication.class, args);
        XmlBean bean = (XmlBean) ctx.getBean("xmlBean2", XmlBean.class);
        bean.Petrol();
    }

}