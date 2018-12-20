
package br.gov.caixa.sibar.consulta_cobranca_bancaria.boleto;

import sample.ssl.GullibleManager;

import javax.net.ssl.*;
import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "Consulta_Cobranca_Bancaria_Boleto", targetNamespace = "http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", wsdlLocation = "https://barramento.caixa.gov.br/sibar/ConsultaCobrancaBancaria/Boleto?wsdl")
public class ConsultaCobrancaBancariaBoleto_Service
    extends Service
{

    private final static URL CONSULTACOBRANCABANCARIABOLETO_WSDL_LOCATION;
    private final static WebServiceException CONSULTACOBRANCABANCARIABOLETO_EXCEPTION;
    private final static QName CONSULTACOBRANCABANCARIABOLETO_QNAME = new QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "Consulta_Cobranca_Bancaria_Boleto");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://barramento.caixa.gov.br/sibar/ConsultaCobrancaBancaria/Boleto?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTACOBRANCABANCARIABOLETO_WSDL_LOCATION = url;
        CONSULTACOBRANCABANCARIABOLETO_EXCEPTION = e;
    }

    public ConsultaCobrancaBancariaBoleto_Service() {
        super(__getWsdlLocation(), CONSULTACOBRANCABANCARIABOLETO_QNAME);
    }

    public ConsultaCobrancaBancariaBoleto_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTACOBRANCABANCARIABOLETO_QNAME, features);
    }

    public ConsultaCobrancaBancariaBoleto_Service(URL wsdlLocation) {
        super(wsdlLocation, CONSULTACOBRANCABANCARIABOLETO_QNAME);
    }

    public ConsultaCobrancaBancariaBoleto_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTACOBRANCABANCARIABOLETO_QNAME, features);
    }

    public ConsultaCobrancaBancariaBoleto_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaCobrancaBancariaBoleto_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaCobrancaBancariaBoleto
     */
    @WebEndpoint(name = "Consulta_Cobranca_Bancaria_BoletoSOAP")
    public ConsultaCobrancaBancariaBoleto getConsultaCobrancaBancariaBoletoSOAP() {



        return super.getPort(new QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "Consulta_Cobranca_Bancaria_BoletoSOAP"), ConsultaCobrancaBancariaBoleto.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaCobrancaBancariaBoleto
     */
    @WebEndpoint(name = "Consulta_Cobranca_Bancaria_BoletoSOAP")
    public ConsultaCobrancaBancariaBoleto getConsultaCobrancaBancariaBoletoSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://caixa.gov.br/sibar/consulta_cobranca_bancaria/boleto", "Consulta_Cobranca_Bancaria_BoletoSOAP"), ConsultaCobrancaBancariaBoleto.class, features);
    }

    private static URL __getWsdlLocation() {
        //Reference: https://stackoverflow.com/questions/41280648/how-to-create-metro-soap-client-service-in-spring
        try {
            SSLContext ctx = SSLContext.getInstance("TLS");
            ctx.init(null, new TrustManager[] { new GullibleManager() }, null);
            HttpsURLConnection.setDefaultSSLSocketFactory(ctx.getSocketFactory());

            // Create all-trusting host name verifier
            HostnameVerifier allHostsValid = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };
            // Install the all-trusting host verifier
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        if (CONSULTACOBRANCABANCARIABOLETO_EXCEPTION!= null) {
            throw CONSULTACOBRANCABANCARIABOLETO_EXCEPTION;
        }
        return CONSULTACOBRANCABANCARIABOLETO_WSDL_LOCATION;
    }

}


