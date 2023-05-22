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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import def.wmo.metce.TropicalCyclonePropertyType;
import net.opengis.gml.TimeInstantPropertyType;


/**
 * <p>Java class for TropicalCycloneAdvisoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TropicalCycloneAdvisoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://icao.int/iwxxm/2023-1}ReportType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="issueTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/&gt;
 *         &lt;element name="issuingTropicalCycloneAdvisoryCentre" type="{http://icao.int/iwxxm/2023-1}UnitPropertyType"/&gt;
 *         &lt;element name="tropicalCycloneName" type="{http://def.wmo.int/metce/2013}TropicalCyclonePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="advisoryNumber" type="{http://icao.int/iwxxm/2023-1}StringWithNilReasonType" minOccurs="0"/&gt;
 *         &lt;element name="observation" type="{http://icao.int/iwxxm/2023-1}TropicalCycloneObservedConditionsPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="forecast" type="{http://icao.int/iwxxm/2023-1}TropicalCycloneForecastConditionsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="remarks" type="{http://icao.int/iwxxm/2023-1}StringWithNilReasonType" minOccurs="0"/&gt;
 *         &lt;element name="nextAdvisoryTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/2023-1}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TropicalCycloneAdvisoryType", propOrder = {
    "issueTime",
    "issuingTropicalCycloneAdvisoryCentre",
    "tropicalCycloneName",
    "advisoryNumber",
    "observation",
    "forecast",
    "remarks",
    "nextAdvisoryTime",
    "extension"
})
public class TropicalCycloneAdvisoryType
    extends ReportType
{

    @XmlElement(required = true)
    protected TimeInstantPropertyType issueTime;
    @XmlElement(required = true)
    protected UnitPropertyType issuingTropicalCycloneAdvisoryCentre;
    protected TropicalCyclonePropertyType tropicalCycloneName;
    @XmlElementRef(name = "advisoryNumber", namespace = "http://icao.int/iwxxm/2023-1", type = JAXBElement.class, required = false)
    protected JAXBElement<StringWithNilReasonType> advisoryNumber;
    protected TropicalCycloneObservedConditionsPropertyType observation;
    protected List<TropicalCycloneForecastConditionsPropertyType> forecast;
    @XmlElementRef(name = "remarks", namespace = "http://icao.int/iwxxm/2023-1", type = JAXBElement.class, required = false)
    protected JAXBElement<StringWithNilReasonType> remarks;
    protected TimeInstantPropertyType nextAdvisoryTime;
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the issueTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getIssueTime() {
        return issueTime;
    }

    /**
     * Sets the value of the issueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setIssueTime(TimeInstantPropertyType value) {
        this.issueTime = value;
    }

    /**
     * Gets the value of the issuingTropicalCycloneAdvisoryCentre property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPropertyType }
     *     
     */
    public UnitPropertyType getIssuingTropicalCycloneAdvisoryCentre() {
        return issuingTropicalCycloneAdvisoryCentre;
    }

    /**
     * Sets the value of the issuingTropicalCycloneAdvisoryCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPropertyType }
     *     
     */
    public void setIssuingTropicalCycloneAdvisoryCentre(UnitPropertyType value) {
        this.issuingTropicalCycloneAdvisoryCentre = value;
    }

    /**
     * Gets the value of the tropicalCycloneName property.
     * 
     * @return
     *     possible object is
     *     {@link TropicalCyclonePropertyType }
     *     
     */
    public TropicalCyclonePropertyType getTropicalCycloneName() {
        return tropicalCycloneName;
    }

    /**
     * Sets the value of the tropicalCycloneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TropicalCyclonePropertyType }
     *     
     */
    public void setTropicalCycloneName(TropicalCyclonePropertyType value) {
        this.tropicalCycloneName = value;
    }

    /**
     * Gets the value of the advisoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringWithNilReasonType }{@code >}
     *     
     */
    public JAXBElement<StringWithNilReasonType> getAdvisoryNumber() {
        return advisoryNumber;
    }

    /**
     * Sets the value of the advisoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringWithNilReasonType }{@code >}
     *     
     */
    public void setAdvisoryNumber(JAXBElement<StringWithNilReasonType> value) {
        this.advisoryNumber = value;
    }

    /**
     * Gets the value of the observation property.
     * 
     * @return
     *     possible object is
     *     {@link TropicalCycloneObservedConditionsPropertyType }
     *     
     */
    public TropicalCycloneObservedConditionsPropertyType getObservation() {
        return observation;
    }

    /**
     * Sets the value of the observation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TropicalCycloneObservedConditionsPropertyType }
     *     
     */
    public void setObservation(TropicalCycloneObservedConditionsPropertyType value) {
        this.observation = value;
    }

    /**
     * Gets the value of the forecast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TropicalCycloneForecastConditionsPropertyType }
     * 
     * 
     */
    public List<TropicalCycloneForecastConditionsPropertyType> getForecast() {
        if (forecast == null) {
            forecast = new ArrayList<TropicalCycloneForecastConditionsPropertyType>();
        }
        return this.forecast;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringWithNilReasonType }{@code >}
     *     
     */
    public JAXBElement<StringWithNilReasonType> getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringWithNilReasonType }{@code >}
     *     
     */
    public void setRemarks(JAXBElement<StringWithNilReasonType> value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the nextAdvisoryTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getNextAdvisoryTime() {
        return nextAdvisoryTime;
    }

    /**
     * Sets the value of the nextAdvisoryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setNextAdvisoryTime(TimeInstantPropertyType value) {
        this.nextAdvisoryTime = value;
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
