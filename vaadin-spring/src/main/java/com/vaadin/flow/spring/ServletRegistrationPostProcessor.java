package com.vaadin.flow.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class ServletRegistrationPostProcessor implements BeanPostProcessor, Serializable {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("beanName = " + beanName);
        return bean;
    }
}
