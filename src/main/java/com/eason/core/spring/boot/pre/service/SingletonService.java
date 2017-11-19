package com.eason.core.spring.boot.pre.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Singleton
 *
 * @author fengyingsheng on 2017/11/14.
 */
@Service("SingletonService")
@Scope("singleton")
public class SingletonService {
}
