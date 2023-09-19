package auction.web.member.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member {
    @Id
    private Long id;
    private Long roleId;
    private String email;
    private String password;
    private String name;
    private String nickname;
    private LocalDateTime reg_date;
}
