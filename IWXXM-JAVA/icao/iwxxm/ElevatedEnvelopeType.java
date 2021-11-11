//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.10 at 05:15:57 PM HKT 
//


package icao.iwxxm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.EnvelopeType;


/**
 * <p>Java class for ElevatedEnvelopeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElevatedEnvelopeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}EnvelopeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="upperElevation" type="{http://icao.int/iwxxm/2021-2}ValDistanceVerticalType"/&gt;
 *         &lt;element name="upperVerticalReference" type="{http://www.aixm.aero/schema/5.1.1}CodeVerticalReferenceBaseType" minOccurs="0"/&gt;
 *         &lt;element name="lowerElevation" type="{http://icao.int/iwxxm/2021-2}ValDistanceVerticalType"/&gt;
 *         &lt;element name="lowerVerticalReference" type="{http://www.aixm.aero/schema/5.1.1}CodeVerticalReferenceBaseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElevatedEnvelopeType", propOrder = {
    "upperElevation",
    "upperVerticalReference",
    "lowerElevation",
    "lowerVerticalReference"
})
public class ElevatedEnvelopeType
    extends EnvelopeType
{

    @XmlElement(required = true, nillable = true)
    protected ValDistanceVerticalType upperElevation;
    protected String upperVerticalReference;
    @XmlElement(required = true, nillable = true)
    protected ValDistanceVerticalType lowerElevation;
    protected String lowerVerticalReference;

    /**
     * Gets the value of the upperElevation property.
     * 
     * @return
     *     possible object is
     *     {@link ValDistanceVerticalType }
     *     
     */
    public ValDistanceVerticalType getUpperElevation() {
        return upperElevation;
    }

    /**
     * Sets the value of the upperElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValDistanceVerticalType }
     *     
     */
    public void setUpperElevation(ValDistanceVerticalType value) {
        this.upperElevation = value;
    }

    /**
     * Gets the value of the upperVerticalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperVerticalReference() {
        return upperVerticalReference;
    }

    /**
     * Sets the value of the upperVerticalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperVerticalReference(String value) {
        this.upperVerticalReference = value;
    }

    /**
     * Gets the value of the lowerElevation property.
     * 
     * @return
     *     possible object is
     *     {@link ValDistanceVerticalType }
     *     
     */
    public ValDistanceVerticalType getLowerElevation() {
        return lowerElevation;
    }

    /**
     * Sets the value of the lowerElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValDistanceVerticalType }
     *     
     */
    public void setLowerElevation(ValDistanceVerticalType value) {
        this.lowerElevation = value;
    }

    /**
     * Gets the value of the lowerVerticalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowerVerticalReference() {
        return lowerVerticalReference;
    }

    /**
     * Sets the value of the lowerVerticalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerVerticalReference(String value) {
        this.lowerVerticalReference = value;
    }

}
