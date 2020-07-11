package com.mudigal.two.domain.cobol;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Diego Marinho
 */

@Data
@Entity
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sql_status")
public class SqlStatus {

  // SQLERRD - este campo é uma exception no Java. Exemplo:  DbException.java

  private String dbConnName;
  private String funcaoWs;
  private String t44807NumPiI;
  private String t44807NumCgcCpfI;
  private String t44807CodRamoI;
  private String t44807CodRamoramoI;
  private String t44807CodFuncaoParcI;

  private String wabendTab;
  private String wabendMsg;
  private String wabendParagrafO;
  private String wabendCodErro;
  private String wabendSqlcode;
  private String wabendSqlmsg;
  private String wabendOper;
  private String w80hifens;

  private DatSisWs datSisWs;
  private HorSisWs horSisWs;
  private PrmTipDateWs prmTipDateWs;

}
