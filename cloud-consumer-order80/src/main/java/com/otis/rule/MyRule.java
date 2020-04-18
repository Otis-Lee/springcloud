package com.otis.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Otis
 * @date 2020/4/17/0017   21:22
 */
@Configuration
public class MyRule {

    @Bean
    public IRule iRule(){
//        new RoundRobinRule();
//        new RetryRule();
        return new RandomRule();
    }

}
