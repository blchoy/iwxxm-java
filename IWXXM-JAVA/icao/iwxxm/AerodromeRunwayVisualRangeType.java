//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.22 at 02:50:00 PM HKT 
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
 * <p>Java class for AerodromeRunwayVisualRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeRunwayVisualRangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="runway" type="{http://icao.int/iwxxm/2023-1}RunwayDirectionPropertyType"/&gt;
 *         &lt;element name="meanRVR" type="{http://icao.int/iwxxm/2023-1}DistanceWithNilReasonType"/&gt;
 *         &lt;element name="meanRVROperator" type="{http://icao.int/iwxxm/2023-1}RelationalOperatorType" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/2023-1}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="pastTendency" type="{http://icao.int/iwxxm/2023-1}VisualRangeTendencyType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeRunwayVisualRangeType", propOrder = {
    "runway",
    "meanRVR",
    "meanRVROperator",
    "extension"
})
public class AerodromeRunwayVisualRangeType {

    @XmlElement(required = true, nillable = true)
    protected RunwayDirectionPropertyType runway;
    @XmlElement(required = true, nillable = true)
    protected DistanceWithNilReasonType meanRVR;
    @XmlElementRef(name = "meanRVROperator", namespace = "http://icao.int/iwxxm/2023-1", type = JAXBElement.class, required = false)
    protected JAXBElement<RelationalOperatorType> meanRVROperator;
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "pastTendency")
    protected VisualRangeTendencyType pastTendency;

    /**
     * Gets the value of the runway property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayDirectionPropertyType }
     *     
     */
    public RunwayDirectionPropertyType getRunway() {
        return runway;
    }

    /**
     * Sets the value of the runway property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayDirectionPropertyType }
     *     
     */
    public void setRunway(RunwayDirectionPropertyType value) {
        this.runway = value;
    }

    /**
     * Gets the value of the meanRVR property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceWithNilReasonType }
     *     
     */
    public DistanceWithNilReasonType getMeanRVR() {
        return meanRVR;
    }

    /**
     * Sets the value of the meanRVR property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceWithNilReasonType }
     *     
     */
    public void setMeanRVR(DistanceWithNilReasonType value) {
        this.meanRVR = value;
    }

    /**
     * Gets the value of the meanRVROperator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelationalOperatorType }{@code >}
     *     
     */
    public JAXBElement<RelationalOperatorType> getMeanRVROperator() {
        return meanRVROperator;
    }

    /**
     * Sets the value of the meanRVROperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelationalOperatorType }{@code >}
     *     
     */
    public void setMeanRVROperator(JAXBElement<RelationalOperatorType> value) {
        this.meanRVROperator = value;
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
     * Gets the value of the pastTendency property.
     * 
     * @return
     *     possible object is
     *     {@link VisualRangeTendencyType }
     *     
     */
    public VisualRangeTendencyType getPastTendency() {
        return pastTendency;
    }

    /**
     * Sets the value of the pastTendency property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisualRangeTendencyType }
     *     
     */
    public void setPastTendency(VisualRangeTendencyType value) {
        this.pastTendency = value;
    }

}
