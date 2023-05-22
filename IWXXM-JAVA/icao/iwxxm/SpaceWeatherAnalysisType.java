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
import net.opengis.gml.AbstractFeatureType;


/**
 * <p>Java class for SpaceWeatherAnalysisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpaceWeatherAnalysisType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phenomenonTime" type="{http://icao.int/iwxxm/2023-1}AbstractTimeObjectPropertyType"/&gt;
 *         &lt;element name="region" type="{http://icao.int/iwxxm/2023-1}SpaceWeatherRegionPropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/2023-1}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="timeIndicator" use="required" type="{http://icao.int/iwxxm/2023-1}TimeIndicatorType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpaceWeatherAnalysisType", propOrder = {
    "phenomenonTime",
    "region",
    "extension"
})
public class SpaceWeatherAnalysisType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected AbstractTimeObjectPropertyType phenomenonTime;
    @XmlElement(required = true)
    protected List<SpaceWeatherRegionPropertyType> region;
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "timeIndicator", required = true)
    protected TimeIndicatorType timeIndicator;

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
     * Gets the value of the region property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the region property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpaceWeatherRegionPropertyType }
     * 
     * 
     */
    public List<SpaceWeatherRegionPropertyType> getRegion() {
        if (region == null) {
            region = new ArrayList<SpaceWeatherRegionPropertyType>();
        }
        return this.region;
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
     * Gets the value of the timeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TimeIndicatorType }
     *     
     */
    public TimeIndicatorType getTimeIndicator() {
        return timeIndicator;
    }

    /**
     * Sets the value of the timeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIndicatorType }
     *     
     */
    public void setTimeIndicator(TimeIndicatorType value) {
        this.timeIndicator = value;
    }

}
