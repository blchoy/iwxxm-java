//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.10 at 05:15:57 PM HKT 
//


package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import icao.iwxxm.ElevatedSurfaceType;
import icao.iwxxm.ElevatedVolumeType;


/**
 * <p>Java class for SurfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractSurfaceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}patches"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceType", propOrder = {
    "patches"
})
@XmlSeeAlso({
    ElevatedSurfaceType.class,
    ElevatedVolumeType.class,
    TinType.class,
    aero.aixm.SurfaceType.class
})
public class SurfaceType
    extends AbstractSurfaceType
{

    @XmlElementRef(name = "patches", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<SurfacePatchArrayPropertyType> patches;

    /**
     * Gets the value of the patches property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
     *     
     */
    public JAXBElement<SurfacePatchArrayPropertyType> getPatches() {
        return patches;
    }

    /**
     * Sets the value of the patches property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
     *     
     */
    public void setPatches(JAXBElement<SurfacePatchArrayPropertyType> value) {
        this.patches = value;
    }

}
