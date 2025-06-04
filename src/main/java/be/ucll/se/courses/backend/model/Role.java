package be.ucll.se.courses.backend.model;

import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Locale;

public enum Role {
    ADMIN,
    STUDENT,
    LECTURER,
    GUEST;

    public GrantedAuthority toGrantedAuthority() {
        return new SimpleGrantedAuthority("ROLE_" + name());
    }

    @Override
    @JsonValue
    public String toString() {
        return super.toString().toLowerCase(Locale.ROOT);
    }
}
