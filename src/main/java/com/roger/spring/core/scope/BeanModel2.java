package com.roger.spring.core.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Roger on 2016/6/26.
 */
@Component
public class BeanModel2 {

    @Autowired
    private BeanScopeSingleton singleton;

    @Autowired
    private BeanScopePrototype prototype;

    public BeanScopeSingleton getSingleton() {
        return singleton;
    }

    public void setSingleton(BeanScopeSingleton singleton) {
        this.singleton = singleton;
    }

    public BeanScopePrototype getPrototype() {
        return prototype;
    }

    public void setPrototype(BeanScopePrototype prototype) {
        this.prototype = prototype;
    }
}
