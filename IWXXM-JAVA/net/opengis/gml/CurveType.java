//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.22 at 02:50:00 PM HKT 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import icao.iwxxm.ElevatedCurveType;


/**
 * <p>Java class for CurveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurveType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCurveType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}segments"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveType", propOrder = {
    "segments"
})
@XmlSeeAlso({
    ElevatedCurveType.class,
    aero.aixm.CurveType.class
})
public class CurveType
    extends AbstractCurveType
{

    @XmlElement(required = true)
    protected CurveSegmentArrayPropertyType segments;

    /**
     * Gets the value of the segments property.
     * 
     * @return
     *     possible object is
     *     {@link CurveSegmentArrayPropertyType }
     *     
     */
    public CurveSegmentArrayPropertyType getSegments() {
        return segments;
    }

    /**
     * Sets the value of the segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveSegmentArrayPropertyType }
     *     
     */
    public void setSegments(CurveSegmentArrayPropertyType value) {
        this.segments = value;
    }

}
