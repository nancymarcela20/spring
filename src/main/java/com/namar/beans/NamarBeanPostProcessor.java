package com.namar.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class NamarBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Después de la Inicialización:"+ beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Antes de la Inicialización:"+ beanName);
		return bean;
	}

}
