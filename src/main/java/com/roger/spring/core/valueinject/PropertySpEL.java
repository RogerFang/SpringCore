package com.roger.spring.core.valueinject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 运用Spring 表达式语言 #{...}进行运行时值注入
 *
 * problem:
 * Then "#{a['something']}" is a SpEL expression (see SpEL), that means "get something from bean 'a'".
 * When util:properties is used, the bean exists and the expression is meaningful,
 * but when @PropertySource is used, there is no actual bean and the expression is meaningless.
 *
 * 但是可以使用environment.getProperty(key)获取数据
 *
 * Created by Roger on 2016/6/26.
 */
@Component
public class PropertySpEL {

    @Value("#{environment['test.title']}")
    private String title;
    @Value("#{environment['test.content']}")
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
