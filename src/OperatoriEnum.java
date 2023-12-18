public enum OperatoriEnum {
    ADD("Addizione"),
    SUB("Sottrazione"),
    MULTI("Moltiplicazione"),
    DIV("Divisione"),
    MIN("Minimo"),
    MAX("Massimo");
    private String operazioneEnum;
    OperatoriEnum(String operazioneEnum){
        this.operazioneEnum = operazioneEnum;
    }

    public String getOperazioneEnum() {
        return operazioneEnum;
    }
}
