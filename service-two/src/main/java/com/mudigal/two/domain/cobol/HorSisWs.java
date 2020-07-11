package com.mudigal.two.domain.cobol;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author Diego Marinho
 */

@Data
@Entity
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "HOR_SIS_WS")
public class HorSisWs {

  @Column(name = "HOR_MIN_WS")
  private LocalDateTime horMinWs;

  @Column(name = "FILLER")
  private String filler;

}
