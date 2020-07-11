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
@Table(name = "PRM_TIP_DATE_WS")
public class PrmTipDateWs {

  @Column(name = "ANO_PRM_TIP_DATE_WS")
  private LocalDate anoPrmTipDateWs;

  @Column(name = "MES_PRM_TIP_DATE_WS")
  private LocalDate mesPrmTipDateWs;

  @Column(name = "DIA_PRM_TIP_DATE_WS")
  private LocalDate diaPrmTipDateWs;

}
