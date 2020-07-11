package com.mudigal.two.domain.cobol;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

/**
 * @author Diego Marinho
 */

@Data
@Entity
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DAT_SIS_WS")
public class DatSisWs {

  @Column(name = "ANO_SIS_WS")
  private LocalDate anoSisWs;

  @Column(name = "MES_SIS_WS")
  private LocalDate mesSisWs;

  @Column(name = "DIA_SIS_WS")
  private LocalDate diaSisWs;

}
