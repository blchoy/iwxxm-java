//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.10 at 02:53:01 AM UTC 
//


package icao.iwxxm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AssociationRoleType;
import net.opengis.gml.TimeInstantPropertyType;
import net.opengis.gml.TimePeriodPropertyType;


/**
 * <p>Java class for SIGMETType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIGMETType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://icao.int/iwxxm/3.0}ReportType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="issueTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/&gt;
 *         &lt;element name="issuingAirTrafficServicesUnit" type="{http://icao.int/iwxxm/3.0}UnitPropertyType"/&gt;
 *         &lt;element name="originatingMeteorologicalWatchOffice" type="{http://icao.int/iwxxm/3.0}UnitPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="issuingAirTrafficServicesRegion" type="{http://icao.int/iwxxm/3.0}AirspacePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="sequenceNumber" type="{http://icao.int/iwxxm/3.0}StringWithNilReasonType" minOccurs="0"/&gt;
 *         &lt;element name="validPeriod" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType"/&gt;
 *         &lt;element name="cancelledReportSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cancelledReportValidPeriod" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="phenomenon" type="{http://icao.int/iwxxm/3.0}AeronauticalSignificantWeatherPhenomenonType" minOccurs="0"/&gt;
 *         &lt;element name="analysis" type="{http://www.opengis.net/gml/3.2}AssociationRoleType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="forecastPositionAnalysis" type="{http://www.opengis.net/gml/3.2}AssociationRoleType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/3.0}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isCancelReport" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIGMETType", propOrder = {
    "issueTime",
    "issuingAirTrafficServicesUnit",
    "originatingMeteorologicalWatchOffice",
    "issuingAirTrafficServicesRegion",
    "sequenceNumber",
    "validPeriod",
    "cancelledReportSequenceNumber",
    "cancelledReportValidPeriod",
    "phenomenon",
    "analysis",
    "forecastPositionAnalysis",
    "extension"
})
@XmlSeeAlso({
    TropicalCycloneSIGMETType.class,
    VolcanicAshSIGMETType.class
})
public class SIGMETType
    extends ReportType
{

    @XmlElement(required = true)
    protected TimeInstantPropertyType issueTime;
    @XmlElement(required = true)
    protected UnitPropertyType issuingAirTrafficServicesUnit;
    protected UnitPropertyType originatingMeteorologicalWatchOffice;
    protected AirspacePropertyType issuingAirTrafficServicesRegion;
    protected StringWithNilReasonType sequenceNumber;
    @XmlElement(required = true)
    protected TimePeriodPropertyType validPeriod;
    protected String cancelledReportSequenceNumber;
    protected TimePeriodPropertyType cancelledReportValidPeriod;
    protected AeronauticalSignificantWeatherPhenomenonType phenomenon;
    protected List<AssociationRoleType> analysis;
    protected List<AssociationRoleType> forecastPositionAnalysis;
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "isCancelReport")
    protected Boolean isCancelReport;

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
     * Gets the value of the issuingAirTrafficServicesRegion property.
     * 
     * @return
     *     possible object is
     *     {@link AirspacePropertyType }
     *     
     */
    public AirspacePropertyType getIssuingAirTrafficServicesRegion() {
        return issuingAirTrafficServicesRegion;
    }

    /**
     * Sets the value of the issuingAirTrafficServicesRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspacePropertyType }
     *     
     */
    public void setIssuingAirTrafficServicesRegion(AirspacePropertyType value) {
        this.issuingAirTrafficServicesRegion = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link StringWithNilReasonType }
     *     
     */
    public StringWithNilReasonType getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringWithNilReasonType }
     *     
     */
    public void setSequenceNumber(StringWithNilReasonType value) {
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
     * Gets the value of the cancelledReportSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelledReportSequenceNumber() {
        return cancelledReportSequenceNumber;
    }

    /**
     * Sets the value of the cancelledReportSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelledReportSequenceNumber(String value) {
        this.cancelledReportSequenceNumber = value;
    }

    /**
     * Gets the value of the cancelledReportValidPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getCancelledReportValidPeriod() {
        return cancelledReportValidPeriod;
    }

    /**
     * Sets the value of the cancelledReportValidPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setCancelledReportValidPeriod(TimePeriodPropertyType value) {
        this.cancelledReportValidPeriod = value;
    }

    /**
     * Gets the value of the phenomenon property.
     * 
     * @return
     *     possible object is
     *     {@link AeronauticalSignificantWeatherPhenomenonType }
     *     
     */
    public AeronauticalSignificantWeatherPhenomenonType getPhenomenon() {
        return phenomenon;
    }

    /**
     * Sets the value of the phenomenon property.
     * 
     * @param value
     *     allowed object is
     *     {@link AeronauticalSignificantWeatherPhenomenonType }
     *     
     */
    public void setPhenomenon(AeronauticalSignificantWeatherPhenomenonType value) {
        this.phenomenon = value;
    }

    /**
     * Gets the value of the analysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationRoleType }
     * 
     * 
     */
    public List<AssociationRoleType> getAnalysis() {
        if (analysis == null) {
            analysis = new ArrayList<AssociationRoleType>();
        }
        return this.analysis;
    }

    /**
     * Gets the value of the forecastPositionAnalysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastPositionAnalysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastPositionAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationRoleType }
     * 
     * 
     */
    public List<AssociationRoleType> getForecastPositionAnalysis() {
        if (forecastPositionAnalysis == null) {
            forecastPositionAnalysis = new ArrayList<AssociationRoleType>();
        }
        return this.forecastPositionAnalysis;
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
     * Gets the value of the isCancelReport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCancelReport() {
        return isCancelReport;
    }

    /**
     * Sets the value of the isCancelReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancelReport(Boolean value) {
        this.isCancelReport = value;
    }

}
