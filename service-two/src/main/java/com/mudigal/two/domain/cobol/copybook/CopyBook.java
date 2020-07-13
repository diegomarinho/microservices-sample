package com.mudigal.two.domain.cobol.copybook;

import lombok.Data;

@Data
public class CopyBook {

    private String wabendTab;
    private String wabendMsg;
    private String wabendParagrafo;
    private String wabendCodErro;
    private int wabendSqlcode;
    private String wabendSqlmsg;
    private String wabendOper;
    private String w80hifens;
    private int datSisWs;
    private DatSisWsR datSisWsR;
    private int horSisWs;
    private HorSisWsR horSisWsR;
    private PrmTipDateWs prmTipDateWs;
    private TipDateNumWs tipDateNumWs;

    @Data
    public static class DatSisWsR {

        private int anoSisWs;
        private int mesSisWs;
        private int diaSisWs;
    }

    @Data
    public static class HorSisWsR {

        private int horMinWs;
        private int filler;
    }

    @Data
    public static class PrmTipDateWs {

        private String anoPrmTipDateWs;
        private String filler1;
        private String mesPrmTipDateWs;
        private String filler2;
        private String diaPrmTipDateWs;
    }

    @Data
    public static class TipDateNumWs {

        private int anoTipDateNumWs;
        private int mesTipDateNumWs;
        private int diaTipDateNumWs;
    }
}
