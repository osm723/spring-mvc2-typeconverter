package hellp.typeconverter;

import hellp.typeconverter.converter.IntegerToStringConverter;
import hellp.typeconverter.converter.IpPortToStringConverter;
import hellp.typeconverter.converter.StringToIntegerConverter;
import hellp.typeconverter.converter.StringToIpPortConverter;
import hellp.typeconverter.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        //registry.addConverter(new StringToIntegerConverter());
        //registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new IpPortToStringConverter());

        registry.addFormatter(new MyNumberFormatter());
    }
}
