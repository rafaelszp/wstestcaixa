import br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ConsultaCobrancaBancariaBoleto;
import br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.ConsultaCobrancaBancariaBoleto_Service;
import br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SERVICOENTRADANEGOCIALTYPE;
import br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto.SERVICOSAIDANEGOCIALTYPE;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

public class Client {

  public static void main(String... args) throws NoSuchAlgorithmException, KeyManagementException {
    ConsultaCobrancaBancariaBoleto_Service service = new ConsultaCobrancaBancariaBoleto_Service();
    ConsultaCobrancaBancariaBoleto consultaCobrancaBancariaBoletoSOAP = service.getConsultaCobrancaBancariaBoletoSOAP();
    SERVICOENTRADANEGOCIALTYPE t = new SERVICOENTRADANEGOCIALTYPE();
    SERVICOSAIDANEGOCIALTYPE retorno = consultaCobrancaBancariaBoletoSOAP.consultaBOLETO(t);
    System.out.println(retorno);

  }


}
