//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.09 at 01:48:28 AM UTC 
//


package org.isotc211.gmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MD_TopicCategoryCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MD_TopicCategoryCode_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="farming"/&gt;
 *     &lt;enumeration value="biota"/&gt;
 *     &lt;enumeration value="boundaries"/&gt;
 *     &lt;enumeration value="climatologyMeteorologyAtmosphere"/&gt;
 *     &lt;enumeration value="economy"/&gt;
 *     &lt;enumeration value="elevation"/&gt;
 *     &lt;enumeration value="environment"/&gt;
 *     &lt;enumeration value="geoscientificInformation"/&gt;
 *     &lt;enumeration value="health"/&gt;
 *     &lt;enumeration value="imageryBaseMapsEarthCover"/&gt;
 *     &lt;enumeration value="intelligenceMilitary"/&gt;
 *     &lt;enumeration value="inlandWaters"/&gt;
 *     &lt;enumeration value="location"/&gt;
 *     &lt;enumeration value="oceans"/&gt;
 *     &lt;enumeration value="planningCadastre"/&gt;
 *     &lt;enumeration value="society"/&gt;
 *     &lt;enumeration value="structure"/&gt;
 *     &lt;enumeration value="transportation"/&gt;
 *     &lt;enumeration value="utilitiesCommunication"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MD_TopicCategoryCode_Type")
@XmlEnum
public enum MDTopicCategoryCodeType {

    @XmlEnumValue("farming")
    FARMING("farming"),
    @XmlEnumValue("biota")
    BIOTA("biota"),
    @XmlEnumValue("boundaries")
    BOUNDARIES("boundaries"),
    @XmlEnumValue("climatologyMeteorologyAtmosphere")
    CLIMATOLOGY_METEOROLOGY_ATMOSPHERE("climatologyMeteorologyAtmosphere"),
    @XmlEnumValue("economy")
    ECONOMY("economy"),
    @XmlEnumValue("elevation")
    ELEVATION("elevation"),
    @XmlEnumValue("environment")
    ENVIRONMENT("environment"),
    @XmlEnumValue("geoscientificInformation")
    GEOSCIENTIFIC_INFORMATION("geoscientificInformation"),
    @XmlEnumValue("health")
    HEALTH("health"),
    @XmlEnumValue("imageryBaseMapsEarthCover")
    IMAGERY_BASE_MAPS_EARTH_COVER("imageryBaseMapsEarthCover"),
    @XmlEnumValue("intelligenceMilitary")
    INTELLIGENCE_MILITARY("intelligenceMilitary"),
    @XmlEnumValue("inlandWaters")
    INLAND_WATERS("inlandWaters"),
    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("oceans")
    OCEANS("oceans"),
    @XmlEnumValue("planningCadastre")
    PLANNING_CADASTRE("planningCadastre"),
    @XmlEnumValue("society")
    SOCIETY("society"),
    @XmlEnumValue("structure")
    STRUCTURE("structure"),
    @XmlEnumValue("transportation")
    TRANSPORTATION("transportation"),
    @XmlEnumValue("utilitiesCommunication")
    UTILITIES_COMMUNICATION("utilitiesCommunication");
    private final String value;

    MDTopicCategoryCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MDTopicCategoryCodeType fromValue(String v) {
        for (MDTopicCategoryCodeType c: MDTopicCategoryCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
