//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.19 at 05:08:49 PM IST 
//


package soap.invoices;

import javax.xml.bind.annotation.*;




@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "invoiceDetails"
})
@XmlRootElement(name = "GetInvoiceDetailsResponse")
public class GetInvoiceDetailsResponse {

    @XmlElement(name = "InvoiceDetails", required = true)
    protected soap.invoices.InvoiceDetails invoiceDetails;

    public soap.invoices.InvoiceDetails getInvoiceDetails() {
        return invoiceDetails;
    }


    public void setInvoiceDetails(soap.invoices.InvoiceDetails value) {
        this.invoiceDetails = value;
    }

}
