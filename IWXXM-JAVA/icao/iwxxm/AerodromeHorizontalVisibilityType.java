//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.10 at 02:53:01 AM UTC 
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
 * <p>Java class for AerodromeHorizontalVisibilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeHorizontalVisibilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prevailingVisibility" type="{http://icao.int/iwxxm/3.0}DistanceWithNilReasonType"/&gt;
 *         &lt;element name="prevailingVisibilityOperator" type="{http://icao.int/iwxxm/3.0}RelationalOperatorType" minOccurs="0"/&gt;
 *         &lt;element name="minimumVisibility" type="{http://icao.int/iwxxm/3.0}DistanceWithNilReasonType" minOccurs="0"/&gt;
 *         &lt;element name="minimumVisibilityDirection" type="{http://icao.int/iwxxm/3.0}AngleWithNilReasonType" minOccurs="0"/&gt;
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
@XmlType(name = "AerodromeHorizontalVisibilityType", propOrder = {
    "prevailingVisibility",
    "prevailingVisibilityOperator",
    "minimumVisibility",
    "minimumVisibilityDirection",
    "extension"
})
public class AerodromeHorizontalVisibilityType {

    @XmlElement(required = true, nillable = true)
    protected DistanceWithNilReasonType prevailingVisibility;
    @XmlElementRef(name = "prevailingVisibilityOperator", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<RelationalOperatorType> prevailingVisibilityOperator;
    @XmlElementRef(name = "minimumVisibility", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceWithNilReasonType> minimumVisibility;
    @XmlElementRef(name = "minimumVisibilityDirection", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<AngleWithNilReasonType> minimumVisibilityDirection;
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the prevailingVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceWithNilReasonType }
     *     
     */
    public DistanceWithNilReasonType getPrevailingVisibility() {
        return prevailingVisibility;
    }

    /**
     * Sets the value of the prevailingVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceWithNilReasonType }
     *     
     */
    public void setPrevailingVisibility(DistanceWithNilReasonType value) {
        this.prevailingVisibility = value;
    }

    /**
     * Gets the value of the prevailingVisibilityOperator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelationalOperatorType }{@code >}
     *     
     */
    public JAXBElement<RelationalOperatorType> getPrevailingVisibilityOperator() {
        return prevailingVisibilityOperator;
    }

    /**
     * Sets the value of the prevailingVisibilityOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelationalOperatorType }{@code >}
     *     
     */
    public void setPrevailingVisibilityOperator(JAXBElement<RelationalOperatorType> value) {
        this.prevailingVisibilityOperator = value;
    }

    /**
     * Gets the value of the minimumVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceWithNilReasonType }{@code >}
     *     
     */
    public JAXBElement<DistanceWithNilReasonType> getMinimumVisibility() {
        return minimumVisibility;
    }

    /**
     * Sets the value of the minimumVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceWithNilReasonType }{@code >}
     *     
     */
    public void setMinimumVisibility(JAXBElement<DistanceWithNilReasonType> value) {
        this.minimumVisibility = value;
    }

    /**
     * Gets the value of the minimumVisibilityDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AngleWithNilReasonType }{@code >}
     *     
     */
    public JAXBElement<AngleWithNilReasonType> getMinimumVisibilityDirection() {
        return minimumVisibilityDirection;
    }

    /**
     * Sets the value of the minimumVisibilityDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AngleWithNilReasonType }{@code >}
     *     
     */
    public void setMinimumVisibilityDirection(JAXBElement<AngleWithNilReasonType> value) {
        this.minimumVisibilityDirection = value;
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
