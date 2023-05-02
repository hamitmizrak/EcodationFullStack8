package com.hamitmizrak.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import java.util.Optional;

public class AuditingAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // Sisteme girmiş kullanıcı bilgilerini almak;
        // sayfaya giriş yapmış kullanıcı bilgisi
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        // Sisteme girmiş kullanıcı varsa
        if(authentication!=null && authentication.isAuthenticated()){
            //getName(): Sistemdeki kullanıcı adı
            return Optional.of(authentication.getName());
        }
        return Optional.of("HamitM.");
    }
}
