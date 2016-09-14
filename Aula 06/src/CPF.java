/**
 * Created by ramon on 31/08/16.
 */
public class CPF {

    /**
     * Created by ramon on 01/04/15.
     */

        String numero;



    public static Boolean validar(String cpf) {
        removerCaracteres(cpf);
        if (estaComFormatoInvalido(cpf)) return false;

        int primeiroDigitoVerificador, segundoDigitoVerificador;
        String digitos = cpf.substring(0,9);
        String digitosVerificador = cpf.substring(9);

        primeiroDigitoVerificador = calcularPrimeiroDigitoVerificador(digitos);
        segundoDigitoVerificador = calcularSegundoDigitoVerificador(digitos + primeiroDigitoVerificador);

        StringBuilder digitosVerificadorCalculado = new StringBuilder()
                .append(primeiroDigitoVerificador)
                .append(segundoDigitoVerificador);

        return digitosVerificador.equals(digitosVerificadorCalculado.toString());
    }

    private static void removerCaracteres(String cpf) {
        cpf = cpf.replaceAll("-", "").replaceAll("/", "").replaceAll("\\.", "").replaceAll(",", "").trim();
    }

    private static boolean estaComFormatoInvalido(String cpf) {
        return (cpf.equals("00000000000") || cpf.equals("11111111111") ||
                cpf.equals("22222222222") || cpf.equals("33333333333") ||
                cpf.equals("44444444444") || cpf.equals("55555555555") ||
                cpf.equals("66666666666") || cpf.equals("77777777777") ||
                cpf.equals("88888888888") || cpf.equals("99999999999") ||
                cpf.length() != 11);
    }

    private static Integer calcularPrimeiroDigitoVerificador(String digitos) {
        int soma = 0, digitoVerificador = 0, digito, multiplicador;
        for (int i = 0; i < 9; i++) {
            multiplicador = i + 1;
            digito = Character.getNumericValue(digitos.charAt(i));
            soma += digito * multiplicador;
        }
        digitoVerificador = soma % 11;
        digitoVerificador = digitoVerificador >= 10 ? 0 : digitoVerificador;
        return digitoVerificador;
    }

    private static Integer calcularSegundoDigitoVerificador(String digitos) {
        int soma = 0, digitoVerificador = 0, digito, multiplicador;
        for (int i = 0; i < 10; i++) {
            multiplicador = i;
            digito = Character.getNumericValue(digitos.charAt(i));
            soma += digito * multiplicador;
        }
        digitoVerificador = soma % 11;
        digitoVerificador = digitoVerificador >= 10 ? 0 : digitoVerificador;
        return digitoVerificador;
    }



    }
