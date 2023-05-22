//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.22 at 02:50:00 PM HKT 
//


package icao.iwxxm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.TimeInstantPropertyType;
import net.opengis.gml.TimePeriodPropertyType;


/**
 * <p>Java class for TAFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAFType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://icao.int/iwxxm/2023-1}ReportType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="issueTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/&gt;
 *         &lt;element name="aerodrome" type="{http://icao.int/iwxxm/2023-1}AirportHeliportPropertyType"/&gt;
 *         &lt;element name="validPeriod" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="cancelledReportValidPeriod" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="baseForecast" type="{http://icao.int/iwxxm/2023-1}MeteorologicalAerodromeForecastPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="changeForecast" type="{http://icao.int/iwxxm/2023-1}MeteorologicalAerodromeForecastPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/2023-1}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TAFType", propOrder = {
    "issueTime",
    "aerodrome",
    "validPeriod",
    "cancelledReportValidPeriod",
    "baseForecast",
    "changeForecast",
    "extension"
})
public class TAFType
    extends ReportType
{

    @XmlElement(required = true)
    protected TimeInstantPropertyType issueTime;
    @XmlElement(required = true)
    protected AirportHeliportPropertyType aerodrome;
    protected TimePeriodPropertyType validPeriod;
    protected TimePeriodPropertyType cancelledReportValidPeriod;
    protected MeteorologicalAerodromeForecastPropertyType baseForecast;
    protected List<MeteorologicalAerodromeForecastPropertyType> changeForecast;
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
     * Gets the value of the aerodrome property.
     * 
     * @return
     *     possible object is
     *     {@link AirportHeliportPropertyType }
     *     
     */
    public AirportHeliportPropertyType getAerodrome() {
        return aerodrome;
    }

    /**
     * Sets the value of the aerodrome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportHeliportPropertyType }
     *     
     */
    public void setAerodrome(AirportHeliportPropertyType value) {
        this.aerodrome = value;
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
     * Gets the value of the baseForecast property.
     * 
     * @return
     *     possible object is
     *     {@link MeteorologicalAerodromeForecastPropertyType }
     *     
     */
    public MeteorologicalAerodromeForecastPropertyType getBaseForecast() {
        return baseForecast;
    }

    /**
     * Sets the value of the baseForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteorologicalAerodromeForecastPropertyType }
     *     
     */
    public void setBaseForecast(MeteorologicalAerodromeForecastPropertyType value) {
        this.baseForecast = value;
    }

    /**
     * Gets the value of the changeForecast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeForecast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeForecast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeteorologicalAerodromeForecastPropertyType }
     * 
     * 
     */
    public List<MeteorologicalAerodromeForecastPropertyType> getChangeForecast() {
        if (changeForecast == null) {
            changeForecast = new ArrayList<MeteorologicalAerodromeForecastPropertyType>();
        }
        return this.changeForecast;
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
