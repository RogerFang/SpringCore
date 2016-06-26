package com.roger.spring.core.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 默认作用域
 * 单例(Singleton):整个应用中，只创建一个实例
 *
 * Created by Roger on 2016/6/26.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
// @Scope("singleton")
public class BeanScopeSingleton {
}
