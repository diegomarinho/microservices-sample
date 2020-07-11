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
@Table(name = "TIP_DATE_NUM_WS")
public class TipDateNumWs {

  @Column(name = "ANO_TIP_DATE_NUM_WS")
  private LocalDate anoTipDateNumWs;

  @Column(name = "MES_TIP_DATE_NUM_WS")
  private LocalDate mesTipDateNumWs;

  @Column(name = "DIA_TIP_DATE_NUM_WS")
  private LocalDate diaTipDateNumWs;

}
