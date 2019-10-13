//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.09 at 01:48:28 AM UTC 
//


package def.wmo.opm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeBoundsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeBoundsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rangeStart" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="rangeEnd" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="endComparison" use="required" type="{http://def.wmo.int/opm/2013}ComparisonOperatorType" /&gt;
 *       &lt;attribute name="startComparison" use="required" type="{http://def.wmo.int/opm/2013}ComparisonOperatorType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeBoundsType", propOrder = {
    "rangeStart",
    "rangeEnd"
})
public class RangeBoundsType {

    protected double rangeStart;
    protected double rangeEnd;
    @XmlAttribute(name = "endComparison", required = true)
    protected ComparisonOperatorType endComparison;
    @XmlAttribute(name = "startComparison", required = true)
    protected ComparisonOperatorType startComparison;

    /**
     * Gets the value of the rangeStart property.
     * 
     */
    public double getRangeStart() {
        return rangeStart;
    }

    /**
     * Sets the value of the rangeStart property.
     * 
     */
    public void setRangeStart(double value) {
        this.rangeStart = value;
    }

    /**
     * Gets the value of the rangeEnd property.
     * 
     */
    public double getRangeEnd() {
        return rangeEnd;
    }

    /**
     * Sets the value of the rangeEnd property.
     * 
     */
    public void setRangeEnd(double value) {
        this.rangeEnd = value;
    }

    /**
     * Gets the value of the endComparison property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorType }
     *     
     */
    public ComparisonOperatorType getEndComparison() {
        return endComparison;
    }

    /**
     * Sets the value of the endComparison property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorType }
     *     
     */
    public void setEndComparison(ComparisonOperatorType value) {
        this.endComparison = value;
    }

    /**
     * Gets the value of the startComparison property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorType }
     *     
     */
    public ComparisonOperatorType getStartComparison() {
        return startComparison;
    }

    /**
     * Sets the value of the startComparison property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorType }
     *     
     */
    public void setStartComparison(ComparisonOperatorType value) {
        this.startComparison = value;
    }

}
