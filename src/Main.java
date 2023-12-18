import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        BigDecimal numero1 = new BigDecimal(20.5);
        BigDecimal numero2 = new BigDecimal(22.5);
        operazione(numero1,OperatoriEnum.MULTI,numero2);

    }
    public static void operazione(BigDecimal numero1,OperatoriEnum operatoriEnum,BigDecimal numero2){
        BigDecimal risultato= BigDecimal.valueOf(0);
        switch (operatoriEnum){
            case ADD:
                risultato = numero1.add(numero2);
                break;
            case SUB:
                risultato = numero1.subtract(numero2);
                break;
            case MULTI:
                risultato = numero1.multiply(numero2);
                break;
            case DIV:
                risultato = numero1.divide(numero2);
                break;
            case MIN:
                risultato = numero1.min(numero2);
                break;
            case MAX:
                risultato = numero1.max(numero2);
                break;
        }
        System.out.println(risultato);
    }
}
