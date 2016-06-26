package com.roger.spring.core.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 原型(prototype): 每次注入或者通过spring应用上下文获取的时候，都会创建一个新的bean实例
 *
 * Created by Roger on 2016/6/26.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// @Scope("prototype")
public class BeanScopePrototype {
}
