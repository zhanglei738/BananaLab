package com.bigbanana.lab.lab4.alyenc;

import com.bigbanana.lab.lab4.SpringBootInActionHelloService;
import org.springframework.stereotype.Service;

/**
 * @description
 * @package com.bigbanana.lab.lab4.alyenc
 * @author alyenc
 * @email alyenc@outlook.com
 * @date 2018/7/21 22:58
 * @version v1.0.0
 */
@Service
public class AlyencHelloServiceImpl implements SpringBootInActionHelloService {

    @Override
    public String sayHello() {
        return "lab4写完了，哈哈哈哈哈哈哈哈哈哈嗝～";
    }
}
