//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.09 at 01:48:28 AM UTC 
//


package icao.iwxxm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.TimePeriodPropertyType;
import net.opengis.om.OMObservationPropertyType;


/**
 * <p>Java class for AIRMETType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AIRMETType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://icao.int/iwxxm/2.1}ReportType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="issuingAirTrafficServicesUnit" type="{http://icao.int/iwxxm/2.1}UnitPropertyType"/&gt;
 *         &lt;element name="originatingMeteorologicalWatchOffice" type="{http://icao.int/iwxxm/2.1}UnitPropertyType"/&gt;
 *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="validPeriod" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType"/&gt;
 *         &lt;element name="cancelledSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cancelledValidPeriod" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="phenomenon" type="{http://icao.int/iwxxm/2.1}AeronauticalAreaWeatherPhenomenonType"/&gt;
 *         &lt;element name="analysis" type="{http://www.opengis.net/om/2.0}OM_ObservationPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="status" use="required" type="{http://icao.int/iwxxm/2.1}AIRMETReportStatusType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AIRMETType", propOrder = {
    "issuingAirTrafficServicesUnit",
    "originatingMeteorologicalWatchOffice",
    "sequenceNumber",
    "validPeriod",
    "cancelledSequenceNumber",
    "cancelledValidPeriod",
    "phenomenon",
    "analysis",
    "extension"
})
public class AIRMETType
    extends ReportType
{

    @XmlElement(required = true)
    protected UnitPropertyType issuingAirTrafficServicesUnit;
    @XmlElement(required = true)
    protected UnitPropertyType originatingMeteorologicalWatchOffice;
    @XmlElement(required = true)
    protected String sequenceNumber;
    @XmlElement(required = true)
    protected TimePeriodPropertyType validPeriod;
    protected String cancelledSequenceNumber;
    protected TimePeriodPropertyType cancelledValidPeriod;
    @XmlElement(required = true)
    protected AeronauticalAreaWeatherPhenomenonType phenomenon;
    protected OMObservationPropertyType analysis;
    protected List<Object> extension;
    @XmlAttribute(name = "status", required = true)
    protected AIRMETReportStatusType status;

    /**
     * Gets the value of the issuingAirTrafficServicesUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPropertyType }
     *     
     */
    public UnitPropertyType getIssuingAirTrafficServicesUnit() {
        return issuingAirTrafficServicesUnit;
    }

    /**
     * Sets the value of the issuingAirTrafficServicesUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPropertyType }
     *     
     */
    public void setIssuingAirTrafficServicesUnit(UnitPropertyType value) {
        this.issuingAirTrafficServicesUnit = value;
    }

    /**
     * Gets the value of the originatingMeteorologicalWatchOffice property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPropertyType }
     *     
     */
    public UnitPropertyType getOriginatingMeteorologicalWatchOffice() {
        return originatingMeteorologicalWatchOffice;
    }

    /**
     * Sets the value of the originatingMeteorologicalWatchOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPropertyType }
     *     
     */
    public void setOriginatingMeteorologicalWatchOffice(UnitPropertyType value) {
        this.originatingMeteorologicalWatchOffice = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the validPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getValidPeriod() {
        return validPeriod;
    }

    /**
     * Sets the value of the validPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setValidPeriod(TimePeriodPropertyType value) {
        this.validPeriod = value;
    }

    /**
     * Gets the value of the cancelledSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelledSequenceNumber() {
        return cancelledSequenceNumber;
    }

    /**
     * Sets the value of the cancelledSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelledSequenceNumber(String value) {
        this.cancelledSequenceNumber = value;
    }

    /**
     * Gets the value of the cancelledValidPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getCancelledValidPeriod() {
        return cancelledValidPeriod;
    }

    /**
     * Sets the value of the cancelledValidPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setCancelledValidPeriod(TimePeriodPropertyType value) {
        this.cancelledValidPeriod = value;
    }

    /**
     * Gets the value of the phenomenon property.
     * 
     * @return
     *     possible object is
     *     {@link AeronauticalAreaWeatherPhenomenonType }
     *     
     */
    public AeronauticalAreaWeatherPhenomenonType getPhenomenon() {
        return phenomenon;
    }

    /**
     * Sets the value of the phenomenon property.
     * 
     * @param value
     *     allowed object is
     *     {@link AeronauticalAreaWeatherPhenomenonType }
     *     
     */
    public void setPhenomenon(AeronauticalAreaWeatherPhenomenonType value) {
        this.phenomenon = value;
    }

    /**
     * Gets the value of the analysis property.
     * 
     * @return
     *     possible object is
     *     {@link OMObservationPropertyType }
     *     
     */
    public OMObservationPropertyType getAnalysis() {
        return analysis;
    }

    /**
     * Sets the value of the analysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link OMObservationPropertyType }
     *     
     */
    public void setAnalysis(OMObservationPropertyType value) {
        this.analysis = value;
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
     * {@link Object }
     * 
     * 
     */
    public List<Object> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Object>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AIRMETReportStatusType }
     *     
     */
    public AIRMETReportStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIRMETReportStatusType }
     *     
     */
    public void setStatus(AIRMETReportStatusType value) {
        this.status = value;
    }

}
