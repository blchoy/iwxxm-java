//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.14 at 03:55:23 AM UTC 
//


package icao.iwxxm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CloudLayerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CloudLayerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://icao.int/iwxxm/3.0}CloudAmountReportedAtAerodromeType"/&gt;
 *         &lt;element name="base" type="{http://icao.int/iwxxm/3.0}DistanceWithNilReasonType"/&gt;
 *         &lt;element name="cloudType" type="{http://icao.int/iwxxm/3.0}SigConvectiveCloudTypeType" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/3.0}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CloudLayerType", propOrder = {
    "amount",
    "base",
    "cloudType",
    "extension"
})
public class CloudLayerType {

    @XmlElement(required = true, nillable = true)
    protected CloudAmountReportedAtAerodromeType amount;
    @XmlElement(required = true, nillable = true)
    protected DistanceWithNilReasonType base;
    @XmlElementRef(name = "cloudType", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<SigConvectiveCloudTypeType> cloudType;
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link CloudAmountReportedAtAerodromeType }
     *     
     */
    public CloudAmountReportedAtAerodromeType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloudAmountReportedAtAerodromeType }
     *     
     */
    public void setAmount(CloudAmountReportedAtAerodromeType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceWithNilReasonType }
     *     
     */
    public DistanceWithNilReasonType getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceWithNilReasonType }
     *     
     */
    public void setBase(DistanceWithNilReasonType value) {
        this.base = value;
    }

    /**
     * Gets the value of the cloudType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SigConvectiveCloudTypeType }{@code >}
     *     
     */
    public JAXBElement<SigConvectiveCloudTypeType> getCloudType() {
        return cloudType;
    }

    /**
     * Sets the value of the cloudType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SigConvectiveCloudTypeType }{@code >}
     *     
     */
    public void setCloudType(JAXBElement<SigConvectiveCloudTypeType> value) {
        this.cloudType = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
    }

}
