//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 10:49:53 AM HKT 
//


package net.opengis.gml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeCalendarEraType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeCalendarEraType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}DefinitionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceEvent" type="{http://www.opengis.net/gml/3.2}StringOrRefType"/&gt;
 *         &lt;element name="referenceDate" type="{http://www.opengis.net/gml/3.2}CalDate"/&gt;
 *         &lt;element name="julianReference" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="epochOfUse" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeCalendarEraType", propOrder = {
    "referenceEvent",
    "referenceDate",
    "julianReference",
    "epochOfUse"
})
public class TimeCalendarEraType
    extends DefinitionType
{

    @XmlElement(required = true)
    protected StringOrRefType referenceEvent;
    @XmlElement(required = true)
    protected String referenceDate;
    @XmlElement(required = true)
    protected BigDecimal julianReference;
    @XmlElement(required = true)
    protected TimePeriodPropertyType epochOfUse;

    /**
     * Gets the value of the referenceEvent property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getReferenceEvent() {
        return referenceEvent;
    }

    /**
     * Sets the value of the referenceEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setReferenceEvent(StringOrRefType value) {
        this.referenceEvent = value;
    }

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDate(String value) {
        this.referenceDate = value;
    }

    /**
     * Gets the value of the julianReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJulianReference() {
        return julianReference;
    }

    /**
     * Sets the value of the julianReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJulianReference(BigDecimal value) {
        this.julianReference = value;
    }

    /**
     * Gets the value of the epochOfUse property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getEpochOfUse() {
        return epochOfUse;
    }

    /**
     * Sets the value of the epochOfUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setEpochOfUse(TimePeriodPropertyType value) {
        this.epochOfUse = value;
    }

}