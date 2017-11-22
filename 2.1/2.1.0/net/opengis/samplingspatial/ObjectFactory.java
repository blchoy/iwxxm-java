//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 10:49:53 AM HKT 
//


package net.opengis.samplingspatial;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.opengis.samplingspatial package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Shape_QNAME = new QName("http://www.opengis.net/samplingSpatial/2.0", "shape");
    private final static QName _SFSpatialSamplingFeature_QNAME = new QName("http://www.opengis.net/samplingSpatial/2.0", "SF_SpatialSamplingFeature");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.opengis.samplingspatial
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShapeType }
     * 
     */
    public ShapeType createShapeType() {
        return new ShapeType();
    }

    /**
     * Create an instance of {@link SFSpatialSamplingFeatureType }
     * 
     */
    public SFSpatialSamplingFeatureType createSFSpatialSamplingFeatureType() {
        return new SFSpatialSamplingFeatureType();
    }

    /**
     * Create an instance of {@link SFSpatialSamplingFeaturePropertyType }
     * 
     */
    public SFSpatialSamplingFeaturePropertyType createSFSpatialSamplingFeaturePropertyType() {
        return new SFSpatialSamplingFeaturePropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShapeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/samplingSpatial/2.0", name = "shape")
    public JAXBElement<ShapeType> createShape(ShapeType value) {
        return new JAXBElement<ShapeType>(_Shape_QNAME, ShapeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SFSpatialSamplingFeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/samplingSpatial/2.0", name = "SF_SpatialSamplingFeature", substitutionHeadNamespace = "http://www.opengis.net/sampling/2.0", substitutionHeadName = "SF_SamplingFeature")
    public JAXBElement<SFSpatialSamplingFeatureType> createSFSpatialSamplingFeature(SFSpatialSamplingFeatureType value) {
        return new JAXBElement<SFSpatialSamplingFeatureType>(_SFSpatialSamplingFeature_QNAME, SFSpatialSamplingFeatureType.class, null, value);
    }

}