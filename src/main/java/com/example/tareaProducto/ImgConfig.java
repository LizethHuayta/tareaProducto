
package com.example.tareaProducto;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ImgConfig implements WebMvcConfigurer{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry); 
        registry.addResourceHandler("/imagenes/**").addResourceLocations("file:/D:/producto/imagenes/");
        //registry.addResourceHandler("/files1/**").addResourceLocations("file:/D:/recursos/images/files1/");

    }
    
}