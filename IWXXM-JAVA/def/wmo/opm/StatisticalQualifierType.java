//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 10:49:53 AM HKT 
//


package def.wmo.opm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import net.opengis.gml.AreaType;
import net.opengis.gml.AssociationRoleType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.VolumeType;


/**
 * <p>Java class for StatisticalQualifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatisticalQualifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aggregationArea" type="{http://www.opengis.net/gml/3.2}AreaType" minOccurs="0"/&gt;
 *         &lt;element name="aggregationLength" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="aggregationTimePeriod" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="aggregationVolume" type="{http://www.opengis.net/gml/3.2}VolumeType" minOccurs="0"/&gt;
 *         &lt;element name="otherAggregation" type="{http://www.opengis.net/gml/3.2}AssociationRoleType" minOccurs="0"/&gt;
 *         &lt;element name="statisticalFunction" type="{http://www.opengis.net/gml/3.2}CodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticalQualifierType", propOrder = {
    "description",
    "aggregationArea",
    "aggregationLength",
    "aggregationTimePeriod",
    "aggregationVolume",
    "otherAggregation",
    "statisticalFunction"
})
public class StatisticalQualifierType {

    protected String description;
    protected AreaType aggregationArea;
    protected LengthType aggregationLength;
    protected Duration aggregationTimePeriod;
    protected VolumeType aggregationVolume;
    protected AssociationRoleType otherAggregation;
    @XmlElement(required = true)
    protected CodeType statisticalFunction;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the aggregationArea property.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getAggregationArea() {
        return aggregationArea;
    }

    /**
     * Sets the value of the aggregationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setAggregationArea(AreaType value) {
        this.aggregationArea = value;
    }

    /**
     * Gets the value of the aggregationLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getAggregationLength() {
        return aggregationLength;
    }

    /**
     * Sets the value of the aggregationLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setAggregationLength(LengthType value) {
        this.aggregationLength = value;
    }

    /**
     * Gets the value of the aggregationTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAggregationTimePeriod() {
        return aggregationTimePeriod;
    }

    /**
     * Sets the value of the aggregationTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAggregationTimePeriod(Duration value) {
        this.aggregationTimePeriod = value;
    }

    /**
     * Gets the value of the aggregationVolume property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getAggregationVolume() {
        return aggregationVolume;
    }

    /**
     * Sets the value of the aggregationVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setAggregationVolume(VolumeType value) {
        this.aggregationVolume = value;
    }

    /**
     * Gets the value of the otherAggregation property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationRoleType }
     *     
     */
    public AssociationRoleType getOtherAggregation() {
        return otherAggregation;
    }

    /**
     * Sets the value of the otherAggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationRoleType }
     *     
     */
    public void setOtherAggregation(AssociationRoleType value) {
        this.otherAggregation = value;
    }

    /**
     * Gets the value of the statisticalFunction property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStatisticalFunction() {
        return statisticalFunction;
    }

    /**
     * Sets the value of the statisticalFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStatisticalFunction(CodeType value) {
        this.statisticalFunction = value;
    }

}
