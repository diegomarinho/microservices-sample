package com.mudigal.two.domain;

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

  private String db_conn_name;
  private String funcao_ws;
  private String t44807_num_cgc_cpf_i;
  private String t44807_cod_ramo_i;
  private String t44807_cod_ramoramo_i;
  private String t44807_cod_funcao_parc_i;

}
