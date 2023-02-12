package com.psjw.kakaoshareprototype.config.auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

/**
 * packageName : com.psjw.kakaoshareprototype.config.auth
 * fileName : PricipalOauth2UserService
 * author : psjw
 */
@Service
@Slf4j
public class PrincipalOauth2UserService extends DefaultOAuth2UserService {
    
    //구글로 부타 받은 userRequest 데이터에 대한 후처리되는 함수
    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        log.info("userRequest.getClientRegistration() : {}",userRequest.getClientRegistration());
        log.info("userRequest.getAccessToken() : {}",userRequest.getAccessToken().getTokenValue());
        log.info("super.loadUser(userRequest) : {}",super.loadUser(userRequest).getAttributes());
        return super.loadUser(userRequest);
    }
}
