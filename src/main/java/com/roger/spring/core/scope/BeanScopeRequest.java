package com.roger.spring.core.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * 请求(Request): 在Web应用中，为每个请求创建一个bean实例
 *
 * Created by Roger on 2016/6/26.
 */
@Component
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class BeanScopeRequest {
}
