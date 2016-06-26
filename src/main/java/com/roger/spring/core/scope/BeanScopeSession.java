package com.roger.spring.core.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * 会话(session): 在Web应用中，为每个会话创建一个bean实例
 *
 * Created by Roger on 2016/6/26.
 */
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
// @Scope("session")
public class BeanScopeSession {
}
