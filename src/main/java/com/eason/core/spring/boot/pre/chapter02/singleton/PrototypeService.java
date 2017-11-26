package com.eason.core.spring.boot.pre.chapter02.singleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author fengyingsheng on 2017/11/14.
 */
@Service("PrototypeService")
@Scope("prototype")
public class PrototypeService {
}
