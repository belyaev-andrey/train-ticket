package auth.security.jwt;

import auth.constant.InfoConstant;
import auth.entity.User;
import edu.fudan.common.security.jwt.JWTUtil;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author fdse
 */
@Component
public class JWTProvider {

    private long validityInMilliseconds = 3600000;

    public String createToken(User user) {

        Date now = new Date();
        Date validate = new Date(now.getTime() + validityInMilliseconds);

        return Jwts.builder()
                .subject(user.getUsername())
                .claim(InfoConstant.ROLES, user.getRoles())
                .claim(InfoConstant.ID, user.getUserId())
                .issuedAt(now)
                .expiration(validate)
                .signWith(JWTUtil.signingKey(), Jwts.SIG.HS256)
                .compact();
    }
}