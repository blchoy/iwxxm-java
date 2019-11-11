//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.08 at 04:16:07 AM UTC 
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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for MeteorologicalAerodromeTrendForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeteorologicalAerodromeTrendForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phenomenonTime" type="{http://icao.int/iwxxm/3.0}AbstractTimeObjectPropertyType"/&gt;
 *         &lt;element name="timeIndicator" type="{http://icao.int/iwxxm/3.0}TrendForecastTimeIndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="prevailingVisibility" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="prevailingVisibilityOperator" type="{http://icao.int/iwxxm/3.0}RelationalOperatorType" minOccurs="0"/&gt;
 *         &lt;element name="surfaceWind" type="{http://icao.int/iwxxm/3.0}AerodromeSurfaceWindTrendForecastPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="weather" type="{http://icao.int/iwxxm/3.0}AerodromeForecastWeatherType" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="cloud" type="{http://icao.int/iwxxm/3.0}AerodromeCloudForecastPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/3.0}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="changeIndicator" use="required" type="{http://icao.int/iwxxm/3.0}ForecastChangeIndicatorType" /&gt;
 *       &lt;attribute name="cloudAndVisibilityOK" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeteorologicalAerodromeTrendForecastType", propOrder = {
    "phenomenonTime",
    "timeIndicator",
    "prevailingVisibility",
    "prevailingVisibilityOperator",
    "surfaceWind",
    "weather",
    "cloud",
    "extension"
})
public class MeteorologicalAerodromeTrendForecastType
    extends AbstractGMLType
{

    @XmlElement(required = true)
    protected AbstractTimeObjectPropertyType phenomenonTime;
    @XmlSchemaType(name = "string")
    protected TrendForecastTimeIndicatorType timeIndicator;
    protected LengthType prevailingVisibility;
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType prevailingVisibilityOperator;
    protected AerodromeSurfaceWindTrendForecastPropertyType surfaceWind;
    @XmlElement(nillable = true)
    protected List<AerodromeForecastWeatherType> weather;
    @XmlElementRef(name = "cloud", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<AerodromeCloudForecastPropertyType> cloud;
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "changeIndicator", required = true)
    protected ForecastChangeIndicatorType changeIndicator;
    @XmlAttribute(name = "cloudAndVisibilityOK")
    protected Boolean cloudAndVisibilityOK;

    /**
     * Gets the value of the phenomenonTime property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractTimeObjectPropertyType }
     *     
     */
    public AbstractTimeObjectPropertyType getPhenomenonTime() {
        return phenomenonTime;
    }

    /**
     * Sets the value of the phenomenonTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractTimeObjectPropertyType }
     *     
     */
    public void setPhenomenonTime(AbstractTimeObjectPropertyType value) {
        this.phenomenonTime = value;
    }

    /**
     * Gets the value of the timeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TrendForecastTimeIndicatorType }
     *     
     */
    public TrendForecastTimeIndicatorType getTimeIndicator() {
        return timeIndicator;
    }

    /**
     * Sets the value of the timeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrendForecastTimeIndicatorType }
     *     
     */
    public void setTimeIndicator(TrendForecastTimeIndicatorType value) {
        this.timeIndicator = value;
    }

    /**
     * Gets the value of the prevailingVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getPrevailingVisibility() {
        return prevailingVisibility;
    }

    /**
     * Sets the value of the prevailingVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setPrevailingVisibility(LengthType value) {
        this.prevailingVisibility = value;
    }

    /**
     * Gets the value of the prevailingVisibilityOperator property.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getPrevailingVisibilityOperator() {
        return prevailingVisibilityOperator;
    }

    /**
     * Sets the value of the prevailingVisibilityOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setPrevailingVisibilityOperator(RelationalOperatorType value) {
        this.prevailingVisibilityOperator = value;
    }

    /**
     * Gets the value of the surfaceWind property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeSurfaceWindTrendForecastPropertyType }
     *     
     */
    public AerodromeSurfaceWindTrendForecastPropertyType getSurfaceWind() {
        return surfaceWind;
    }

    /**
     * Sets the value of the surfaceWind property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeSurfaceWindTrendForecastPropertyType }
     *     
     */
    public void setSurfaceWind(AerodromeSurfaceWindTrendForecastPropertyType value) {
        this.surfaceWind = value;
    }

    /**
     * Gets the value of the weather property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weather property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeather().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerodromeForecastWeatherType }
     * 
     * 
     */
    public List<AerodromeForecastWeatherType> getWeather() {
        if (weather == null) {
            weather = new ArrayList<AerodromeForecastWeatherType>();
        }
        return this.weather;
    }

    /**
     * Gets the value of the cloud property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AerodromeCloudForecastPropertyType }{@code >}
     *     
     */
    public JAXBElement<AerodromeCloudForecastPropertyType> getCloud() {
        return cloud;
    }

    /**
     * Sets the value of the cloud property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AerodromeCloudForecastPropertyType }{@code >}
     *     
     */
    public void setCloud(JAXBElement<AerodromeCloudForecastPropertyType> value) {
        this.cloud = value;
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
     * Gets the value of the changeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastChangeIndicatorType }
     *     
     */
    public ForecastChangeIndicatorType getChangeIndicator() {
        return changeIndicator;
    }

    /**
     * Sets the value of the changeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastChangeIndicatorType }
     *     
     */
    public void setChangeIndicator(ForecastChangeIndicatorType value) {
        this.changeIndicator = value;
    }

    /**
     * Gets the value of the cloudAndVisibilityOK property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCloudAndVisibilityOK() {
        return cloudAndVisibilityOK;
    }

    /**
     * Sets the value of the cloudAndVisibilityOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCloudAndVisibilityOK(Boolean value) {
        this.cloudAndVisibilityOK = value;
    }

}
