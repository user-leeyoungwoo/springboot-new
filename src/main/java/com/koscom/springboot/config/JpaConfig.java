package com.koscom.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration  //스프링부트에서 설정 클래스임을 알려주는 어노테이션
@EnableJpaAuditing // jpa auditing 활성화
public class JpaConfig {
}
