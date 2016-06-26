package com.roger.spring.core.valueinject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 运用属性占位符${...}进行运行时值注入
 *
 * Created by Roger on 2016/6/26.
 */
@Component
public class PropertyPlaceholder {

    @Value("${test.title}")
    private String title;

    @Value("${test.content}")
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
