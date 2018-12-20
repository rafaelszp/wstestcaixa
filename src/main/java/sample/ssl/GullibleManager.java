package sample.ssl;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Reference: https://stackoverflow.com/questions/41280648/how-to-create-metro-soap-client-service-in-spring*/
public class GullibleManager implements X509TrustManager {

  public X509Certificate[] getAcceptedIssuers() {
    return null;
  }

  public void checkClientTrusted(X509Certificate[] chain, String authType)
          throws CertificateException {

  }

  public void checkServerTrusted(X509Certificate[] chain, String authType)
          throws CertificateException {


  }
}