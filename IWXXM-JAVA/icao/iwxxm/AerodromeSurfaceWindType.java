//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.10 at 05:15:57 PM HKT 
//


package icao.iwxxm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AerodromeSurfaceWindType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeSurfaceWindType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="meanWindDirection" type="{http://icao.int/iwxxm/2021-2}AngleWithNilReasonType" minOccurs="0"/&gt;
 *         &lt;element name="meanWindSpeed" type="{http://icao.int/iwxxm/2021-2}VelocityWithNilReasonType"/&gt;
 *         &lt;element name="meanWindSpeedOperator" type="{http://icao.int/iwxxm/2021-2}RelationalOperatorType" minOccurs="0"/&gt;
 *         &lt;element name="windGustSpeed" type="{http://icao.int/iwxxm/2021-2}VelocityWithNilReasonType" minOccurs="0"/&gt;
 *         &lt;element name="windGustSpeedOperator" type="{http://icao.int/iwxxm/2021-2}RelationalOperatorType" minOccurs="0"/&gt;
 *         &lt;element name="extremeClockwiseWindDirection" type="{http://icao.int/iwxxm/2021-2}AngleWithNilReasonType" minOccurs="0"/&gt;
 *         &lt;element name="extremeCounterClockwiseWindDirection" type="{http://icao.int/iwxxm/2021-2}AngleWithNilReasonType" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/2021-2}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="variableWindDirection" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeSurfaceWindType", propOrder = {
    "meanWindDirection",
    "meanWindSpeed",
    "meanWindSpeedOperator",
    "windGustSpeed",
    "windGustSpeedOperator",
    "extremeClockwiseWindDirection",
    "extremeCounterClockwiseWindDirection",
    "extension"
})
public class AerodromeSurfaceWindType {

    @XmlElementRef(name = "meanWindDirection", namespace = "http://icao.int/iwxxm/2021-2", type = JAXBElement.class, required = false)
    protected JAXBElement<AngleWithNilReasonType> meanWindDirection;
    @XmlElement(required = true, nillable = true)
    protected VelocityWithNilReasonType meanWindSpeed;
    @XmlElementRef(name = "meanWindSpeedOperator", namespace = "http://icao.int/iwxxm/2021-2", type = JAXBElement.class, required = false)
    protected JAXBElement<RelationalOperatorType> meanWindSpeedOperator;
    @XmlElementRef(name = "windGustSpeed", namespace = "http://icao.int/iwxxm/2021-2", type = JAXBElement.class, required = false)
    protected JAXBElement<VelocityWithNilReasonType> windGustSpeed;
    @XmlElementRef(name = "windGustSpeedOperator", namespace = "http://icao.int/iwxxm/2021-2", type = JAXBElement.class, required = false)
    protected JAXBElement<RelationalOperatorType> windGustSpeedOperator;
    @XmlElementRef(name = "extremeClockwiseWindDirection", namespace = "http://icao.int/iwxxm/2021-2", type = JAXBElement.class, required = false)
    protected JAXBElement<AngleWithNilReasonType> extremeClockwiseWindDirection;
    @XmlElementRef(name = "extremeCounterClockwiseWindDirection", namespace = "http://icao.int/iwxxm/2021-2", type = JAXBElement.class, required = false)
    protected JAXBElement<AngleWithNilReasonType> extremeCounterClockwiseWindDirection;
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "variableWindDirection")
    protected Boolean variableWindDirection;

    /**
     * Gets the value of the meanWindDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AngleWithNilReasonType }{@code >}
     *     
     */
    public JAXBElement<AngleWithNilReasonType> getMeanWindDirection() {
        return meanWindDirection;
    }

    /**
     * Sets the value of the meanWindDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AngleWithNilReasonType }{@code >}
     *     
     */
    public void setMeanWindDirection(JAXBElement<AngleWithNilReasonType> value) {
        this.meanWindDirection = value;
    }

    /**
     * Gets the value of the meanWindSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityWithNilReasonType }
     *     
     */
    public VelocityWithNilReasonType getMeanWindSpeed() {
        return meanWindSpeed;
    }

    /**
     * Sets the value of the meanWindSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityWithNilReasonType }
     *     
     */
    public void setMeanWindSpeed(VelocityWithNilReasonType value) {
        this.meanWindSpeed = value;
    }

    /**
     * Gets the value of the meanWindSpeedOperator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelationalOperatorType }{@code >}
     *     
     */
    public JAXBElement<RelationalOperatorType> getMeanWindSpeedOperator() {
        return meanWindSpeedOperator;
    }

    /**
     * Sets the value of the meanWindSpeedOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelationalOperatorType }{@code >}
     *     
     */
    public void setMeanWindSpeedOperator(JAXBElement<RelationalOperatorType> value) {
        this.meanWindSpeedOperator = value;
    }

    /**
     * Gets the value of the windGustSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VelocityWithNilReasonType }{@code >}
     *     
     */
    public JAXBElement<VelocityWithNilReasonType> getWindGustSpeed() {
        return windGustSpeed;
    }

    /**
     * Sets the value of the windGustSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VelocityWithNilReasonType }{@code >}
     *     
     */
    public void setWindGustSpeed(JAXBElement<VelocityWithNilReasonType> value) {
        this.windGustSpeed = value;
    }

    /**
     * Gets the value of the windGustSpeedOperator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelationalOperatorType }{@code >}
     *     
     */
    public JAXBElement<RelationalOperatorType> getWindGustSpeedOperator() {
        return windGustSpeedOperator;
    }

    /**
     * Sets the value of the windGustSpeedOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelationalOperatorType }{@code >}
     *     
     */
    public void setWindGustSpeedOperator(JAXBElement<RelationalOperatorType> value) {
        this.windGustSpeedOperator = value;
    }

    /**
     * Gets the value of the extremeClockwiseWindDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AngleWithNilReasonType }{@code >}
     *     
     */
    public JAXBElement<AngleWithNilReasonType> getExtremeClockwiseWindDirection() {
        return extremeClockwiseWindDirection;
    }

    /**
     * Sets the value of the extremeClockwiseWindDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AngleWithNilReasonType }{@code >}
     *     
     */
    public void setExtremeClockwiseWindDirection(JAXBElement<AngleWithNilReasonType> value) {
        this.extremeClockwiseWindDirection = value;
    }

    /**
     * Gets the value of the extremeCounterClockwiseWindDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AngleWithNilReasonType }{@code >}
     *     
     */
    public JAXBElement<AngleWithNilReasonType> getExtremeCounterClockwiseWindDirection() {
        return extremeCounterClockwiseWindDirection;
    }

    /**
     * Sets the value of the extremeCounterClockwiseWindDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AngleWithNilReasonType }{@code >}
     *     
     */
    public void setExtremeCounterClockwiseWindDirection(JAXBElement<AngleWithNilReasonType> value) {
        this.extremeCounterClockwiseWindDirection = value;
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

    /**
     * Gets the value of the variableWindDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVariableWindDirection() {
        return variableWindDirection;
    }

    /**
     * Sets the value of the variableWindDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVariableWindDirection(Boolean value) {
        this.variableWindDirection = value;
    }

}
