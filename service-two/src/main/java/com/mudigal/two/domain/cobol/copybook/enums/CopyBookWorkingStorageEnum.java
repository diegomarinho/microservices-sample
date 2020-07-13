/*
* Copyright(c) by VR Benefícios
*
* All rights reserved.
*
* This software is confidential and proprietary information of
* VR Benefícios ("Confidential Information").
* You shall not disclose such Confidential Information and shall
* use it only in accordance with the terms of the license agreement
* you entered with VR Benefícios.
*/

package com.mudigal.two.domain.cobol.copybook.enums;

import lombok.Getter;

/**
 * Classe que contém as constantes de sessão WORKING-STORAGE.
 * 
 * @author Diego Marinho
 */
public enum CopyBookWorkingStorageEnum {

    /**
     * Enum utilizado quando ...
     */
    CT_S50B023S("0", "Definir descrição do enum.", "S50B023S"),

    /**
     * Enum utilizado quando ...
     */
    PRIMEIRA_VEZ_WS("1", "Definir descrição do enum.", " "),

    /**
     * Enum utilizado quando ...
     */
    FIM_CURSOR_WS("2", "Definir descrição do enum.", " "),

    /**
     * Enum utilizado quando ...
     */
    RAMO_WS("3", "Definir descrição do enum.", "0000"),

    /**
     * Enum utilizado quando ...
     */
    RAMORAMO_WS("4", "Definir descrição do enum.", "0000"),

    /**
     * Enum utilizado quando ...
     */
    QTD_FETCH_S("5", "Definir descrição do enum.", "000000000"),

    /**
     * Enum utilizado quando ...
     */
    QTD_ZICL01_WS("6", "Definir descrição do enum.", "000000000"),

    /**
     * Enum utilizado quando ...
     */
    QTD_ZICL06_WS("7", "Definir descrição do enum.", "000000000"),

    /**
     * Enum utilizado quando ...
     */
    QTD_UPDATE_WS("8", "Definir descrição do enum.", "000000000"),

    /**
     * Enum utilizado quando ...
     */
    QTD_ALT_ENDERCOB_WS("9", "Definir descrição do enum.", "0000000"),

    /**
     * Enum utilizado quando ...
     */
    QTD_GRA_ENDERCOB_WS("10", "Definir descrição do enum.", "0000000"),

    /**
     * Enum utilizado quando ...
     */
    QTD_NOTFOUND_RAMO_WS("11", "Definir descrição do enum.", "0000000"),

    /**
     * Enum utilizado quando ...
     */
    QTD_NOTFOUND_RRAMO_WS("12", "Definir descrição do enum.", "0000000"),

    /**
     * Mensagem utilizada quando não é encontrada nenhuma outra mensagem cadastrada.
     */
    UNKNOWN("9999", "Mensagem desconhecida ou não informada ou não de negócio.", "Desconhecido");

    @Getter
    private final String codigo;

    @Getter
    private final String descricao;

    @Getter
    private final String valor;

    /**
     * Constrói o objeto WORKING-STORAGE com um código + uma descrição e um valor.
     *
     * @param codigo
     *          String - Código do WORKING-STORAGE.
     *
     * @param descricao
     *          String - Descrição do WORKING-STORAGE.
     *
     *  @param valor
     *          String - Valor do WORKING-STORAGE.
     */
    CopyBookWorkingStorageEnum(final String codigo, final String descricao, final String valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    /**
     * Metodo responsavel por receber o WORKING-STORAG e trocar por valores passados.
     * 
     * @param params
     *          String... - parametros para realizar troca da referência por valor.
     * 
     * @return String
     *          Texto do enum do WORKING-STORAGE, com os devidos replaces.
     */
    public String show(String... params) {
        Integer i = 0;
        String retorno = this.descricao;

        for (String param : params) {
            retorno = retorno.replace("${" + i + "}", param);
            i += 1;
        }

        return retorno;
    }

    /**
     * Método responsavel por receber a mensagem e trocar por valores passados, concatenando com o código do WORKING-STORAGE.
     * 
     * @param params
     *            String... - parâmetros para realizar troca da referência por valor.
     * 
     * @return String
     *          Texto com os replaces, concatenado com o código do Working-Storage.
     */
    public String showCode(String... params) {

        final String delimitador = "||";
        return this.codigo + delimitador + this.show(params);
    }
    
    /**
     * Método para recupear o HttpStatus correspondente a mensagem.
     * 
     * @param code String do codigo de negócio do WORKING-STORAGE.
     * 
     * @return HttpStatus encontrado.
     */
    public static String getValor(String code) {
        for (CopyBookWorkingStorageEnum copyBookWorkingStorageEnum : values()) {
            if (copyBookWorkingStorageEnum.codigo.equalsIgnoreCase(code)) {
                return copyBookWorkingStorageEnum.getValor();
            }
        }
        return null;
    }

}
