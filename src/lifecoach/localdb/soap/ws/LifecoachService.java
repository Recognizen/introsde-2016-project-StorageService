
package lifecoach.localdb.soap.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LifecoachService", targetNamespace = "http://ws.soap.localdb.lifecoach/", wsdlLocation = "https://virtual-lifecoach-localdb.herokuapp.com/ws/lifecoach?wsdl")
public class LifecoachService
    extends Service
{

    private final static URL LIFECOACHSERVICE_WSDL_LOCATION;
    private final static WebServiceException LIFECOACHSERVICE_EXCEPTION;
    private final static QName LIFECOACHSERVICE_QNAME = new QName("http://ws.soap.localdb.lifecoach/", "LifecoachService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://virtual-lifecoach-localdb.herokuapp.com/ws/lifecoach?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LIFECOACHSERVICE_WSDL_LOCATION = url;
        LIFECOACHSERVICE_EXCEPTION = e;
    }

    public LifecoachService() {
        super(__getWsdlLocation(), LIFECOACHSERVICE_QNAME);
    }

    public LifecoachService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LIFECOACHSERVICE_QNAME, features);
    }

    public LifecoachService(URL wsdlLocation) {
        super(wsdlLocation, LIFECOACHSERVICE_QNAME);
    }

    public LifecoachService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LIFECOACHSERVICE_QNAME, features);
    }

    public LifecoachService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LifecoachService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Lifecoach
     */
    @WebEndpoint(name = "LifecoachImplPort")
    public Lifecoach getLifecoachImplPort() {
        return super.getPort(new QName("http://ws.soap.localdb.lifecoach/", "LifecoachImplPort"), Lifecoach.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Lifecoach
     */
    @WebEndpoint(name = "LifecoachImplPort")
    public Lifecoach getLifecoachImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.soap.localdb.lifecoach/", "LifecoachImplPort"), Lifecoach.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LIFECOACHSERVICE_EXCEPTION!= null) {
            throw LIFECOACHSERVICE_EXCEPTION;
        }
        return LIFECOACHSERVICE_WSDL_LOCATION;
    }

}
